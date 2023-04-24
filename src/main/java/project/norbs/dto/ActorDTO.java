package project.norbs.dto;

import lombok.Data;


@Data
public class ActorDTO extends BaseDTO {

    private Integer actorId;

    private String firstName;

    private String lastName;

    private String lastUpdate;

}
