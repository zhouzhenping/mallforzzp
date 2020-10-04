package com.zzp.mall.mapper;

import com.zzp.mall.model.InnodbBufferPage;
import com.zzp.mall.model.InnodbBufferPageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbBufferPageMapper {
    int countByExample(InnodbBufferPageExample example);

    int deleteByExample(InnodbBufferPageExample example);

    int insert(InnodbBufferPage record);

    int insertSelective(InnodbBufferPage record);

    List<InnodbBufferPage> selectByExample(InnodbBufferPageExample example);

    int updateByExampleSelective(@Param("record") InnodbBufferPage record, @Param("example") InnodbBufferPageExample example);

    int updateByExample(@Param("record") InnodbBufferPage record, @Param("example") InnodbBufferPageExample example);
}