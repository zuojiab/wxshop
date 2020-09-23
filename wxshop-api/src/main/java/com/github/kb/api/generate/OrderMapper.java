package com.github.kb.api.generate;

import com.github.kb.api.generate.Order;
import com.github.kb.api.generate.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER
     *
     * @mbg.generated Thu Sep 24 01:16:26 CST 2020
     */
    long countByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER
     *
     * @mbg.generated Thu Sep 24 01:16:26 CST 2020
     */
    int deleteByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER
     *
     * @mbg.generated Thu Sep 24 01:16:26 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER
     *
     * @mbg.generated Thu Sep 24 01:16:26 CST 2020
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER
     *
     * @mbg.generated Thu Sep 24 01:16:26 CST 2020
     */
    int insertSelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER
     *
     * @mbg.generated Thu Sep 24 01:16:26 CST 2020
     */
    List<Order> selectByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER
     *
     * @mbg.generated Thu Sep 24 01:16:26 CST 2020
     */
    Order selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER
     *
     * @mbg.generated Thu Sep 24 01:16:26 CST 2020
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER
     *
     * @mbg.generated Thu Sep 24 01:16:26 CST 2020
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER
     *
     * @mbg.generated Thu Sep 24 01:16:26 CST 2020
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER
     *
     * @mbg.generated Thu Sep 24 01:16:26 CST 2020
     */
    int updateByPrimaryKey(Order record);
}