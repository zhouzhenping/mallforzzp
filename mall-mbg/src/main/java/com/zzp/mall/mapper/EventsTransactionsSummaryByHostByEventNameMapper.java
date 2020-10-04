package com.zzp.mall.mapper;

import com.zzp.mall.model.EventsTransactionsSummaryByHostByEventName;
import com.zzp.mall.model.EventsTransactionsSummaryByHostByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsSummaryByHostByEventNameMapper {
    int countByExample(EventsTransactionsSummaryByHostByEventNameExample example);

    int deleteByExample(EventsTransactionsSummaryByHostByEventNameExample example);

    int insert(EventsTransactionsSummaryByHostByEventName record);

    int insertSelective(EventsTransactionsSummaryByHostByEventName record);

    List<EventsTransactionsSummaryByHostByEventName> selectByExample(EventsTransactionsSummaryByHostByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsTransactionsSummaryByHostByEventName record, @Param("example") EventsTransactionsSummaryByHostByEventNameExample example);

    int updateByExample(@Param("record") EventsTransactionsSummaryByHostByEventName record, @Param("example") EventsTransactionsSummaryByHostByEventNameExample example);
}