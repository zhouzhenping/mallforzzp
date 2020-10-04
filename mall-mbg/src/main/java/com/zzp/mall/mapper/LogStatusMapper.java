package com.zzp.mall.mapper;

import com.zzp.mall.model.LogStatus;
import com.zzp.mall.model.LogStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogStatusMapper {
    int countByExample(LogStatusExample example);

    int deleteByExample(LogStatusExample example);

    int insert(LogStatus record);

    int insertSelective(LogStatus record);

    List<LogStatus> selectByExampleWithBLOBs(LogStatusExample example);

    List<LogStatus> selectByExample(LogStatusExample example);

    int updateByExampleSelective(@Param("record") LogStatus record, @Param("example") LogStatusExample example);

    int updateByExampleWithBLOBs(@Param("record") LogStatus record, @Param("example") LogStatusExample example);

    int updateByExample(@Param("record") LogStatus record, @Param("example") LogStatusExample example);
}