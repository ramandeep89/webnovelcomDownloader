
package com.webnovel.downloader.json;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data implements Serializable
{

    @SerializedName("bookInfo")
    @Expose
    private BookInfo bookInfo;
    @SerializedName("chapterInfo")
    @Expose
    private ChapterInfo chapterInfo;
    @SerializedName("machineTrans")
    @Expose
    private MachineTrans machineTrans;
    @SerializedName("membershipStatus")
    @Expose
    private Integer membershipStatus;
    @SerializedName("waitpayStatus")
    @Expose
    private Integer waitpayStatus;
    private final static long serialVersionUID = 9019948107803810114L;

    public BookInfo getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(BookInfo bookInfo) {
        this.bookInfo = bookInfo;
    }

    public ChapterInfo getChapterInfo() {
        return chapterInfo;
    }

    public void setChapterInfo(ChapterInfo chapterInfo) {
        this.chapterInfo = chapterInfo;
    }

    public MachineTrans getMachineTrans() {
        return machineTrans;
    }

    public void setMachineTrans(MachineTrans machineTrans) {
        this.machineTrans = machineTrans;
    }

    public Integer getMembershipStatus() {
        return membershipStatus;
    }

    public void setMembershipStatus(Integer membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    public Integer getWaitpayStatus() {
        return waitpayStatus;
    }

    public void setWaitpayStatus(Integer waitpayStatus) {
        this.waitpayStatus = waitpayStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bookInfo");
        sb.append('=');
        sb.append(((this.bookInfo == null)?"<null>":this.bookInfo));
        sb.append(',');
        sb.append("chapterInfo");
        sb.append('=');
        sb.append(((this.chapterInfo == null)?"<null>":this.chapterInfo));
        sb.append(',');
        sb.append("machineTrans");
        sb.append('=');
        sb.append(((this.machineTrans == null)?"<null>":this.machineTrans));
        sb.append(',');
        sb.append("membershipStatus");
        sb.append('=');
        sb.append(((this.membershipStatus == null)?"<null>":this.membershipStatus));
        sb.append(',');
        sb.append("waitpayStatus");
        sb.append('=');
        sb.append(((this.waitpayStatus == null)?"<null>":this.waitpayStatus));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
