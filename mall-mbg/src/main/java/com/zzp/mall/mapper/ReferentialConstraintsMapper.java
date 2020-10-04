package com.zzp.mall.mapper;

import com.zzp.mall.model.ReferentialConstraints;
import com.zzp.mall.model.ReferentialConstraintsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReferentialConstraintsMapper {
    int countByExample(ReferentialConstraintsExample example);

    int deleteByExample(ReferentialConstraintsExample example);

    int insert(ReferentialConstraints record);

    int insertSelective(ReferentialConstraints record);

    List<ReferentialConstraints> selectByExample(ReferentialConstraintsExample example);

    int updateByExampleSelective(@Param("record") ReferentialConstraints record, @Param("example") ReferentialConstraintsExample example);

    int updateByExample(@Param("record") ReferentialConstraints record, @Param("example") ReferentialConstraintsExample example);
}