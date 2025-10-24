package com.xxl.job.admin.scheduler.type.strategy;

import com.xxl.job.admin.model.XxlJobInfo;
import com.xxl.job.admin.scheduler.type.ScheduleType;

import java.util.Date;

public class NoneScheduleType extends ScheduleType {

    @Override
    public Date generateNextTriggerTime(XxlJobInfo jobInfo, Date fromTime) throws Exception {
        // generate none trigger-time
        return null;
    }

}
