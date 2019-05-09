package com.xcx.dao;

import com.xcx.model.GatewayWithholdOrder;
import com.xcx.model.GatewayWithholdOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GatewayWithholdOrderMapper {
    int countByExample(GatewayWithholdOrderExample example);

    int deleteByExample(GatewayWithholdOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GatewayWithholdOrder record);

    int insertSelective(GatewayWithholdOrder record);

    List<GatewayWithholdOrder> selectByExample(GatewayWithholdOrderExample example);

    GatewayWithholdOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GatewayWithholdOrder record, @Param("example") GatewayWithholdOrderExample example);

    int updateByExample(@Param("record") GatewayWithholdOrder record, @Param("example") GatewayWithholdOrderExample example);

    int updateByPrimaryKeySelective(GatewayWithholdOrder record);

    int updateByPrimaryKey(GatewayWithholdOrder record);
}