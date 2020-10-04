package com.zzp.mall.mapper;

import com.zzp.mall.model.KeyColumnUsage;
import com.zzp.mall.model.KeyColumnUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeyColumnUsageMapper {
    int countByExample(KeyColumnUsageExample example);

    int deleteByExample(KeyColumnUsageExample example);

    int insert(KeyColumnUsage record);

    int insertSelective(KeyColumnUsage record);

    List<KeyColumnUsage> selectByExample(KeyColumnUsageExample example);

    int updateByExampleSelective(@Param("record") KeyColumnUsage record, @Param("example") KeyColumnUsageExample example);

    int updateByExample(@Param("record") KeyColumnUsage record, @Param("example") KeyColumnUsageExample example);
}