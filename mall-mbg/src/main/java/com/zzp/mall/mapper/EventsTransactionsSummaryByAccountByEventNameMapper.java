package com.zzp.mall.mapper;

import com.zzp.mall.model.EventsTransactionsSummaryByAccountByEventName;
import com.zzp.mall.model.EventsTransactionsSummaryByAccountByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsSummaryByAccountByEventNameMapper {
    int countByExample(EventsTransactionsSummaryByAccountByEventNameExample example);

    int deleteByExample(EventsTransactionsSummaryByAccountByEventNameExample example);

    int insert(EventsTransactionsSummaryByAccountByEventName record);

    int insertSelective(EventsTransactionsSummaryByAccountByEventName record);

    List<EventsTransactionsSummaryByAccountByEventName> selectByExample(EventsTransactionsSummaryByAccountByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsTransactionsSummaryByAccountByEventName record, @Param("example") EventsTransactionsSummaryByAccountByEventNameExample example);

    int updateByExample(@Param("record") EventsTransactionsSummaryByAccountByEventName record, @Param("example") EventsTransactionsSummaryByAccountByEventNameExample example);
}