package com.zzp.mall.mapper;

import com.zzp.mall.model.CheckConstraints;
import com.zzp.mall.model.CheckConstraintsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckConstraintsMapper {
    int countByExample(CheckConstraintsExample example);

    int deleteByExample(CheckConstraintsExample example);

    int insert(CheckConstraints record);

    int insertSelective(CheckConstraints record);

    List<CheckConstraints> selectByExampleWithBLOBs(CheckConstraintsExample example);

    List<CheckConstraints> selectByExample(CheckConstraintsExample example);

    int updateByExampleSelective(@Param("record") CheckConstraints record, @Param("example") CheckConstraintsExample example);

    int updateByExampleWithBLOBs(@Param("record") CheckConstraints record, @Param("example") CheckConstraintsExample example);

    int updateByExample(@Param("record") CheckConstraints record, @Param("example") CheckConstraintsExample example);
}