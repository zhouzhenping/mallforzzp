package com.zzp.mall.mapper;

import com.zzp.mall.model.SlaveWorkerInfo;
import com.zzp.mall.model.SlaveWorkerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SlaveWorkerInfoMapper {
    int countByExample(SlaveWorkerInfoExample example);

    int deleteByExample(SlaveWorkerInfoExample example);

    int deleteByPrimaryKey(@Param("channelName") String channelName, @Param("id") Integer id);

    int insert(SlaveWorkerInfo record);

    int insertSelective(SlaveWorkerInfo record);

    List<SlaveWorkerInfo> selectByExampleWithBLOBs(SlaveWorkerInfoExample example);

    List<SlaveWorkerInfo> selectByExample(SlaveWorkerInfoExample example);

    SlaveWorkerInfo selectByPrimaryKey(@Param("channelName") String channelName, @Param("id") Integer id);

    int updateByExampleSelective(@Param("record") SlaveWorkerInfo record, @Param("example") SlaveWorkerInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SlaveWorkerInfo record, @Param("example") SlaveWorkerInfoExample example);

    int updateByExample(@Param("record") SlaveWorkerInfo record, @Param("example") SlaveWorkerInfoExample example);

    int updateByPrimaryKeySelective(SlaveWorkerInfo record);

    int updateByPrimaryKeyWithBLOBs(SlaveWorkerInfo record);

    int updateByPrimaryKey(SlaveWorkerInfo record);
}