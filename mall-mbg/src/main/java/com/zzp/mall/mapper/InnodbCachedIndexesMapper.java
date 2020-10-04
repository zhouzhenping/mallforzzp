package com.zzp.mall.mapper;

import com.zzp.mall.model.InnodbCachedIndexes;
import com.zzp.mall.model.InnodbCachedIndexesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbCachedIndexesMapper {
    int countByExample(InnodbCachedIndexesExample example);

    int deleteByExample(InnodbCachedIndexesExample example);

    int insert(InnodbCachedIndexes record);

    int insertSelective(InnodbCachedIndexes record);

    List<InnodbCachedIndexes> selectByExample(InnodbCachedIndexesExample example);

    int updateByExampleSelective(@Param("record") InnodbCachedIndexes record, @Param("example") InnodbCachedIndexesExample example);

    int updateByExample(@Param("record") InnodbCachedIndexes record, @Param("example") InnodbCachedIndexesExample example);
}