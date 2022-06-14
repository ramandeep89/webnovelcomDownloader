
package com.webnovel.downloader.json;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BadgeInfo implements Serializable
{

    @SerializedName("badgeId")
    @Expose
    private Integer badgeId;
    @SerializedName("badgeType")
    @Expose
    private String badgeType;
    @SerializedName("badgeName")
    @Expose
    private String badgeName;
    @SerializedName("maxGrade")
    @Expose
    private Integer maxGrade;
    @SerializedName("baseUrl")
    @Expose
    private String baseUrl;
    @SerializedName("updateTime")
    @Expose
    private Long updateTime;
    private final static long serialVersionUID = -2810130584945093497L;

    public Integer getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(Integer badgeId) {
        this.badgeId = badgeId;
    }

    public String getBadgeType() {
        return badgeType;
    }

    public void setBadgeType(String badgeType) {
        this.badgeType = badgeType;
    }

    public String getBadgeName() {
        return badgeName;
    }

    public void setBadgeName(String badgeName) {
        this.badgeName = badgeName;
    }

    public Integer getMaxGrade() {
        return maxGrade;
    }

    public void setMaxGrade(Integer maxGrade) {
        this.maxGrade = maxGrade;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BadgeInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("badgeId");
        sb.append('=');
        sb.append(((this.badgeId == null)?"<null>":this.badgeId));
        sb.append(',');
        sb.append("badgeType");
        sb.append('=');
        sb.append(((this.badgeType == null)?"<null>":this.badgeType));
        sb.append(',');
        sb.append("badgeName");
        sb.append('=');
        sb.append(((this.badgeName == null)?"<null>":this.badgeName));
        sb.append(',');
        sb.append("maxGrade");
        sb.append('=');
        sb.append(((this.maxGrade == null)?"<null>":this.maxGrade));
        sb.append(',');
        sb.append("baseUrl");
        sb.append('=');
        sb.append(((this.baseUrl == null)?"<null>":this.baseUrl));
        sb.append(',');
        sb.append("updateTime");
        sb.append('=');
        sb.append(((this.updateTime == null)?"<null>":this.updateTime));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
