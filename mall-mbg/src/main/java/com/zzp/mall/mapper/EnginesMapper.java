package com.zzp.mall.mapper;

import com.zzp.mall.model.Engines;
import com.zzp.mall.model.EnginesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnginesMapper {
    int countByExample(EnginesExample example);

    int deleteByExample(EnginesExample example);

    int insert(Engines record);

    int insertSelective(Engines record);

    List<Engines> selectByExample(EnginesExample example);

    int updateByExampleSelective(@Param("record") Engines record, @Param("example") EnginesExample example);

    int updateByExample(@Param("record") Engines record, @Param("example") EnginesExample example);
}