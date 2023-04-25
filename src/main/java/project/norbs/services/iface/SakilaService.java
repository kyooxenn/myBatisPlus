package project.norbs.services.iface;


import com.github.pagehelper.PageInfo;
import jakarta.servlet.http.HttpServletResponse;
import project.norbs.dto.ActorDTO;
import project.norbs.model.ActorModel;

import java.util.List;


public interface SakilaService {

    PageInfo<ActorModel> getAllActor();


    PageInfo<ActorModel> getActorList(ActorDTO actorDTO);

    List<ActorModel> getActorListNoPage(ActorDTO actorDTO);

    void getActorExport(ActorDTO actorDTO, HttpServletResponse response) throws Exception;
}
