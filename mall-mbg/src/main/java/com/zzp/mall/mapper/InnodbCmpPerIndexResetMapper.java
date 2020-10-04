package com.zzp.mall.mapper;

import com.zzp.mall.model.InnodbCmpPerIndexReset;
import com.zzp.mall.model.InnodbCmpPerIndexResetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbCmpPerIndexResetMapper {
    int countByExample(InnodbCmpPerIndexResetExample example);

    int deleteByExample(InnodbCmpPerIndexResetExample example);

    int insert(InnodbCmpPerIndexReset record);

    int insertSelective(InnodbCmpPerIndexReset record);

    List<InnodbCmpPerIndexReset> selectByExample(InnodbCmpPerIndexResetExample example);

    int updateByExampleSelective(@Param("record") InnodbCmpPerIndexReset record, @Param("example") InnodbCmpPerIndexResetExample example);

    int updateByExample(@Param("record") InnodbCmpPerIndexReset record, @Param("example") InnodbCmpPerIndexResetExample example);
}