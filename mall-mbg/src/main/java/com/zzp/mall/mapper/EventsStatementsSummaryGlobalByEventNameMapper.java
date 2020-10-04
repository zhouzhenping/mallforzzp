package com.zzp.mall.mapper;

import com.zzp.mall.model.EventsStatementsSummaryGlobalByEventName;
import com.zzp.mall.model.EventsStatementsSummaryGlobalByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsSummaryGlobalByEventNameMapper {
    int countByExample(EventsStatementsSummaryGlobalByEventNameExample example);

    int deleteByExample(EventsStatementsSummaryGlobalByEventNameExample example);

    int deleteByPrimaryKey(String eventName);

    int insert(EventsStatementsSummaryGlobalByEventName record);

    int insertSelective(EventsStatementsSummaryGlobalByEventName record);

    List<EventsStatementsSummaryGlobalByEventName> selectByExample(EventsStatementsSummaryGlobalByEventNameExample example);

    EventsStatementsSummaryGlobalByEventName selectByPrimaryKey(String eventName);

    int updateByExampleSelective(@Param("record") EventsStatementsSummaryGlobalByEventName record, @Param("example") EventsStatementsSummaryGlobalByEventNameExample example);

    int updateByExample(@Param("record") EventsStatementsSummaryGlobalByEventName record, @Param("example") EventsStatementsSummaryGlobalByEventNameExample example);

    int updateByPrimaryKeySelective(EventsStatementsSummaryGlobalByEventName record);

    int updateByPrimaryKey(EventsStatementsSummaryGlobalByEventName record);
}