package project.norbs.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("actor")
public class ActorModel extends Model<ActorModel> {

    @TableField("actor_id")
    private Long actorId;
    @TableField("first_name")
    private String firstName;
    @TableField("last_name")
    private String lastName;
    @TableField("last_update")
    private String lastUpdate;

    @Override
    protected Serializable pkVal() {
        return this.actorId;
    }

}
