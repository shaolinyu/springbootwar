package com.mocha.springbootwar.bean;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotBlank;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Getter;
import lombok.Setter;

/**
 * 配置导出模板.
 * @author shaolinyu
 *
 */
@Getter
@Setter
@KeySequence(value = "SEQ_OUTAUTH", clazz = String.class)
@TableName("outauth_base_info")
public class OutauthBaseInfo implements Serializable{

  private static final long serialVersionUID = 1L;
  
  @TableId(type = IdType.INPUT)
  @Excel(name = "主键ID",width = 15)
  @NotBlank(message = "该字段不能为空")
  private String baseId;
  
  @Excel(name = "工号")
  private String userId;
  
  @Excel(name = "姓名")
  private String userName;
  
  @Excel(name = "外出地点")
  private String outPlace;
  
  @Excel(name = "外出原因")
  private String outReason;
  
  @Excel(name = "开始时间", exportFormat = "yyyy-MM-dd HH:mm:ss", 
      importFormat = "yyyy-MM-dd HH:mm:ss", orderNum = "2", width = 30)
  private Date startTime;
  
  @TableField(exist = false)
  @Excel(name = "组织编号", width = 30)
  private String orgCode;
  
  @TableField(exist = false)
  @Excel(name = "组织名称", width = 30)
  private String orgName;
  
}
