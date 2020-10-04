package com.zzp.mall.mapper;

import com.zzp.mall.model.InnodbCmpReset;
import com.zzp.mall.model.InnodbCmpResetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbCmpResetMapper {
    int countByExample(InnodbCmpResetExample example);

    int deleteByExample(InnodbCmpResetExample example);

    int insert(InnodbCmpReset record);

    int insertSelective(InnodbCmpReset record);

    List<InnodbCmpReset> selectByExample(InnodbCmpResetExample example);

    int updateByExampleSelective(@Param("record") InnodbCmpReset record, @Param("example") InnodbCmpResetExample example);

    int updateByExample(@Param("record") InnodbCmpReset record, @Param("example") InnodbCmpResetExample example);
}