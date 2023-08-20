package com.example.mall.dao;

import com.example.mall.model.UmsRoleMenuRelation;
import com.example.mall.model.UmsRoleMenuRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsRoleMenuRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    long countByExample(UmsRoleMenuRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int deleteByExample(UmsRoleMenuRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int insert(UmsRoleMenuRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int insertSelective(UmsRoleMenuRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    List<UmsRoleMenuRelation> selectByExample(UmsRoleMenuRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    UmsRoleMenuRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int updateByExampleSelective(@Param("row") UmsRoleMenuRelation row, @Param("example") UmsRoleMenuRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int updateByExample(@Param("row") UmsRoleMenuRelation row, @Param("example") UmsRoleMenuRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int updateByPrimaryKeySelective(UmsRoleMenuRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    int updateByPrimaryKey(UmsRoleMenuRelation row);
}