package com.zzp.mall.mapper;

import com.zzp.mall.model.GeneralLog;
import com.zzp.mall.model.GeneralLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeneralLogMapper {
    int countByExample(GeneralLogExample example);

    int deleteByExample(GeneralLogExample example);

    int insert(GeneralLog record);

    int insertSelective(GeneralLog record);

    List<GeneralLog> selectByExampleWithBLOBs(GeneralLogExample example);

    List<GeneralLog> selectByExample(GeneralLogExample example);

    int updateByExampleSelective(@Param("record") GeneralLog record, @Param("example") GeneralLogExample example);

    int updateByExampleWithBLOBs(@Param("record") GeneralLog record, @Param("example") GeneralLogExample example);

    int updateByExample(@Param("record") GeneralLog record, @Param("example") GeneralLogExample example);
}