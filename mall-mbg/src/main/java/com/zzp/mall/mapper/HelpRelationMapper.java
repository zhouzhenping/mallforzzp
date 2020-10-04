package com.zzp.mall.mapper;

import com.zzp.mall.model.HelpRelation;
import com.zzp.mall.model.HelpRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpRelationMapper {
    int countByExample(HelpRelationExample example);

    int deleteByExample(HelpRelationExample example);

    int deleteByPrimaryKey(@Param("helpKeywordId") Integer helpKeywordId, @Param("helpTopicId") Integer helpTopicId);

    int insert(HelpRelation record);

    int insertSelective(HelpRelation record);

    List<HelpRelation> selectByExample(HelpRelationExample example);

    int updateByExampleSelective(@Param("record") HelpRelation record, @Param("example") HelpRelationExample example);

    int updateByExample(@Param("record") HelpRelation record, @Param("example") HelpRelationExample example);
}