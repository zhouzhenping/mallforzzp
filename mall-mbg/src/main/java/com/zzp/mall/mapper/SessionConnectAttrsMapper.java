package com.zzp.mall.mapper;

import com.zzp.mall.model.SessionConnectAttrs;
import com.zzp.mall.model.SessionConnectAttrsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionConnectAttrsMapper {
    int countByExample(SessionConnectAttrsExample example);

    int deleteByExample(SessionConnectAttrsExample example);

    int deleteByPrimaryKey(@Param("processlistId") Long processlistId, @Param("attrName") String attrName);

    int insert(SessionConnectAttrs record);

    int insertSelective(SessionConnectAttrs record);

    List<SessionConnectAttrs> selectByExample(SessionConnectAttrsExample example);

    SessionConnectAttrs selectByPrimaryKey(@Param("processlistId") Long processlistId, @Param("attrName") String attrName);

    int updateByExampleSelective(@Param("record") SessionConnectAttrs record, @Param("example") SessionConnectAttrsExample example);

    int updateByExample(@Param("record") SessionConnectAttrs record, @Param("example") SessionConnectAttrsExample example);

    int updateByPrimaryKeySelective(SessionConnectAttrs record);

    int updateByPrimaryKey(SessionConnectAttrs record);
}