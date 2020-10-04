package com.zzp.mall.mapper;

import com.zzp.mall.model.InnodbSessionTempTablespaces;
import com.zzp.mall.model.InnodbSessionTempTablespacesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbSessionTempTablespacesMapper {
    int countByExample(InnodbSessionTempTablespacesExample example);

    int deleteByExample(InnodbSessionTempTablespacesExample example);

    int insert(InnodbSessionTempTablespaces record);

    int insertSelective(InnodbSessionTempTablespaces record);

    List<InnodbSessionTempTablespaces> selectByExample(InnodbSessionTempTablespacesExample example);

    int updateByExampleSelective(@Param("record") InnodbSessionTempTablespaces record, @Param("example") InnodbSessionTempTablespacesExample example);

    int updateByExample(@Param("record") InnodbSessionTempTablespaces record, @Param("example") InnodbSessionTempTablespacesExample example);
}