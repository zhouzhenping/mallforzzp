package com.zzp.mall.mapper;

import com.zzp.mall.model.Hosts;
import com.zzp.mall.model.HostsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostsMapper {
    int countByExample(HostsExample example);

    int deleteByExample(HostsExample example);

    int insert(Hosts record);

    int insertSelective(Hosts record);

    List<Hosts> selectByExample(HostsExample example);

    int updateByExampleSelective(@Param("record") Hosts record, @Param("example") HostsExample example);

    int updateByExample(@Param("record") Hosts record, @Param("example") HostsExample example);
}