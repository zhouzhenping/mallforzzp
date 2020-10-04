package com.zzp.mall.mapper;

import com.zzp.mall.model.EventsTransactionsCurrent;
import com.zzp.mall.model.EventsTransactionsCurrentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsCurrentMapper {
    int countByExample(EventsTransactionsCurrentExample example);

    int deleteByExample(EventsTransactionsCurrentExample example);

    int deleteByPrimaryKey(@Param("threadId") Long threadId, @Param("eventId") Long eventId);

    int insert(EventsTransactionsCurrent record);

    int insertSelective(EventsTransactionsCurrent record);

    List<EventsTransactionsCurrent> selectByExample(EventsTransactionsCurrentExample example);

    EventsTransactionsCurrent selectByPrimaryKey(@Param("threadId") Long threadId, @Param("eventId") Long eventId);

    int updateByExampleSelective(@Param("record") EventsTransactionsCurrent record, @Param("example") EventsTransactionsCurrentExample example);

    int updateByExample(@Param("record") EventsTransactionsCurrent record, @Param("example") EventsTransactionsCurrentExample example);

    int updateByPrimaryKeySelective(EventsTransactionsCurrent record);

    int updateByPrimaryKey(EventsTransactionsCurrent record);
}