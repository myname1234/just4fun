package com.example.mall.dao;

import com.example.mall.model.UmsResourceCategory;
import com.example.mall.model.UmsResourceCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsResourceCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    long countByExample(UmsResourceCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int deleteByExample(UmsResourceCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int insert(UmsResourceCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int insertSelective(UmsResourceCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    List<UmsResourceCategory> selectByExample(UmsResourceCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    UmsResourceCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int updateByExampleSelective(@Param("row") UmsResourceCategory row, @Param("example") UmsResourceCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int updateByExample(@Param("row") UmsResourceCategory row, @Param("example") UmsResourceCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int updateByPrimaryKeySelective(UmsResourceCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int updateByPrimaryKey(UmsResourceCategory row);
}