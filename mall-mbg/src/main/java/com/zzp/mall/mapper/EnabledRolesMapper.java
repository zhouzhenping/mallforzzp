package com.zzp.mall.mapper;

import com.zzp.mall.model.EnabledRoles;
import com.zzp.mall.model.EnabledRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnabledRolesMapper {
    int countByExample(EnabledRolesExample example);

    int deleteByExample(EnabledRolesExample example);

    int insert(EnabledRoles record);

    int insertSelective(EnabledRoles record);

    List<EnabledRoles> selectByExample(EnabledRolesExample example);

    int updateByExampleSelective(@Param("record") EnabledRoles record, @Param("example") EnabledRolesExample example);

    int updateByExample(@Param("record") EnabledRoles record, @Param("example") EnabledRolesExample example);
}