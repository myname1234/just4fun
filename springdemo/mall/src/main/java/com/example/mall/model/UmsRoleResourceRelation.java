package com.example.mall.model;

import java.io.Serializable;

public class UmsRoleResourceRelation implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role_resource_relation.id
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role_resource_relation.role_id
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    private Long roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role_resource_relation.resource_id
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    private Long resourceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_role_resource_relation
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role_resource_relation.id
     *
     * @return the value of ums_role_resource_relation.id
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role_resource_relation.id
     *
     * @param id the value for ums_role_resource_relation.id
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role_resource_relation.role_id
     *
     * @return the value of ums_role_resource_relation.role_id
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role_resource_relation.role_id
     *
     * @param roleId the value for ums_role_resource_relation.role_id
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role_resource_relation.resource_id
     *
     * @return the value of ums_role_resource_relation.resource_id
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public Long getResourceId() {
        return resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role_resource_relation.resource_id
     *
     * @param resourceId the value for ums_role_resource_relation.resource_id
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_resource_relation
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", resourceId=").append(resourceId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}