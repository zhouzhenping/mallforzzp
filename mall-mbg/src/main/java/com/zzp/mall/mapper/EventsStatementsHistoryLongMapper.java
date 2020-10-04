package com.zzp.mall.mapper;

import com.zzp.mall.model.EventsStatementsHistoryLong;
import com.zzp.mall.model.EventsStatementsHistoryLongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsHistoryLongMapper {
    int countByExample(EventsStatementsHistoryLongExample example);

    int deleteByExample(EventsStatementsHistoryLongExample example);

    int insert(EventsStatementsHistoryLong record);

    int insertSelective(EventsStatementsHistoryLong record);

    List<EventsStatementsHistoryLong> selectByExampleWithBLOBs(EventsStatementsHistoryLongExample example);

    List<EventsStatementsHistoryLong> selectByExample(EventsStatementsHistoryLongExample example);

    int updateByExampleSelective(@Param("record") EventsStatementsHistoryLong record, @Param("example") EventsStatementsHistoryLongExample example);

    int updateByExampleWithBLOBs(@Param("record") EventsStatementsHistoryLong record, @Param("example") EventsStatementsHistoryLongExample example);

    int updateByExample(@Param("record") EventsStatementsHistoryLong record, @Param("example") EventsStatementsHistoryLongExample example);
}