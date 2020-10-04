package com.zzp.mall.mapper;

import com.zzp.mall.model.InnodbFtBeingDeleted;
import com.zzp.mall.model.InnodbFtBeingDeletedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbFtBeingDeletedMapper {
    int countByExample(InnodbFtBeingDeletedExample example);

    int deleteByExample(InnodbFtBeingDeletedExample example);

    int insert(InnodbFtBeingDeleted record);

    int insertSelective(InnodbFtBeingDeleted record);

    List<InnodbFtBeingDeleted> selectByExample(InnodbFtBeingDeletedExample example);

    int updateByExampleSelective(@Param("record") InnodbFtBeingDeleted record, @Param("example") InnodbFtBeingDeletedExample example);

    int updateByExample(@Param("record") InnodbFtBeingDeleted record, @Param("example") InnodbFtBeingDeletedExample example);
}