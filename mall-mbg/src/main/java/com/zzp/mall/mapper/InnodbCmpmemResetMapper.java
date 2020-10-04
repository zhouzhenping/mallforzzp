package com.zzp.mall.mapper;

import com.zzp.mall.model.InnodbCmpmemReset;
import com.zzp.mall.model.InnodbCmpmemResetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbCmpmemResetMapper {
    int countByExample(InnodbCmpmemResetExample example);

    int deleteByExample(InnodbCmpmemResetExample example);

    int insert(InnodbCmpmemReset record);

    int insertSelective(InnodbCmpmemReset record);

    List<InnodbCmpmemReset> selectByExample(InnodbCmpmemResetExample example);

    int updateByExampleSelective(@Param("record") InnodbCmpmemReset record, @Param("example") InnodbCmpmemResetExample example);

    int updateByExample(@Param("record") InnodbCmpmemReset record, @Param("example") InnodbCmpmemResetExample example);
}