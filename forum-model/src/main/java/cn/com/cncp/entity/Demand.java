package cn.com.cncp.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_demand")
public class Demand implements Serializable {
    /**
     * 需求id
     */
    @Id
    @Column(name = "td_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String tdId;

    /**
     * 需求编号
     */
    @Column(name = "td_number")
    private String tdNumber;

    /**
     * 标题
     */
    @Column(name = "td_title")
    private String tdTitle;

    /**
     * 需求板块
     */
    @Column(name = "td_plate_type")
    private String tdPlateType;

    /**
     * 需求职能
     */
    @Column(name = "td_function_one")
    private String tdFunctionOne;

    /**
     * 需求标签
     */
    @Column(name = "td_label")
    private String tdLabel;

    /**
     * 需求场景
     */
    @Column(name = "td_scene")
    private String tdScene;

    /**
     * 需求状态
     */
    @Column(name = "td_stauts")
    private String tdStauts;

    @Column(name = "td_is_delete")
    private String tdIsDelete;

    /**
     * 需求单位类型
     */
    @Column(name = "td_apply_org_type")
    private String tdApplyOrgType;

    /**
     * 创建人id
     */
    @Column(name = "create_user_id")
    private String createUserId;

    /**
     * 创建人名称
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
     * 申请人名称
     */
    @Column(name = "apply_user_org_name")
    private String applyUserOrgName;

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

    /**
     * 响应次数
     */
    @Column(name = "response_times")
    private Integer responseTimes;

    /**
     * 浏览次数
     */
    @Column(name = "browse_times")
    private Integer browseTimes;

    /**
     * 需求内容
     */
    @Column(name = "td_content")
    private String tdContent;

    private static final long serialVersionUID = 1L;

    /**
     * 获取需求id
     *
     * @return td_id - 需求id
     */
    public String getTdId() {
        return tdId;
    }

    /**
     * 设置需求id
     *
     * @param tdId 需求id
     */
    public void setTdId(String tdId) {
        this.tdId = tdId;
    }

    /**
     * 获取需求编号
     *
     * @return td_number - 需求编号
     */
    public String getTdNumber() {
        return tdNumber;
    }

    /**
     * 设置需求编号
     *
     * @param tdNumber 需求编号
     */
    public void setTdNumber(String tdNumber) {
        this.tdNumber = tdNumber;
    }

    /**
     * 获取标题
     *
     * @return td_title - 标题
     */
    public String getTdTitle() {
        return tdTitle;
    }

    /**
     * 设置标题
     *
     * @param tdTitle 标题
     */
    public void setTdTitle(String tdTitle) {
        this.tdTitle = tdTitle;
    }

    /**
     * 获取需求板块
     *
     * @return td_plate_type - 需求板块
     */
    public String getTdPlateType() {
        return tdPlateType;
    }

    /**
     * 设置需求板块
     *
     * @param tdPlateType 需求板块
     */
    public void setTdPlateType(String tdPlateType) {
        this.tdPlateType = tdPlateType;
    }

    /**
     * 获取需求职能
     *
     * @return td_function_one - 需求职能
     */
    public String getTdFunctionOne() {
        return tdFunctionOne;
    }

    /**
     * 设置需求职能
     *
     * @param tdFunctionOne 需求职能
     */
    public void setTdFunctionOne(String tdFunctionOne) {
        this.tdFunctionOne = tdFunctionOne;
    }

    /**
     * 获取需求标签
     *
     * @return td_label - 需求标签
     */
    public String getTdLabel() {
        return tdLabel;
    }

    /**
     * 设置需求标签
     *
     * @param tdLabel 需求标签
     */
    public void setTdLabel(String tdLabel) {
        this.tdLabel = tdLabel;
    }

    /**
     * 获取需求场景
     *
     * @return td_scene - 需求场景
     */
    public String getTdScene() {
        return tdScene;
    }

    /**
     * 设置需求场景
     *
     * @param tdScene 需求场景
     */
    public void setTdScene(String tdScene) {
        this.tdScene = tdScene;
    }

    /**
     * 获取需求状态
     *
     * @return td_stauts - 需求状态
     */
    public String getTdStauts() {
        return tdStauts;
    }

    /**
     * 设置需求状态
     *
     * @param tdStauts 需求状态
     */
    public void setTdStauts(String tdStauts) {
        this.tdStauts = tdStauts;
    }

    /**
     * @return td_is_delete
     */
    public String getTdIsDelete() {
        return tdIsDelete;
    }

    /**
     * @param tdIsDelete
     */
    public void setTdIsDelete(String tdIsDelete) {
        this.tdIsDelete = tdIsDelete;
    }

    /**
     * 获取需求单位类型
     *
     * @return td_apply_org_type - 需求单位类型
     */
    public String getTdApplyOrgType() {
        return tdApplyOrgType;
    }

    /**
     * 设置需求单位类型
     *
     * @param tdApplyOrgType 需求单位类型
     */
    public void setTdApplyOrgType(String tdApplyOrgType) {
        this.tdApplyOrgType = tdApplyOrgType;
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
     * 获取创建人名称
     *
     * @return create_user_name - 创建人名称
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 设置创建人名称
     *
     * @param createUserName 创建人名称
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
     * 获取申请人名称
     *
     * @return apply_user_org_name - 申请人名称
     */
    public String getApplyUserOrgName() {
        return applyUserOrgName;
    }

    /**
     * 设置申请人名称
     *
     * @param applyUserOrgName 申请人名称
     */
    public void setApplyUserOrgName(String applyUserOrgName) {
        this.applyUserOrgName = applyUserOrgName;
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

    /**
     * 获取响应次数
     *
     * @return response_times - 响应次数
     */
    public Integer getResponseTimes() {
        return responseTimes;
    }

    /**
     * 设置响应次数
     *
     * @param responseTimes 响应次数
     */
    public void setResponseTimes(Integer responseTimes) {
        this.responseTimes = responseTimes;
    }

    /**
     * 获取浏览次数
     *
     * @return browse_times - 浏览次数
     */
    public Integer getBrowseTimes() {
        return browseTimes;
    }

    /**
     * 设置浏览次数
     *
     * @param browseTimes 浏览次数
     */
    public void setBrowseTimes(Integer browseTimes) {
        this.browseTimes = browseTimes;
    }

    /**
     * 获取需求内容
     *
     * @return td_content - 需求内容
     */
    public String getTdContent() {
        return tdContent;
    }

    /**
     * 设置需求内容
     *
     * @param tdContent 需求内容
     */
    public void setTdContent(String tdContent) {
        this.tdContent = tdContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tdId=").append(tdId);
        sb.append(", tdNumber=").append(tdNumber);
        sb.append(", tdTitle=").append(tdTitle);
        sb.append(", tdPlateType=").append(tdPlateType);
        sb.append(", tdFunctionOne=").append(tdFunctionOne);
        sb.append(", tdLabel=").append(tdLabel);
        sb.append(", tdScene=").append(tdScene);
        sb.append(", tdStauts=").append(tdStauts);
        sb.append(", tdIsDelete=").append(tdIsDelete);
        sb.append(", tdApplyOrgType=").append(tdApplyOrgType);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createUserName=").append(createUserName);
        sb.append(", createUserOrgId=").append(createUserOrgId);
        sb.append(", createUserOrgName=").append(createUserOrgName);
        sb.append(", createTime=").append(createTime);
        sb.append(", applyUserOrgName=").append(applyUserOrgName);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", updateUserName=").append(updateUserName);
        sb.append(", updateUserOrgId=").append(updateUserOrgId);
        sb.append(", updateUserOrgName=").append(updateUserOrgName);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", responseTimes=").append(responseTimes);
        sb.append(", browseTimes=").append(browseTimes);
        sb.append(", tdContent=").append(tdContent);
        sb.append("]");
        return sb.toString();
    }
}