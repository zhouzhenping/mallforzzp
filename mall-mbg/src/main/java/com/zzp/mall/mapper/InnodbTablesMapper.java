package com.zzp.mall.mapper;

import com.zzp.mall.model.InnodbTables;
import com.zzp.mall.model.InnodbTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbTablesMapper {
    int countByExample(InnodbTablesExample example);

    int deleteByExample(InnodbTablesExample example);

    int insert(InnodbTables record);

    int insertSelective(InnodbTables record);

    List<InnodbTables> selectByExample(InnodbTablesExample example);

    int updateByExampleSelective(@Param("record") InnodbTables record, @Param("example") InnodbTablesExample example);

    int updateByExample(@Param("record") InnodbTables record, @Param("example") InnodbTablesExample example);
}