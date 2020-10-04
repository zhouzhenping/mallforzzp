package com.zzp.mall.mapper;

import com.zzp.mall.model.TablespacesExtensions;
import com.zzp.mall.model.TablespacesExtensionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TablespacesExtensionsMapper {
    int countByExample(TablespacesExtensionsExample example);

    int deleteByExample(TablespacesExtensionsExample example);

    int insert(TablespacesExtensions record);

    int insertSelective(TablespacesExtensions record);

    List<TablespacesExtensions> selectByExampleWithBLOBs(TablespacesExtensionsExample example);

    List<TablespacesExtensions> selectByExample(TablespacesExtensionsExample example);

    int updateByExampleSelective(@Param("record") TablespacesExtensions record, @Param("example") TablespacesExtensionsExample example);

    int updateByExampleWithBLOBs(@Param("record") TablespacesExtensions record, @Param("example") TablespacesExtensionsExample example);

    int updateByExample(@Param("record") TablespacesExtensions record, @Param("example") TablespacesExtensionsExample example);
}