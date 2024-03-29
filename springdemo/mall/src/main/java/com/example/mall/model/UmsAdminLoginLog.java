package com.example.mall.model;

import java.io.Serializable;
import java.util.Date;

public class UmsAdminLoginLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin_login_log.id
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin_login_log.admin_id
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    private Long adminId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin_login_log.create_time
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin_login_log.ip
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin_login_log.address
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin_login_log.user_agent
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    private String userAgent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_admin_login_log
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_login_log.id
     *
     * @return the value of ums_admin_login_log.id
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_login_log.id
     *
     * @param id the value for ums_admin_login_log.id
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_login_log.admin_id
     *
     * @return the value of ums_admin_login_log.admin_id
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public Long getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_login_log.admin_id
     *
     * @param adminId the value for ums_admin_login_log.admin_id
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_login_log.create_time
     *
     * @return the value of ums_admin_login_log.create_time
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_login_log.create_time
     *
     * @param createTime the value for ums_admin_login_log.create_time
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_login_log.ip
     *
     * @return the value of ums_admin_login_log.ip
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_login_log.ip
     *
     * @param ip the value for ums_admin_login_log.ip
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_login_log.address
     *
     * @return the value of ums_admin_login_log.address
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_login_log.address
     *
     * @param address the value for ums_admin_login_log.address
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_login_log.user_agent
     *
     * @return the value of ums_admin_login_log.user_agent
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_login_log.user_agent
     *
     * @param userAgent the value for ums_admin_login_log.user_agent
     *
     * @mbg.generated Sat Aug 12 16:18:25 CST 2023
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_login_log
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
        sb.append(", adminId=").append(adminId);
        sb.append(", createTime=").append(createTime);
        sb.append(", ip=").append(ip);
        sb.append(", address=").append(address);
        sb.append(", userAgent=").append(userAgent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}