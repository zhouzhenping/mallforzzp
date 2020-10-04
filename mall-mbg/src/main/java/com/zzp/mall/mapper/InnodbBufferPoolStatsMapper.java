package com.zzp.mall.mapper;

import com.zzp.mall.model.InnodbBufferPoolStats;
import com.zzp.mall.model.InnodbBufferPoolStatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbBufferPoolStatsMapper {
    int countByExample(InnodbBufferPoolStatsExample example);

    int deleteByExample(InnodbBufferPoolStatsExample example);

    int insert(InnodbBufferPoolStats record);

    int insertSelective(InnodbBufferPoolStats record);

    List<InnodbBufferPoolStats> selectByExample(InnodbBufferPoolStatsExample example);

    int updateByExampleSelective(@Param("record") InnodbBufferPoolStats record, @Param("example") InnodbBufferPoolStatsExample example);

    int updateByExample(@Param("record") InnodbBufferPoolStats record, @Param("example") InnodbBufferPoolStatsExample example);
}