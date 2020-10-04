package com.zzp.mall.mapper;

import com.zzp.mall.model.EventsStagesSummaryByHostByEventName;
import com.zzp.mall.model.EventsStagesSummaryByHostByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStagesSummaryByHostByEventNameMapper {
    int countByExample(EventsStagesSummaryByHostByEventNameExample example);

    int deleteByExample(EventsStagesSummaryByHostByEventNameExample example);

    int insert(EventsStagesSummaryByHostByEventName record);

    int insertSelective(EventsStagesSummaryByHostByEventName record);

    List<EventsStagesSummaryByHostByEventName> selectByExample(EventsStagesSummaryByHostByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsStagesSummaryByHostByEventName record, @Param("example") EventsStagesSummaryByHostByEventNameExample example);

    int updateByExample(@Param("record") EventsStagesSummaryByHostByEventName record, @Param("example") EventsStagesSummaryByHostByEventNameExample example);
}