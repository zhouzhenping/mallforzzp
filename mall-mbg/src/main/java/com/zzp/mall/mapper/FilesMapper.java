package com.zzp.mall.mapper;

import com.zzp.mall.model.Files;
import com.zzp.mall.model.FilesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FilesMapper {
    int countByExample(FilesExample example);

    int deleteByExample(FilesExample example);

    int insert(Files record);

    int insertSelective(Files record);

    List<Files> selectByExampleWithBLOBs(FilesExample example);

    List<Files> selectByExample(FilesExample example);

    int updateByExampleSelective(@Param("record") Files record, @Param("example") FilesExample example);

    int updateByExampleWithBLOBs(@Param("record") Files record, @Param("example") FilesExample example);

    int updateByExample(@Param("record") Files record, @Param("example") FilesExample example);
}