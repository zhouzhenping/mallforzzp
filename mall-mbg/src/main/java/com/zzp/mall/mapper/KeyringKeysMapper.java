package com.zzp.mall.mapper;

import com.zzp.mall.model.KeyringKeys;
import com.zzp.mall.model.KeyringKeysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeyringKeysMapper {
    int countByExample(KeyringKeysExample example);

    int deleteByExample(KeyringKeysExample example);

    int insert(KeyringKeys record);

    int insertSelective(KeyringKeys record);

    List<KeyringKeys> selectByExample(KeyringKeysExample example);

    int updateByExampleSelective(@Param("record") KeyringKeys record, @Param("example") KeyringKeysExample example);

    int updateByExample(@Param("record") KeyringKeys record, @Param("example") KeyringKeysExample example);
}