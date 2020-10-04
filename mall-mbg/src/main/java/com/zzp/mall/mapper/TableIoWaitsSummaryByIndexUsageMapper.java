package com.zzp.mall.mapper;

import com.zzp.mall.model.TableIoWaitsSummaryByIndexUsage;
import com.zzp.mall.model.TableIoWaitsSummaryByIndexUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableIoWaitsSummaryByIndexUsageMapper {
    int countByExample(TableIoWaitsSummaryByIndexUsageExample example);

    int deleteByExample(TableIoWaitsSummaryByIndexUsageExample example);

    int insert(TableIoWaitsSummaryByIndexUsage record);

    int insertSelective(TableIoWaitsSummaryByIndexUsage record);

    List<TableIoWaitsSummaryByIndexUsage> selectByExample(TableIoWaitsSummaryByIndexUsageExample example);

    int updateByExampleSelective(@Param("record") TableIoWaitsSummaryByIndexUsage record, @Param("example") TableIoWaitsSummaryByIndexUsageExample example);

    int updateByExample(@Param("record") TableIoWaitsSummaryByIndexUsage record, @Param("example") TableIoWaitsSummaryByIndexUsageExample example);
}