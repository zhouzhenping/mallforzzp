package com.zzp.mall.mapper;

import com.zzp.mall.model.EventsErrorsSummaryByHostByError;
import com.zzp.mall.model.EventsErrorsSummaryByHostByErrorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsErrorsSummaryByHostByErrorMapper {
    int countByExample(EventsErrorsSummaryByHostByErrorExample example);

    int deleteByExample(EventsErrorsSummaryByHostByErrorExample example);

    int insert(EventsErrorsSummaryByHostByError record);

    int insertSelective(EventsErrorsSummaryByHostByError record);

    List<EventsErrorsSummaryByHostByError> selectByExample(EventsErrorsSummaryByHostByErrorExample example);

    int updateByExampleSelective(@Param("record") EventsErrorsSummaryByHostByError record, @Param("example") EventsErrorsSummaryByHostByErrorExample example);

    int updateByExample(@Param("record") EventsErrorsSummaryByHostByError record, @Param("example") EventsErrorsSummaryByHostByErrorExample example);
}