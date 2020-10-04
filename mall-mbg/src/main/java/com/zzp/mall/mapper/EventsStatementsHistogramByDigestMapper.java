package com.zzp.mall.mapper;

import com.zzp.mall.model.EventsStatementsHistogramByDigest;
import com.zzp.mall.model.EventsStatementsHistogramByDigestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsHistogramByDigestMapper {
    int countByExample(EventsStatementsHistogramByDigestExample example);

    int deleteByExample(EventsStatementsHistogramByDigestExample example);

    int insert(EventsStatementsHistogramByDigest record);

    int insertSelective(EventsStatementsHistogramByDigest record);

    List<EventsStatementsHistogramByDigest> selectByExample(EventsStatementsHistogramByDigestExample example);

    int updateByExampleSelective(@Param("record") EventsStatementsHistogramByDigest record, @Param("example") EventsStatementsHistogramByDigestExample example);

    int updateByExample(@Param("record") EventsStatementsHistogramByDigest record, @Param("example") EventsStatementsHistogramByDigestExample example);
}