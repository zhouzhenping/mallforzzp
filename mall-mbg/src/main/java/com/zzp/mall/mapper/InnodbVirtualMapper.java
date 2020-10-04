package com.zzp.mall.mapper;

import com.zzp.mall.model.InnodbVirtual;
import com.zzp.mall.model.InnodbVirtualExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbVirtualMapper {
    int countByExample(InnodbVirtualExample example);

    int deleteByExample(InnodbVirtualExample example);

    int insert(InnodbVirtual record);

    int insertSelective(InnodbVirtual record);

    List<InnodbVirtual> selectByExample(InnodbVirtualExample example);

    int updateByExampleSelective(@Param("record") InnodbVirtual record, @Param("example") InnodbVirtualExample example);

    int updateByExample(@Param("record") InnodbVirtual record, @Param("example") InnodbVirtualExample example);
}