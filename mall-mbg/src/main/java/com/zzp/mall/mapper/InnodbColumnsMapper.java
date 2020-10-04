package com.zzp.mall.mapper;

import com.zzp.mall.model.InnodbColumns;
import com.zzp.mall.model.InnodbColumnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbColumnsMapper {
    int countByExample(InnodbColumnsExample example);

    int deleteByExample(InnodbColumnsExample example);

    int insert(InnodbColumns record);

    int insertSelective(InnodbColumns record);

    List<InnodbColumns> selectByExampleWithBLOBs(InnodbColumnsExample example);

    List<InnodbColumns> selectByExample(InnodbColumnsExample example);

    int updateByExampleSelective(@Param("record") InnodbColumns record, @Param("example") InnodbColumnsExample example);

    int updateByExampleWithBLOBs(@Param("record") InnodbColumns record, @Param("example") InnodbColumnsExample example);

    int updateByExample(@Param("record") InnodbColumns record, @Param("example") InnodbColumnsExample example);
}