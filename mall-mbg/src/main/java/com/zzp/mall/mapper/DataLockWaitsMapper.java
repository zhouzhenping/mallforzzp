package com.zzp.mall.mapper;

import com.zzp.mall.model.DataLockWaits;
import com.zzp.mall.model.DataLockWaitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataLockWaitsMapper {
    int countByExample(DataLockWaitsExample example);

    int deleteByExample(DataLockWaitsExample example);

    int insert(DataLockWaits record);

    int insertSelective(DataLockWaits record);

    List<DataLockWaits> selectByExample(DataLockWaitsExample example);

    int updateByExampleSelective(@Param("record") DataLockWaits record, @Param("example") DataLockWaitsExample example);

    int updateByExample(@Param("record") DataLockWaits record, @Param("example") DataLockWaitsExample example);
}