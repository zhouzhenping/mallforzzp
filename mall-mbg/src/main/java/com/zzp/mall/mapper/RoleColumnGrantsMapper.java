package com.zzp.mall.mapper;

import com.zzp.mall.model.RoleColumnGrants;
import com.zzp.mall.model.RoleColumnGrantsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleColumnGrantsMapper {
    int countByExample(RoleColumnGrantsExample example);

    int deleteByExample(RoleColumnGrantsExample example);

    int insert(RoleColumnGrants record);

    int insertSelective(RoleColumnGrants record);

    List<RoleColumnGrants> selectByExample(RoleColumnGrantsExample example);

    int updateByExampleSelective(@Param("record") RoleColumnGrants record, @Param("example") RoleColumnGrantsExample example);

    int updateByExample(@Param("record") RoleColumnGrants record, @Param("example") RoleColumnGrantsExample example);
}