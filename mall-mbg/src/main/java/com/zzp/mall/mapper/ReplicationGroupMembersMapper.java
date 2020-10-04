package com.zzp.mall.mapper;

import com.zzp.mall.model.ReplicationGroupMembers;
import com.zzp.mall.model.ReplicationGroupMembersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationGroupMembersMapper {
    int countByExample(ReplicationGroupMembersExample example);

    int deleteByExample(ReplicationGroupMembersExample example);

    int insert(ReplicationGroupMembers record);

    int insertSelective(ReplicationGroupMembers record);

    List<ReplicationGroupMembers> selectByExample(ReplicationGroupMembersExample example);

    int updateByExampleSelective(@Param("record") ReplicationGroupMembers record, @Param("example") ReplicationGroupMembersExample example);

    int updateByExample(@Param("record") ReplicationGroupMembers record, @Param("example") ReplicationGroupMembersExample example);
}