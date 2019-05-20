package com.griftt.biz.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 参与作品
 * </p>
 *
 * @author hyf
 * @since 2019-04-27
 */
@TableName("sa_works")
public class Works implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 活动众测id
     */
    @TableField("activity_id")
    private Integer activityId;

    /**
     * 类型：众测1，活动2
     */
    @TableField("project_type")
    private Integer projectType;

    /**
     * 用户id
     */
    @TableField("player_id")
    private Integer playerId;

    /**
     * 用户名称
     */
    @TableField("user_name")
    private String userName;

    /**
     * 用户名称
     */
    @TableField("head_pic")
    private String headPic;

    /**
     * 内容
     */
    @TableField("text")
    private String text;

    /**
     * 浏览量
     */
    @TableField("watch")
    private Integer watch;

    /**
     * 点赞数
     */
    @TableField("praise")
    private Integer praise;

    /**
     * 标识(置顶/)
     */
    @TableField("mark")
    private Integer mark;

    /**
     * 状态 1 ：等待 2：发布 3：拒绝 4 下线
     */
    @TableField("status")
    private Integer status;

    /**
     * 名次
     *
     */
    @TableField("sort")
    private Integer sort;

    /**
     * 下线时间
     */
    @TableField("offline_time")
    private Date offlineTime;

    /**
     * 处理人
     */
    @TableField("handle_person")
    private Long handlePerson;

    /**
     * 备注
     */
    @TableField("content")
    private String content;

    /**
     * 处理时间
     */
    @TableField("handle_time")
    private Date handleTime;

    /**
     * 部门id
     */
    @TableField("deptid")
    private Integer deptid;

    /**
     * 新增时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private Date updateTime;

    /**
     * 记录状态
     */
    @TableField("record_status")
    private Integer recordStatus;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getProjectType() {
        return projectType;
    }

    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getWatch() {
        return watch;
    }

    public void setWatch(Integer watch) {
        this.watch = watch;
    }

    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getOfflineTime() {
        return offlineTime;
    }

    public void setOfflineTime(Date offlineTime) {
        this.offlineTime = offlineTime;
    }

    public Long getHandlePerson() {
        return handlePerson;
    }

    public void setHandlePerson(Long handlePerson) {
        this.handlePerson = handlePerson;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
    }

    @Override
    public String toString() {
        return "Works{" +
                "id=" + id +
                ", activityId=" + activityId +
                ", projectType=" + projectType +
                ", playerId=" + playerId +
                ", userName=" + userName +
                ", headPic=" + headPic +
                ", text=" + text +
                ", watch=" + watch +
                ", praise=" + praise +
                ", mark=" + mark +
                ", status=" + status +
                ", offlineTime=" + offlineTime +
                ", handlePerson=" + handlePerson +
                ", content=" + content +
                ", handleTime=" + handleTime +
                ", deptid=" + deptid +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", recordStatus=" + recordStatus +
                "}";
    }
}
