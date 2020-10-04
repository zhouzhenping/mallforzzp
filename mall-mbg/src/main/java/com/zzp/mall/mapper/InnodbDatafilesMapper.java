package com.zzp.mall.mapper;

import com.zzp.mall.model.InnodbDatafiles;
import com.zzp.mall.model.InnodbDatafilesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbDatafilesMapper {
    int countByExample(InnodbDatafilesExample example);

    int deleteByExample(InnodbDatafilesExample example);

    int insert(InnodbDatafiles record);

    int insertSelective(InnodbDatafiles record);

    List<InnodbDatafiles> selectByExampleWithBLOBs(InnodbDatafilesExample example);

    List<InnodbDatafiles> selectByExample(InnodbDatafilesExample example);

    int updateByExampleSelective(@Param("record") InnodbDatafiles record, @Param("example") InnodbDatafilesExample example);

    int updateByExampleWithBLOBs(@Param("record") InnodbDatafiles record, @Param("example") InnodbDatafilesExample example);

    int updateByExample(@Param("record") InnodbDatafiles record, @Param("example") InnodbDatafilesExample example);
}