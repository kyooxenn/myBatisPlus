package project.norbs.mapper;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import project.norbs.dto.ActorDTO;
import project.norbs.model.ActorModel;

import java.util.List;


@Mapper
public interface ActorMapper extends BaseMapper<ActorMapper> {

  /*  @Select("<script>" +
            " SELECT actor_id actorId, first_name firstName, last_name lastName, last_update lastUpdate" +
            " FROM actor " +
            "</script>")*/
    List<ActorModel> getAllActor();

    List<ActorModel> getActorList(ActorDTO actorDTO);


  @Select("<script>" +
          " SELECT a.actor_id actorId, a.first_name firstName, a.last_name lastName, a.last_update lastUpdate" +
          " FROM actor a" +
          " ${ew.customSqlSegment}" +
          "</script>")
  List<ActorModel> getAllActors(@Param(Constants.WRAPPER) QueryWrapper queryWrapper);
}
