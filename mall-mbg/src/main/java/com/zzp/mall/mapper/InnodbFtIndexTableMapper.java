package com.zzp.mall.mapper;

import com.zzp.mall.model.InnodbFtIndexTable;
import com.zzp.mall.model.InnodbFtIndexTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbFtIndexTableMapper {
    int countByExample(InnodbFtIndexTableExample example);

    int deleteByExample(InnodbFtIndexTableExample example);

    int insert(InnodbFtIndexTable record);

    int insertSelective(InnodbFtIndexTable record);

    List<InnodbFtIndexTable> selectByExample(InnodbFtIndexTableExample example);

    int updateByExampleSelective(@Param("record") InnodbFtIndexTable record, @Param("example") InnodbFtIndexTableExample example);

    int updateByExample(@Param("record") InnodbFtIndexTable record, @Param("example") InnodbFtIndexTableExample example);
}