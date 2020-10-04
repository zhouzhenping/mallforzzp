package com.zzp.mall.mapper;

import com.zzp.mall.model.OptimizerTrace;
import com.zzp.mall.model.OptimizerTraceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OptimizerTraceMapper {
    int countByExample(OptimizerTraceExample example);

    int deleteByExample(OptimizerTraceExample example);

    int insert(OptimizerTrace record);

    int insertSelective(OptimizerTrace record);

    List<OptimizerTrace> selectByExample(OptimizerTraceExample example);

    int updateByExampleSelective(@Param("record") OptimizerTrace record, @Param("example") OptimizerTraceExample example);

    int updateByExample(@Param("record") OptimizerTrace record, @Param("example") OptimizerTraceExample example);
}