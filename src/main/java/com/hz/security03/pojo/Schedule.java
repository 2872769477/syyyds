package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 排班表
 */
@Data
public class Schedule implements Serializable {
    private Integer scheduleId;//排班ID
    private int scheduleWeek;//星期(周几)
    private Integer pyhsDoctorId;//医师ID
    private int schedulePeriodTime;//时段
    private String scheduleBeginTime;//开始时间
    private String scheduleAfterTime;//结束时间
    private String scheduleDesc;//说明
    private int schedulePerson;//可预约人数
    private int scheduleMoney;//金额


}
