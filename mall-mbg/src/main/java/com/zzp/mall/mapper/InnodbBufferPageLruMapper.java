package com.zzp.mall.mapper;

import com.zzp.mall.model.InnodbBufferPageLru;
import com.zzp.mall.model.InnodbBufferPageLruExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbBufferPageLruMapper {
    int countByExample(InnodbBufferPageLruExample example);

    int deleteByExample(InnodbBufferPageLruExample example);

    int insert(InnodbBufferPageLru record);

    int insertSelective(InnodbBufferPageLru record);

    List<InnodbBufferPageLru> selectByExample(InnodbBufferPageLruExample example);

    int updateByExampleSelective(@Param("record") InnodbBufferPageLru record, @Param("example") InnodbBufferPageLruExample example);

    int updateByExample(@Param("record") InnodbBufferPageLru record, @Param("example") InnodbBufferPageLruExample example);
}