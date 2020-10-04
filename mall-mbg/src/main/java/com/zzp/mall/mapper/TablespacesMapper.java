package com.zzp.mall.mapper;

import com.zzp.mall.model.Tablespaces;
import com.zzp.mall.model.TablespacesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TablespacesMapper {
    int countByExample(TablespacesExample example);

    int deleteByExample(TablespacesExample example);

    int insert(Tablespaces record);

    int insertSelective(Tablespaces record);

    List<Tablespaces> selectByExample(TablespacesExample example);

    int updateByExampleSelective(@Param("record") Tablespaces record, @Param("example") TablespacesExample example);

    int updateByExample(@Param("record") Tablespaces record, @Param("example") TablespacesExample example);
}