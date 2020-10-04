package com.zzp.mall.mapper;

import com.zzp.mall.model.EventsStatementsSummaryByHostByEventName;
import com.zzp.mall.model.EventsStatementsSummaryByHostByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsSummaryByHostByEventNameMapper {
    int countByExample(EventsStatementsSummaryByHostByEventNameExample example);

    int deleteByExample(EventsStatementsSummaryByHostByEventNameExample example);

    int insert(EventsStatementsSummaryByHostByEventName record);

    int insertSelective(EventsStatementsSummaryByHostByEventName record);

    List<EventsStatementsSummaryByHostByEventName> selectByExample(EventsStatementsSummaryByHostByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsStatementsSummaryByHostByEventName record, @Param("example") EventsStatementsSummaryByHostByEventNameExample example);

    int updateByExample(@Param("record") EventsStatementsSummaryByHostByEventName record, @Param("example") EventsStatementsSummaryByHostByEventNameExample example);
}