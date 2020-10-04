package com.zzp.mall.mapper;

import com.zzp.mall.model.EventsStagesSummaryGlobalByEventName;
import com.zzp.mall.model.EventsStagesSummaryGlobalByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStagesSummaryGlobalByEventNameMapper {
    int countByExample(EventsStagesSummaryGlobalByEventNameExample example);

    int deleteByExample(EventsStagesSummaryGlobalByEventNameExample example);

    int deleteByPrimaryKey(String eventName);

    int insert(EventsStagesSummaryGlobalByEventName record);

    int insertSelective(EventsStagesSummaryGlobalByEventName record);

    List<EventsStagesSummaryGlobalByEventName> selectByExample(EventsStagesSummaryGlobalByEventNameExample example);

    EventsStagesSummaryGlobalByEventName selectByPrimaryKey(String eventName);

    int updateByExampleSelective(@Param("record") EventsStagesSummaryGlobalByEventName record, @Param("example") EventsStagesSummaryGlobalByEventNameExample example);

    int updateByExample(@Param("record") EventsStagesSummaryGlobalByEventName record, @Param("example") EventsStagesSummaryGlobalByEventNameExample example);

    int updateByPrimaryKeySelective(EventsStagesSummaryGlobalByEventName record);

    int updateByPrimaryKey(EventsStagesSummaryGlobalByEventName record);
}