package com.example.mall.dao;

import com.example.mall.model.UmsMenu;
import com.example.mall.model.UmsMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    long countByExample(UmsMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int deleteByExample(UmsMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int insert(UmsMenu row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int insertSelective(UmsMenu row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    List<UmsMenu> selectByExample(UmsMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    UmsMenu selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int updateByExampleSelective(@Param("row") UmsMenu row, @Param("example") UmsMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int updateByExample(@Param("row") UmsMenu row, @Param("example") UmsMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int updateByPrimaryKeySelective(UmsMenu row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int updateByPrimaryKey(UmsMenu row);
}