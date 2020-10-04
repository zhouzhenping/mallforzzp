package com.zzp.mall.mapper;

import com.zzp.mall.model.InnodbIndexes;
import com.zzp.mall.model.InnodbIndexesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbIndexesMapper {
    int countByExample(InnodbIndexesExample example);

    int deleteByExample(InnodbIndexesExample example);

    int insert(InnodbIndexes record);

    int insertSelective(InnodbIndexes record);

    List<InnodbIndexes> selectByExample(InnodbIndexesExample example);

    int updateByExampleSelective(@Param("record") InnodbIndexes record, @Param("example") InnodbIndexesExample example);

    int updateByExample(@Param("record") InnodbIndexes record, @Param("example") InnodbIndexesExample example);
}