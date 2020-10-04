package com.zzp.mall.mapper;

import com.zzp.mall.model.EventsWaitsSummaryByThreadByEventName;
import com.zzp.mall.model.EventsWaitsSummaryByThreadByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsSummaryByThreadByEventNameMapper {
    int countByExample(EventsWaitsSummaryByThreadByEventNameExample example);

    int deleteByExample(EventsWaitsSummaryByThreadByEventNameExample example);

    int deleteByPrimaryKey(@Param("threadId") Long threadId, @Param("eventName") String eventName);

    int insert(EventsWaitsSummaryByThreadByEventName record);

    int insertSelective(EventsWaitsSummaryByThreadByEventName record);

    List<EventsWaitsSummaryByThreadByEventName> selectByExample(EventsWaitsSummaryByThreadByEventNameExample example);

    EventsWaitsSummaryByThreadByEventName selectByPrimaryKey(@Param("threadId") Long threadId, @Param("eventName") String eventName);

    int updateByExampleSelective(@Param("record") EventsWaitsSummaryByThreadByEventName record, @Param("example") EventsWaitsSummaryByThreadByEventNameExample example);

    int updateByExample(@Param("record") EventsWaitsSummaryByThreadByEventName record, @Param("example") EventsWaitsSummaryByThreadByEventNameExample example);

    int updateByPrimaryKeySelective(EventsWaitsSummaryByThreadByEventName record);

    int updateByPrimaryKey(EventsWaitsSummaryByThreadByEventName record);
}