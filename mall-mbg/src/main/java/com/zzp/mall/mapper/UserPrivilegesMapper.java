package com.zzp.mall.mapper;

import com.zzp.mall.model.UserPrivileges;
import com.zzp.mall.model.UserPrivilegesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPrivilegesMapper {
    int countByExample(UserPrivilegesExample example);

    int deleteByExample(UserPrivilegesExample example);

    int insert(UserPrivileges record);

    int insertSelective(UserPrivileges record);

    List<UserPrivileges> selectByExample(UserPrivilegesExample example);

    int updateByExampleSelective(@Param("record") UserPrivileges record, @Param("example") UserPrivilegesExample example);

    int updateByExample(@Param("record") UserPrivileges record, @Param("example") UserPrivilegesExample example);
}