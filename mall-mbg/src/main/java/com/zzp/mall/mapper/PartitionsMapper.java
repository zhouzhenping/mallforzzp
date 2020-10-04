package com.zzp.mall.mapper;

import com.zzp.mall.model.Partitions;
import com.zzp.mall.model.PartitionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartitionsMapper {
    int countByExample(PartitionsExample example);

    int deleteByExample(PartitionsExample example);

    int insert(Partitions record);

    int insertSelective(Partitions record);

    List<Partitions> selectByExampleWithBLOBs(PartitionsExample example);

    List<Partitions> selectByExample(PartitionsExample example);

    int updateByExampleSelective(@Param("record") Partitions record, @Param("example") PartitionsExample example);

    int updateByExampleWithBLOBs(@Param("record") Partitions record, @Param("example") PartitionsExample example);

    int updateByExample(@Param("record") Partitions record, @Param("example") PartitionsExample example);
}