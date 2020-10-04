package com.zzp.mall.mapper;

import com.zzp.mall.model.MemorySummaryByAccountByEventName;
import com.zzp.mall.model.MemorySummaryByAccountByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemorySummaryByAccountByEventNameMapper {
    int countByExample(MemorySummaryByAccountByEventNameExample example);

    int deleteByExample(MemorySummaryByAccountByEventNameExample example);

    int insert(MemorySummaryByAccountByEventName record);

    int insertSelective(MemorySummaryByAccountByEventName record);

    List<MemorySummaryByAccountByEventName> selectByExample(MemorySummaryByAccountByEventNameExample example);

    int updateByExampleSelective(@Param("record") MemorySummaryByAccountByEventName record, @Param("example") MemorySummaryByAccountByEventNameExample example);

    int updateByExample(@Param("record") MemorySummaryByAccountByEventName record, @Param("example") MemorySummaryByAccountByEventNameExample example);
}