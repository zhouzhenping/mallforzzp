package com.zzp.mall.mapper;

import com.zzp.mall.model.TimeZoneTransitionType;
import com.zzp.mall.model.TimeZoneTransitionTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeZoneTransitionTypeMapper {
    int countByExample(TimeZoneTransitionTypeExample example);

    int deleteByExample(TimeZoneTransitionTypeExample example);

    int deleteByPrimaryKey(@Param("timeZoneId") Integer timeZoneId, @Param("transitionTypeId") Integer transitionTypeId);

    int insert(TimeZoneTransitionType record);

    int insertSelective(TimeZoneTransitionType record);

    List<TimeZoneTransitionType> selectByExample(TimeZoneTransitionTypeExample example);

    TimeZoneTransitionType selectByPrimaryKey(@Param("timeZoneId") Integer timeZoneId, @Param("transitionTypeId") Integer transitionTypeId);

    int updateByExampleSelective(@Param("record") TimeZoneTransitionType record, @Param("example") TimeZoneTransitionTypeExample example);

    int updateByExample(@Param("record") TimeZoneTransitionType record, @Param("example") TimeZoneTransitionTypeExample example);

    int updateByPrimaryKeySelective(TimeZoneTransitionType record);

    int updateByPrimaryKey(TimeZoneTransitionType record);
}