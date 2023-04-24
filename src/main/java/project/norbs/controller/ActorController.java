package project.norbs.controller;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import project.norbs.dto.ActorDTO;
import project.norbs.enums.ErrorType;
import project.norbs.exception.BaseException;
import project.norbs.services.iface.SakilaService;
import project.norbs.vo.ResponseHelper;
import project.norbs.vo.ResponseVO;

@RestController
@Slf4j
@RequestMapping("/api/sakila")
public class ActorController {


    @Resource
    private SakilaService sakilaService;

    @GetMapping("/actor")
    public ResponseVO getAllActor() {
        return ResponseHelper.success(sakilaService.getAllActor());
    }


    @PostMapping("/list/actor")
    public ResponseVO getActorList(@RequestBody ActorDTO actorDTO) {
        try {
            return ResponseHelper.success(sakilaService.getActorList(actorDTO));
        } catch(Exception e) {
            log.error("list actor error: {} ", e.getMessage());
            throw BaseException.create(ErrorType.OtherUnhandledError, e == null ? "java.lang.NullException" : e.getMessage());
        }
    }


    @PostMapping("/list/actor/nopage")
    public ResponseVO getActorListNoPage(@RequestBody ActorDTO actorDTO) {
        try {
            return ResponseHelper.success(sakilaService.getActorListNoPage(actorDTO));
        } catch(Exception e) {
            log.error("list actor error: {} ", e.getMessage());
            throw BaseException.create(ErrorType.OtherUnhandledError, e == null ? "java.lang.NullException" : e.getMessage());
        }
    }



}
