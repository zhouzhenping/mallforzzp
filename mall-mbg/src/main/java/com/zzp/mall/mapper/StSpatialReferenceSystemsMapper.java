package com.zzp.mall.mapper;

import com.zzp.mall.model.StSpatialReferenceSystems;
import com.zzp.mall.model.StSpatialReferenceSystemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StSpatialReferenceSystemsMapper {
    int countByExample(StSpatialReferenceSystemsExample example);

    int deleteByExample(StSpatialReferenceSystemsExample example);

    int insert(StSpatialReferenceSystems record);

    int insertSelective(StSpatialReferenceSystems record);

    List<StSpatialReferenceSystems> selectByExample(StSpatialReferenceSystemsExample example);

    int updateByExampleSelective(@Param("record") StSpatialReferenceSystems record, @Param("example") StSpatialReferenceSystemsExample example);

    int updateByExample(@Param("record") StSpatialReferenceSystems record, @Param("example") StSpatialReferenceSystemsExample example);
}