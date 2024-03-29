package com.example.mall.model;

import java.io.Serializable;
import java.util.Date;

public class UmsRole implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role.id
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role.name
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role.description
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role.admin_count
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    private Integer adminCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role.create_time
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role.status
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role.sort
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_role
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.id
     *
     * @return the value of ums_role.id
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.id
     *
     * @param id the value for ums_role.id
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.name
     *
     * @return the value of ums_role.name
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.name
     *
     * @param name the value for ums_role.name
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.description
     *
     * @return the value of ums_role.description
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.description
     *
     * @param description the value for ums_role.description
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.admin_count
     *
     * @return the value of ums_role.admin_count
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public Integer getAdminCount() {
        return adminCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.admin_count
     *
     * @param adminCount the value for ums_role.admin_count
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public void setAdminCount(Integer adminCount) {
        this.adminCount = adminCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.create_time
     *
     * @return the value of ums_role.create_time
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.create_time
     *
     * @param createTime the value for ums_role.create_time
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.status
     *
     * @return the value of ums_role.status
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.status
     *
     * @param status the value for ums_role.status
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.sort
     *
     * @return the value of ums_role.sort
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.sort
     *
     * @param sort the value for ums_role.sort
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
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
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", adminCount=").append(adminCount);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}