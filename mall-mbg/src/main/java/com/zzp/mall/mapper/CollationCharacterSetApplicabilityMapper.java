package com.zzp.mall.mapper;

import com.zzp.mall.model.CollationCharacterSetApplicability;
import com.zzp.mall.model.CollationCharacterSetApplicabilityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollationCharacterSetApplicabilityMapper {
    int countByExample(CollationCharacterSetApplicabilityExample example);

    int deleteByExample(CollationCharacterSetApplicabilityExample example);

    int insert(CollationCharacterSetApplicability record);

    int insertSelective(CollationCharacterSetApplicability record);

    List<CollationCharacterSetApplicability> selectByExample(CollationCharacterSetApplicabilityExample example);

    int updateByExampleSelective(@Param("record") CollationCharacterSetApplicability record, @Param("example") CollationCharacterSetApplicabilityExample example);

    int updateByExample(@Param("record") CollationCharacterSetApplicability record, @Param("example") CollationCharacterSetApplicabilityExample example);
}