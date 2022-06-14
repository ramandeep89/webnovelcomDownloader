
package com.webnovel.downloader.json;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content implements Serializable
{

    @SerializedName("contentId")
    @Expose
    private String contentId;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("appId")
    @Expose
    private Integer appId;
    @SerializedName("userId")
    @Expose
    private Integer userId;
    @SerializedName("paragraphId")
    @Expose
    private String paragraphId;
    @SerializedName("likeAmount")
    @Expose
    private Integer likeAmount;
    @SerializedName("contentAmount")
    @Expose
    private Integer contentAmount;
    @SerializedName("userName")
    @Expose
    private String userName;
    @SerializedName("UUT")
    @Expose
    private Integer uut;
    @SerializedName("isLiked")
    @Expose
    private Integer isLiked;
    private final static long serialVersionUID = 5146741905696213258L;

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getParagraphId() {
        return paragraphId;
    }

    public void setParagraphId(String paragraphId) {
        this.paragraphId = paragraphId;
    }

    public Integer getLikeAmount() {
        return likeAmount;
    }

    public void setLikeAmount(Integer likeAmount) {
        this.likeAmount = likeAmount;
    }

    public Integer getContentAmount() {
        return contentAmount;
    }

    public void setContentAmount(Integer contentAmount) {
        this.contentAmount = contentAmount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUut() {
        return uut;
    }

    public void setUut(Integer uut) {
        this.uut = uut;
    }

    public Integer getIsLiked() {
        return isLiked;
    }

    public void setIsLiked(Integer isLiked) {
        this.isLiked = isLiked;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Content.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("contentId");
        sb.append('=');
        sb.append(((this.contentId == null)?"<null>":this.contentId));
        sb.append(',');
        sb.append("content");
        sb.append('=');
        sb.append(((this.content == null)?"<null>":this.content));
        sb.append(',');
        sb.append("appId");
        sb.append('=');
        sb.append(((this.appId == null)?"<null>":this.appId));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("paragraphId");
        sb.append('=');
        sb.append(((this.paragraphId == null)?"<null>":this.paragraphId));
        sb.append(',');
        sb.append("likeAmount");
        sb.append('=');
        sb.append(((this.likeAmount == null)?"<null>":this.likeAmount));
        sb.append(',');
        sb.append("contentAmount");
        sb.append('=');
        sb.append(((this.contentAmount == null)?"<null>":this.contentAmount));
        sb.append(',');
        sb.append("userName");
        sb.append('=');
        sb.append(((this.userName == null)?"<null>":this.userName));
        sb.append(',');
        sb.append("uut");
        sb.append('=');
        sb.append(((this.uut == null)?"<null>":this.uut));
        sb.append(',');
        sb.append("isLiked");
        sb.append('=');
        sb.append(((this.isLiked == null)?"<null>":this.isLiked));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
