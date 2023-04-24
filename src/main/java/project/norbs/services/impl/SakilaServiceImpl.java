package project.norbs.services.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import project.norbs.dto.ActorDTO;
import project.norbs.mapper.ActorMapper;
import project.norbs.mapper.DaoActorMapper;
import project.norbs.model.ActorModel;
import project.norbs.services.iface.SakilaService;
import java.util.*;



@Service
@Slf4j
public class SakilaServiceImpl implements SakilaService {

    @Resource
    private ActorMapper actorMapper;

    @Resource
    private DaoActorMapper daoActorMapper;

    @Override
    public PageInfo<ActorModel> getAllActor() {
        ActorDTO dto = new ActorDTO();
        PageHelper.startPage(dto.getPageNum(),dto.getPageSize());
        List<ActorModel> list = actorMapper.getAllActor();

        if (CollectionUtils.isEmpty(list)) {
            return new PageInfo<>(Collections.emptyList());
        }

        PageInfo<ActorModel> pageInfo = new PageInfo<>(list);
        pageInfo.setTotal( ((Page<ActorModel>)list).getTotal() );
        pageInfo.setPageNum(dto.getPageNum());
        pageInfo.setSize(dto.getPageSize());

        return pageInfo;
    //    return new PageInfo<> (Optional.ofNullable(list).orElse(Collections.EMPTY_LIST));
    }

    @Override
    public PageInfo<ActorModel> getActorList(ActorDTO actorDTO) {
        PageHelper.startPage(actorDTO.getPageNum(),actorDTO.getPageSize());
        List<ActorModel> list = actorMapper.getActorList(actorDTO);

        if (CollectionUtils.isEmpty(list)) {
            return new PageInfo<>(Collections.emptyList());
        }

        PageInfo<ActorModel> pageInfo = new PageInfo<>(list);
        pageInfo.setTotal( ((Page<ActorModel>)list).getTotal() );
        pageInfo.setPageNum(actorDTO.getPageNum());
        pageInfo.setSize(actorDTO.getPageSize());

        return pageInfo;
    }

    @Override
    public List<ActorModel> getActorListNoPage(ActorDTO actorDTO) {

        QueryWrapper<ActorModel> wrapper = new QueryWrapper();
        wrapper.apply(String.format("a.actor_id not in (%s)", "1"));
        List<ActorModel> list = actorMapper.getAllActors(wrapper);

        ActorDTO dto = new ActorDTO();
        dto.setActorId(1);
        List<ActorModel> list2 = daoActorMapper.queryActor(dto);


        return Optional.ofNullable(list2).orElse(Collections.emptyList());
    }
}
