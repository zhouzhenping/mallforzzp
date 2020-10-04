package com.zzp.mall.mapper;

import com.zzp.mall.model.MetadataLocks;
import com.zzp.mall.model.MetadataLocksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MetadataLocksMapper {
    int countByExample(MetadataLocksExample example);

    int deleteByExample(MetadataLocksExample example);

    int deleteByPrimaryKey(Long objectInstanceBegin);

    int insert(MetadataLocks record);

    int insertSelective(MetadataLocks record);

    List<MetadataLocks> selectByExample(MetadataLocksExample example);

    MetadataLocks selectByPrimaryKey(Long objectInstanceBegin);

    int updateByExampleSelective(@Param("record") MetadataLocks record, @Param("example") MetadataLocksExample example);

    int updateByExample(@Param("record") MetadataLocks record, @Param("example") MetadataLocksExample example);

    int updateByPrimaryKeySelective(MetadataLocks record);

    int updateByPrimaryKey(MetadataLocks record);
}