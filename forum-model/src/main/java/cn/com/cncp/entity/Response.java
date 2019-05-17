package cn.com.cncp.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_response")
public class Response implements Serializable {
    /**
     * 响应id
     */
    @Id
    @Column(name = "tr_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String trId;

    /**
     * 需求编号
     */
    @Column(name = "td_id")
    private String tdId;

    /**
     * 响应对象名称
     */
    @Column(name = "td_title")
    private String tdTitle;

    /**
     * 响应编号
     */
    @Column(name = "tr_number")
    private String trNumber;

    /**
     * 响应内容
     */
    @Column(name = "tr_content")
    private String trContent;

    /**
     * 响应可见权限
     */
    @Column(name = "tr_right")
    private String trRight;

    /**
     * 响应状态
     */
    @Column(name = "tr_stauts")
    private String trStauts;

    /**
     * 创建人id
     */
    @Column(name = "create_user_id")
    private String createUserId;

    /**
     * 创建人姓名
     */
    @Column(name = "create_user_name")
    private String createUserName;

    /**
     * 创建人单位id
     */
    @Column(name = "create_user_org_id")
    private String createUserOrgId;

    /**
     * 创建人单位名称
     */
    @Column(name = "create_user_org_name")
    private String createUserOrgName;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改人id
     */
    @Column(name = "update_user_id")
    private String updateUserId;

    /**
     * 修改人名称
     */
    @Column(name = "update_user_name")
    private String updateUserName;

    /**
     * 修改人单位id
     */
    @Column(name = "update_user_org_id")
    private String updateUserOrgId;

    /**
     * 修改人单位名称
     */
    @Column(name = "update_user_org_name")
    private String updateUserOrgName;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取响应id
     *
     * @return tr_id - 响应id
     */
    public String getTrId() {
        return trId;
    }

    /**
     * 设置响应id
     *
     * @param trId 响应id
     */
    public void setTrId(String trId) {
        this.trId = trId;
    }

    /**
     * 获取需求编号
     *
     * @return td_id - 需求编号
     */
    public String getTdId() {
        return tdId;
    }

    /**
     * 设置需求编号
     *
     * @param tdId 需求编号
     */
    public void setTdId(String tdId) {
        this.tdId = tdId;
    }

    /**
     * 获取响应对象名称
     *
     * @return td_title - 响应对象名称
     */
    public String getTdTitle() {
        return tdTitle;
    }

    /**
     * 设置响应对象名称
     *
     * @param tdTitle 响应对象名称
     */
    public void setTdTitle(String tdTitle) {
        this.tdTitle = tdTitle;
    }

    /**
     * 获取响应编号
     *
     * @return tr_number - 响应编号
     */
    public String getTrNumber() {
        return trNumber;
    }

    /**
     * 设置响应编号
     *
     * @param trNumber 响应编号
     */
    public void setTrNumber(String trNumber) {
        this.trNumber = trNumber;
    }

    /**
     * 获取响应内容
     *
     * @return tr_content - 响应内容
     */
    public String getTrContent() {
        return trContent;
    }

    /**
     * 设置响应内容
     *
     * @param trContent 响应内容
     */
    public void setTrContent(String trContent) {
        this.trContent = trContent;
    }

    /**
     * 获取响应可见权限
     *
     * @return tr_right - 响应可见权限
     */
    public String getTrRight() {
        return trRight;
    }

    /**
     * 设置响应可见权限
     *
     * @param trRight 响应可见权限
     */
    public void setTrRight(String trRight) {
        this.trRight = trRight;
    }

    /**
     * 获取响应状态
     *
     * @return tr_stauts - 响应状态
     */
    public String getTrStauts() {
        return trStauts;
    }

    /**
     * 设置响应状态
     *
     * @param trStauts 响应状态
     */
    public void setTrStauts(String trStauts) {
        this.trStauts = trStauts;
    }

    /**
     * 获取创建人id
     *
     * @return create_user_id - 创建人id
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建人id
     *
     * @param createUserId 创建人id
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取创建人姓名
     *
     * @return create_user_name - 创建人姓名
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 设置创建人姓名
     *
     * @param createUserName 创建人姓名
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    /**
     * 获取创建人单位id
     *
     * @return create_user_org_id - 创建人单位id
     */
    public String getCreateUserOrgId() {
        return createUserOrgId;
    }

    /**
     * 设置创建人单位id
     *
     * @param createUserOrgId 创建人单位id
     */
    public void setCreateUserOrgId(String createUserOrgId) {
        this.createUserOrgId = createUserOrgId;
    }

    /**
     * 获取创建人单位名称
     *
     * @return create_user_org_name - 创建人单位名称
     */
    public String getCreateUserOrgName() {
        return createUserOrgName;
    }

    /**
     * 设置创建人单位名称
     *
     * @param createUserOrgName 创建人单位名称
     */
    public void setCreateUserOrgName(String createUserOrgName) {
        this.createUserOrgName = createUserOrgName;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改人id
     *
     * @return update_user_id - 修改人id
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 设置修改人id
     *
     * @param updateUserId 修改人id
     */
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * 获取修改人名称
     *
     * @return update_user_name - 修改人名称
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**
     * 设置修改人名称
     *
     * @param updateUserName 修改人名称
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    /**
     * 获取修改人单位id
     *
     * @return update_user_org_id - 修改人单位id
     */
    public String getUpdateUserOrgId() {
        return updateUserOrgId;
    }

    /**
     * 设置修改人单位id
     *
     * @param updateUserOrgId 修改人单位id
     */
    public void setUpdateUserOrgId(String updateUserOrgId) {
        this.updateUserOrgId = updateUserOrgId;
    }

    /**
     * 获取修改人单位名称
     *
     * @return update_user_org_name - 修改人单位名称
     */
    public String getUpdateUserOrgName() {
        return updateUserOrgName;
    }

    /**
     * 设置修改人单位名称
     *
     * @param updateUserOrgName 修改人单位名称
     */
    public void setUpdateUserOrgName(String updateUserOrgName) {
        this.updateUserOrgName = updateUserOrgName;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", trId=").append(trId);
        sb.append(", tdId=").append(tdId);
        sb.append(", tdTitle=").append(tdTitle);
        sb.append(", trNumber=").append(trNumber);
        sb.append(", trContent=").append(trContent);
        sb.append(", trRight=").append(trRight);
        sb.append(", trStauts=").append(trStauts);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createUserName=").append(createUserName);
        sb.append(", createUserOrgId=").append(createUserOrgId);
        sb.append(", createUserOrgName=").append(createUserOrgName);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", updateUserName=").append(updateUserName);
        sb.append(", updateUserOrgId=").append(updateUserOrgId);
        sb.append(", updateUserOrgName=").append(updateUserOrgName);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}