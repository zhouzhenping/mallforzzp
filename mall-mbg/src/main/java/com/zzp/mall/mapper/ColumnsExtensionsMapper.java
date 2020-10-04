package com.zzp.mall.mapper;

import com.zzp.mall.model.ColumnsExtensions;
import com.zzp.mall.model.ColumnsExtensionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnsExtensionsMapper {
    int countByExample(ColumnsExtensionsExample example);

    int deleteByExample(ColumnsExtensionsExample example);

    int insert(ColumnsExtensions record);

    int insertSelective(ColumnsExtensions record);

    List<ColumnsExtensions> selectByExampleWithBLOBs(ColumnsExtensionsExample example);

    List<ColumnsExtensions> selectByExample(ColumnsExtensionsExample example);

    int updateByExampleSelective(@Param("record") ColumnsExtensions record, @Param("example") ColumnsExtensionsExample example);

    int updateByExampleWithBLOBs(@Param("record") ColumnsExtensions record, @Param("example") ColumnsExtensionsExample example);

    int updateByExample(@Param("record") ColumnsExtensions record, @Param("example") ColumnsExtensionsExample example);
}