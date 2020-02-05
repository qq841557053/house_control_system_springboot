package com.yechrom.cloud.dto.mapper;

import com.yechrom.cloud.dto.pojo.SellHouse;
import com.yechrom.cloud.dto.pojo.SellHouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SellHouseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sell_house
     *
     * @mbggenerated Sat Jan 25 10:16:00 CST 2020
     */
    int countByExample(SellHouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sell_house
     *
     * @mbggenerated Sat Jan 25 10:16:00 CST 2020
     */
    int deleteByExample(SellHouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sell_house
     *
     * @mbggenerated Sat Jan 25 10:16:00 CST 2020
     */
    int deleteByPrimaryKey(String sellOrder);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sell_house
     *
     * @mbggenerated Sat Jan 25 10:16:00 CST 2020
     */
    int insert(SellHouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sell_house
     *
     * @mbggenerated Sat Jan 25 10:16:00 CST 2020
     */
    int insertSelective(SellHouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sell_house
     *
     * @mbggenerated Sat Jan 25 10:16:00 CST 2020
     */
    List<SellHouse> selectByExample(SellHouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sell_house
     *
     * @mbggenerated Sat Jan 25 10:16:00 CST 2020
     */
    SellHouse selectByPrimaryKey(String sellOrder);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sell_house
     *
     * @mbggenerated Sat Jan 25 10:16:00 CST 2020
     */
    int updateByExampleSelective(@Param("record") SellHouse record, @Param("example") SellHouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sell_house
     *
     * @mbggenerated Sat Jan 25 10:16:00 CST 2020
     */
    int updateByExample(@Param("record") SellHouse record, @Param("example") SellHouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sell_house
     *
     * @mbggenerated Sat Jan 25 10:16:00 CST 2020
     */
    int updateByPrimaryKeySelective(SellHouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sell_house
     *
     * @mbggenerated Sat Jan 25 10:16:00 CST 2020
     */
    int updateByPrimaryKey(SellHouse record);
}