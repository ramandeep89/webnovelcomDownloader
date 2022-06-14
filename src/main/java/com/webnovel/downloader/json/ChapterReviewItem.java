
package com.webnovel.downloader.json;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChapterReviewItem implements Serializable
{

    @SerializedName("reviewId")
    @Expose
    private String reviewId;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("userId")
    @Expose
    private Long userId;
    @SerializedName("createTime")
    @Expose
    private String createTime;
    @SerializedName("reviewType")
    @Expose
    private Integer reviewType;
    @SerializedName("pUserId")
    @Expose
    private Long pUserId;
    @SerializedName("pContent")
    @Expose
    private String pContent;
    @SerializedName("likeNums")
    @Expose
    private Integer likeNums;
    @SerializedName("isLiked")
    @Expose
    private Integer isLiked;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("pStatus")
    @Expose
    private Integer pStatus;
    @SerializedName("commentType")
    @Expose
    private Integer commentType;
    @SerializedName("appId")
    @Expose
    private Integer appId;
    @SerializedName("pAppId")
    @Expose
    private Integer pAppId;
    @SerializedName("UUT")
    @Expose
    private Long uut;
    @SerializedName("userName")
    @Expose
    private String userName;
    @SerializedName("avatar")
    @Expose
    private Long avatar;
    @SerializedName("penName")
    @Expose
    private String penName;
    @SerializedName("pUUT")
    @Expose
    private Long pUUT;
    @SerializedName("pUserName")
    @Expose
    private String pUserName;
    @SerializedName("pUserImg")
    @Expose
    private Long pUserImg;
    @SerializedName("pPenName")
    @Expose
    private String pPenName;
    @SerializedName("role")
    @Expose
    private Integer role;
    @SerializedName("userLevel")
    @Expose
    private Integer userLevel;
    @SerializedName("badgeInfo")
    @Expose
    private BadgeInfo badgeInfo;
    private final static long serialVersionUID = -4282887845047308626L;

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getReviewType() {
        return reviewType;
    }

    public void setReviewType(Integer reviewType) {
        this.reviewType = reviewType;
    }

    public Long getpUserId() {
        return pUserId;
    }

    public void setpUserId(Long pUserId) {
        this.pUserId = pUserId;
    }

    public String getpContent() {
        return pContent;
    }

    public void setpContent(String pContent) {
        this.pContent = pContent;
    }

    public Integer getLikeNums() {
        return likeNums;
    }

    public void setLikeNums(Integer likeNums) {
        this.likeNums = likeNums;
    }

    public Integer getIsLiked() {
        return isLiked;
    }

    public void setIsLiked(Integer isLiked) {
        this.isLiked = isLiked;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getpStatus() {
        return pStatus;
    }

    public void setpStatus(Integer pStatus) {
        this.pStatus = pStatus;
    }

    public Integer getCommentType() {
        return commentType;
    }

    public void setCommentType(Integer commentType) {
        this.commentType = commentType;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getpAppId() {
        return pAppId;
    }

    public void setpAppId(Integer pAppId) {
        this.pAppId = pAppId;
    }

    public Long getUut() {
        return uut;
    }

    public void setUut(Long uut) {
        this.uut = uut;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getAvatar() {
        return avatar;
    }

    public void setAvatar(Long avatar) {
        this.avatar = avatar;
    }

    public String getPenName() {
        return penName;
    }

    public void setPenName(String penName) {
        this.penName = penName;
    }

    public Long getpUUT() {
        return pUUT;
    }

    public void setpUUT(Long pUUT) {
        this.pUUT = pUUT;
    }

    public String getpUserName() {
        return pUserName;
    }

    public void setpUserName(String pUserName) {
        this.pUserName = pUserName;
    }

    public Long getpUserImg() {
        return pUserImg;
    }

    public void setpUserImg(Long pUserImg) {
        this.pUserImg = pUserImg;
    }

    public String getpPenName() {
        return pPenName;
    }

    public void setpPenName(String pPenName) {
        this.pPenName = pPenName;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public BadgeInfo getBadgeInfo() {
        return badgeInfo;
    }

    public void setBadgeInfo(BadgeInfo badgeInfo) {
        this.badgeInfo = badgeInfo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChapterReviewItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reviewId");
        sb.append('=');
        sb.append(((this.reviewId == null)?"<null>":this.reviewId));
        sb.append(',');
        sb.append("content");
        sb.append('=');
        sb.append(((this.content == null)?"<null>":this.content));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("createTime");
        sb.append('=');
        sb.append(((this.createTime == null)?"<null>":this.createTime));
        sb.append(',');
        sb.append("reviewType");
        sb.append('=');
        sb.append(((this.reviewType == null)?"<null>":this.reviewType));
        sb.append(',');
        sb.append("pUserId");
        sb.append('=');
        sb.append(((this.pUserId == null)?"<null>":this.pUserId));
        sb.append(',');
        sb.append("pContent");
        sb.append('=');
        sb.append(((this.pContent == null)?"<null>":this.pContent));
        sb.append(',');
        sb.append("likeNums");
        sb.append('=');
        sb.append(((this.likeNums == null)?"<null>":this.likeNums));
        sb.append(',');
        sb.append("isLiked");
        sb.append('=');
        sb.append(((this.isLiked == null)?"<null>":this.isLiked));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("pStatus");
        sb.append('=');
        sb.append(((this.pStatus == null)?"<null>":this.pStatus));
        sb.append(',');
        sb.append("commentType");
        sb.append('=');
        sb.append(((this.commentType == null)?"<null>":this.commentType));
        sb.append(',');
        sb.append("appId");
        sb.append('=');
        sb.append(((this.appId == null)?"<null>":this.appId));
        sb.append(',');
        sb.append("pAppId");
        sb.append('=');
        sb.append(((this.pAppId == null)?"<null>":this.pAppId));
        sb.append(',');
        sb.append("uut");
        sb.append('=');
        sb.append(((this.uut == null)?"<null>":this.uut));
        sb.append(',');
        sb.append("userName");
        sb.append('=');
        sb.append(((this.userName == null)?"<null>":this.userName));
        sb.append(',');
        sb.append("avatar");
        sb.append('=');
        sb.append(((this.avatar == null)?"<null>":this.avatar));
        sb.append(',');
        sb.append("penName");
        sb.append('=');
        sb.append(((this.penName == null)?"<null>":this.penName));
        sb.append(',');
        sb.append("pUUT");
        sb.append('=');
        sb.append(((this.pUUT == null)?"<null>":this.pUUT));
        sb.append(',');
        sb.append("pUserName");
        sb.append('=');
        sb.append(((this.pUserName == null)?"<null>":this.pUserName));
        sb.append(',');
        sb.append("pUserImg");
        sb.append('=');
        sb.append(((this.pUserImg == null)?"<null>":this.pUserImg));
        sb.append(',');
        sb.append("pPenName");
        sb.append('=');
        sb.append(((this.pPenName == null)?"<null>":this.pPenName));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
        sb.append(',');
        sb.append("userLevel");
        sb.append('=');
        sb.append(((this.userLevel == null)?"<null>":this.userLevel));
        sb.append(',');
        sb.append("badgeInfo");
        sb.append('=');
        sb.append(((this.badgeInfo == null)?"<null>":this.badgeInfo));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
