package com.zzp.mall.mapper;

import com.zzp.mall.model.InnodbFtIndexCache;
import com.zzp.mall.model.InnodbFtIndexCacheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbFtIndexCacheMapper {
    int countByExample(InnodbFtIndexCacheExample example);

    int deleteByExample(InnodbFtIndexCacheExample example);

    int insert(InnodbFtIndexCache record);

    int insertSelective(InnodbFtIndexCache record);

    List<InnodbFtIndexCache> selectByExample(InnodbFtIndexCacheExample example);

    int updateByExampleSelective(@Param("record") InnodbFtIndexCache record, @Param("example") InnodbFtIndexCacheExample example);

    int updateByExample(@Param("record") InnodbFtIndexCache record, @Param("example") InnodbFtIndexCacheExample example);
}