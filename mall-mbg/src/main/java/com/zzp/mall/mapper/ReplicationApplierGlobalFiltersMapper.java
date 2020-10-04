package com.zzp.mall.mapper;

import com.zzp.mall.model.ReplicationApplierGlobalFilters;
import com.zzp.mall.model.ReplicationApplierGlobalFiltersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationApplierGlobalFiltersMapper {
    int countByExample(ReplicationApplierGlobalFiltersExample example);

    int deleteByExample(ReplicationApplierGlobalFiltersExample example);

    int insert(ReplicationApplierGlobalFilters record);

    int insertSelective(ReplicationApplierGlobalFilters record);

    List<ReplicationApplierGlobalFilters> selectByExampleWithBLOBs(ReplicationApplierGlobalFiltersExample example);

    List<ReplicationApplierGlobalFilters> selectByExample(ReplicationApplierGlobalFiltersExample example);

    int updateByExampleSelective(@Param("record") ReplicationApplierGlobalFilters record, @Param("example") ReplicationApplierGlobalFiltersExample example);

    int updateByExampleWithBLOBs(@Param("record") ReplicationApplierGlobalFilters record, @Param("example") ReplicationApplierGlobalFiltersExample example);

    int updateByExample(@Param("record") ReplicationApplierGlobalFilters record, @Param("example") ReplicationApplierGlobalFiltersExample example);
}