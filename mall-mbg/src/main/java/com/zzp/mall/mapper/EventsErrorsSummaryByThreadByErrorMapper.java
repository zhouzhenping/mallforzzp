package com.zzp.mall.mapper;

import com.zzp.mall.model.EventsErrorsSummaryByThreadByError;
import com.zzp.mall.model.EventsErrorsSummaryByThreadByErrorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsErrorsSummaryByThreadByErrorMapper {
    int countByExample(EventsErrorsSummaryByThreadByErrorExample example);

    int deleteByExample(EventsErrorsSummaryByThreadByErrorExample example);

    int insert(EventsErrorsSummaryByThreadByError record);

    int insertSelective(EventsErrorsSummaryByThreadByError record);

    List<EventsErrorsSummaryByThreadByError> selectByExample(EventsErrorsSummaryByThreadByErrorExample example);

    int updateByExampleSelective(@Param("record") EventsErrorsSummaryByThreadByError record, @Param("example") EventsErrorsSummaryByThreadByErrorExample example);

    int updateByExample(@Param("record") EventsErrorsSummaryByThreadByError record, @Param("example") EventsErrorsSummaryByThreadByErrorExample example);
}