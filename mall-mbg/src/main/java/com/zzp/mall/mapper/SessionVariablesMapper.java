package com.zzp.mall.mapper;

import com.zzp.mall.model.SessionVariables;
import com.zzp.mall.model.SessionVariablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionVariablesMapper {
    int countByExample(SessionVariablesExample example);

    int deleteByExample(SessionVariablesExample example);

    int deleteByPrimaryKey(String variableName);

    int insert(SessionVariables record);

    int insertSelective(SessionVariables record);

    List<SessionVariables> selectByExample(SessionVariablesExample example);

    SessionVariables selectByPrimaryKey(String variableName);

    int updateByExampleSelective(@Param("record") SessionVariables record, @Param("example") SessionVariablesExample example);

    int updateByExample(@Param("record") SessionVariables record, @Param("example") SessionVariablesExample example);

    int updateByPrimaryKeySelective(SessionVariables record);

    int updateByPrimaryKey(SessionVariables record);
}