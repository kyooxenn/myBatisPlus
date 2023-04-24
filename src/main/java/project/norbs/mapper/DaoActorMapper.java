package project.norbs.mapper;


import org.apache.ibatis.annotations.Mapper;
import project.norbs.dto.ActorDTO;
import project.norbs.model.ActorModel;

import java.util.List;


@Mapper
public interface DaoActorMapper {

    List<ActorModel> queryActor (ActorDTO actorDTO);

}
