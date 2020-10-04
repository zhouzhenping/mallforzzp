package com.zzp.mall.mapper;

import com.zzp.mall.model.RoleTableGrants;
import com.zzp.mall.model.RoleTableGrantsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleTableGrantsMapper {
    int countByExample(RoleTableGrantsExample example);

    int deleteByExample(RoleTableGrantsExample example);

    int insert(RoleTableGrants record);

    int insertSelective(RoleTableGrants record);

    List<RoleTableGrants> selectByExample(RoleTableGrantsExample example);

    int updateByExampleSelective(@Param("record") RoleTableGrants record, @Param("example") RoleTableGrantsExample example);

    int updateByExample(@Param("record") RoleTableGrants record, @Param("example") RoleTableGrantsExample example);
}