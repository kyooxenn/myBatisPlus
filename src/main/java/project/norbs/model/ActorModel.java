package project.norbs.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("actor")
public class ActorModel extends Model<ActorModel> {

    @TableField("actor_id")
    @ExcelProperty({"actorId"})
    private Long actorId;

    @TableField("first_name")
    @ExcelProperty({"firstName"})
    private String firstName;

    @TableField("last_name")
    @ExcelProperty({"lastName"})
    private String lastName;

    @TableField("last_update")
    @ExcelProperty({"lastUpdate"})
    private String lastUpdate;

    public static ActorModel from(ActorModel entity) {
        ActorModel actorExportVO = new ActorModel();
        BeanUtils.copyProperties(entity, actorExportVO);
        actorExportVO.setActorId(entity.getActorId());
        actorExportVO.setFirstName(entity.getFirstName() == null ? "" : entity.getFirstName());
        actorExportVO.setLastName(entity.getLastName() == null ? "" : entity.getLastName());
        actorExportVO.setLastUpdate(entity.getLastUpdate() == null ? "" : entity.getLastUpdate());
        return actorExportVO;
    }

    @Override
    protected Serializable pkVal() {
        return this.actorId;
    }

}
