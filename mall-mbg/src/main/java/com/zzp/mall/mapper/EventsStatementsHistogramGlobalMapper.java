package com.zzp.mall.mapper;

import com.zzp.mall.model.EventsStatementsHistogramGlobal;
import com.zzp.mall.model.EventsStatementsHistogramGlobalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsHistogramGlobalMapper {
    int countByExample(EventsStatementsHistogramGlobalExample example);

    int deleteByExample(EventsStatementsHistogramGlobalExample example);

    int deleteByPrimaryKey(Integer bucketNumber);

    int insert(EventsStatementsHistogramGlobal record);

    int insertSelective(EventsStatementsHistogramGlobal record);

    List<EventsStatementsHistogramGlobal> selectByExample(EventsStatementsHistogramGlobalExample example);

    EventsStatementsHistogramGlobal selectByPrimaryKey(Integer bucketNumber);

    int updateByExampleSelective(@Param("record") EventsStatementsHistogramGlobal record, @Param("example") EventsStatementsHistogramGlobalExample example);

    int updateByExample(@Param("record") EventsStatementsHistogramGlobal record, @Param("example") EventsStatementsHistogramGlobalExample example);

    int updateByPrimaryKeySelective(EventsStatementsHistogramGlobal record);

    int updateByPrimaryKey(EventsStatementsHistogramGlobal record);
}