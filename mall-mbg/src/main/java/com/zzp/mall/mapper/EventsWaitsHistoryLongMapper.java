package com.zzp.mall.mapper;

import com.zzp.mall.model.EventsWaitsHistoryLong;
import com.zzp.mall.model.EventsWaitsHistoryLongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsHistoryLongMapper {
    int countByExample(EventsWaitsHistoryLongExample example);

    int deleteByExample(EventsWaitsHistoryLongExample example);

    int insert(EventsWaitsHistoryLong record);

    int insertSelective(EventsWaitsHistoryLong record);

    List<EventsWaitsHistoryLong> selectByExample(EventsWaitsHistoryLongExample example);

    int updateByExampleSelective(@Param("record") EventsWaitsHistoryLong record, @Param("example") EventsWaitsHistoryLongExample example);

    int updateByExample(@Param("record") EventsWaitsHistoryLong record, @Param("example") EventsWaitsHistoryLongExample example);
}