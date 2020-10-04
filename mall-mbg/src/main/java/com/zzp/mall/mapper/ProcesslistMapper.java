package com.zzp.mall.mapper;

import com.zzp.mall.model.Processlist;
import com.zzp.mall.model.ProcesslistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcesslistMapper {
    int countByExample(ProcesslistExample example);

    int deleteByExample(ProcesslistExample example);

    int insert(Processlist record);

    int insertSelective(Processlist record);

    List<Processlist> selectByExample(ProcesslistExample example);

    int updateByExampleSelective(@Param("record") Processlist record, @Param("example") ProcesslistExample example);

    int updateByExample(@Param("record") Processlist record, @Param("example") ProcesslistExample example);
}