
package com.webnovel.downloader.json;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BookInfo implements Serializable
{

    @SerializedName("bookId")
    @Expose
    private String bookId;
    @SerializedName("bookName")
    @Expose
    private String bookName;
    @SerializedName("authorName")
    @Expose
    private String authorName;
    @SerializedName("authorId")
    @Expose
    private String authorId;
    @SerializedName("totalChapterNum")
    @Expose
    private Integer totalChapterNum;
    @SerializedName("actionStatus")
    @Expose
    private Integer actionStatus;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("languageCode")
    @Expose
    private Integer languageCode;
    @SerializedName("languageName")
    @Expose
    private String languageName;
    @SerializedName("bookType")
    @Expose
    private Integer bookType;
    @SerializedName("reviewTotal")
    @Expose
    private Integer reviewTotal;
    @SerializedName("checkLevel")
    @Expose
    private Integer checkLevel;
    @SerializedName("totalPreChapterNum")
    @Expose
    private Integer totalPreChapterNum;
    @SerializedName("translateMode")
    @Expose
    private Integer translateMode;
    @SerializedName("groupItems")
    @Expose
    private List<Object> groupItems = null;
    @SerializedName("editorItems")
    @Expose
    private List<Object> editorItems = null;
    @SerializedName("translatorItems")
    @Expose
    private List<TranslatorItem> translatorItems = null;
    @SerializedName("authorItems")
    @Expose
    private List<AuthorItem> authorItems = null;
    @SerializedName("patreonLink")
    @Expose
    private String patreonLink;
    @SerializedName("coverUpdateTime")
    @Expose
    private Long coverUpdateTime;
    @SerializedName("giftNum")
    @Expose
    private Integer giftNum;
    @SerializedName("videoAdIds")
    @Expose
    private List<String> videoAdIds = null;
    @SerializedName("adIds")
    @Expose
    private List<String> adIds = null;
    @SerializedName("availableFpNum")
    @Expose
    private Integer availableFpNum;
    @SerializedName("publishTime")
    @Expose
    private Long publishTime;
    @SerializedName("updateTime")
    @Expose
    private Long updateTime;
    @SerializedName("isShowAds")
    @Expose
    private Integer isShowAds;
    @SerializedName("categoryType")
    @Expose
    private Integer categoryType;
    private final static long serialVersionUID = 51112296646853045L;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public Integer getTotalChapterNum() {
        return totalChapterNum;
    }

    public void setTotalChapterNum(Integer totalChapterNum) {
        this.totalChapterNum = totalChapterNum;
    }

    public Integer getActionStatus() {
        return actionStatus;
    }

    public void setActionStatus(Integer actionStatus) {
        this.actionStatus = actionStatus;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(Integer languageCode) {
        this.languageCode = languageCode;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public Integer getBookType() {
        return bookType;
    }

    public void setBookType(Integer bookType) {
        this.bookType = bookType;
    }

    public Integer getReviewTotal() {
        return reviewTotal;
    }

    public void setReviewTotal(Integer reviewTotal) {
        this.reviewTotal = reviewTotal;
    }

    public Integer getCheckLevel() {
        return checkLevel;
    }

    public void setCheckLevel(Integer checkLevel) {
        this.checkLevel = checkLevel;
    }

    public Integer getTotalPreChapterNum() {
        return totalPreChapterNum;
    }

    public void setTotalPreChapterNum(Integer totalPreChapterNum) {
        this.totalPreChapterNum = totalPreChapterNum;
    }

    public Integer getTranslateMode() {
        return translateMode;
    }

    public void setTranslateMode(Integer translateMode) {
        this.translateMode = translateMode;
    }

    public List<Object> getGroupItems() {
        return groupItems;
    }

    public void setGroupItems(List<Object> groupItems) {
        this.groupItems = groupItems;
    }

    public List<Object> getEditorItems() {
        return editorItems;
    }

    public void setEditorItems(List<Object> editorItems) {
        this.editorItems = editorItems;
    }

    public List<TranslatorItem> getTranslatorItems() {
        return translatorItems;
    }

    public void setTranslatorItems(List<TranslatorItem> translatorItems) {
        this.translatorItems = translatorItems;
    }

    public List<AuthorItem> getAuthorItems() {
        return authorItems;
    }

    public void setAuthorItems(List<AuthorItem> authorItems) {
        this.authorItems = authorItems;
    }

    public String getPatreonLink() {
        return patreonLink;
    }

    public void setPatreonLink(String patreonLink) {
        this.patreonLink = patreonLink;
    }

    public Long getCoverUpdateTime() {
        return coverUpdateTime;
    }

    public void setCoverUpdateTime(Long coverUpdateTime) {
        this.coverUpdateTime = coverUpdateTime;
    }

    public Integer getGiftNum() {
        return giftNum;
    }

    public void setGiftNum(Integer giftNum) {
        this.giftNum = giftNum;
    }

    public List<String> getVideoAdIds() {
        return videoAdIds;
    }

    public void setVideoAdIds(List<String> videoAdIds) {
        this.videoAdIds = videoAdIds;
    }

    public List<String> getAdIds() {
        return adIds;
    }

    public void setAdIds(List<String> adIds) {
        this.adIds = adIds;
    }

    public Integer getAvailableFpNum() {
        return availableFpNum;
    }

    public void setAvailableFpNum(Integer availableFpNum) {
        this.availableFpNum = availableFpNum;
    }

    public Long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsShowAds() {
        return isShowAds;
    }

    public void setIsShowAds(Integer isShowAds) {
        this.isShowAds = isShowAds;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BookInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bookId");
        sb.append('=');
        sb.append(((this.bookId == null)?"<null>":this.bookId));
        sb.append(',');
        sb.append("bookName");
        sb.append('=');
        sb.append(((this.bookName == null)?"<null>":this.bookName));
        sb.append(',');
        sb.append("authorName");
        sb.append('=');
        sb.append(((this.authorName == null)?"<null>":this.authorName));
        sb.append(',');
        sb.append("authorId");
        sb.append('=');
        sb.append(((this.authorId == null)?"<null>":this.authorId));
        sb.append(',');
        sb.append("totalChapterNum");
        sb.append('=');
        sb.append(((this.totalChapterNum == null)?"<null>":this.totalChapterNum));
        sb.append(',');
        sb.append("actionStatus");
        sb.append('=');
        sb.append(((this.actionStatus == null)?"<null>":this.actionStatus));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("languageCode");
        sb.append('=');
        sb.append(((this.languageCode == null)?"<null>":this.languageCode));
        sb.append(',');
        sb.append("languageName");
        sb.append('=');
        sb.append(((this.languageName == null)?"<null>":this.languageName));
        sb.append(',');
        sb.append("bookType");
        sb.append('=');
        sb.append(((this.bookType == null)?"<null>":this.bookType));
        sb.append(',');
        sb.append("reviewTotal");
        sb.append('=');
        sb.append(((this.reviewTotal == null)?"<null>":this.reviewTotal));
        sb.append(',');
        sb.append("checkLevel");
        sb.append('=');
        sb.append(((this.checkLevel == null)?"<null>":this.checkLevel));
        sb.append(',');
        sb.append("totalPreChapterNum");
        sb.append('=');
        sb.append(((this.totalPreChapterNum == null)?"<null>":this.totalPreChapterNum));
        sb.append(',');
        sb.append("translateMode");
        sb.append('=');
        sb.append(((this.translateMode == null)?"<null>":this.translateMode));
        sb.append(',');
        sb.append("groupItems");
        sb.append('=');
        sb.append(((this.groupItems == null)?"<null>":this.groupItems));
        sb.append(',');
        sb.append("editorItems");
        sb.append('=');
        sb.append(((this.editorItems == null)?"<null>":this.editorItems));
        sb.append(',');
        sb.append("translatorItems");
        sb.append('=');
        sb.append(((this.translatorItems == null)?"<null>":this.translatorItems));
        sb.append(',');
        sb.append("authorItems");
        sb.append('=');
        sb.append(((this.authorItems == null)?"<null>":this.authorItems));
        sb.append(',');
        sb.append("patreonLink");
        sb.append('=');
        sb.append(((this.patreonLink == null)?"<null>":this.patreonLink));
        sb.append(',');
        sb.append("coverUpdateTime");
        sb.append('=');
        sb.append(((this.coverUpdateTime == null)?"<null>":this.coverUpdateTime));
        sb.append(',');
        sb.append("giftNum");
        sb.append('=');
        sb.append(((this.giftNum == null)?"<null>":this.giftNum));
        sb.append(',');
        sb.append("videoAdIds");
        sb.append('=');
        sb.append(((this.videoAdIds == null)?"<null>":this.videoAdIds));
        sb.append(',');
        sb.append("adIds");
        sb.append('=');
        sb.append(((this.adIds == null)?"<null>":this.adIds));
        sb.append(',');
        sb.append("availableFpNum");
        sb.append('=');
        sb.append(((this.availableFpNum == null)?"<null>":this.availableFpNum));
        sb.append(',');
        sb.append("publishTime");
        sb.append('=');
        sb.append(((this.publishTime == null)?"<null>":this.publishTime));
        sb.append(',');
        sb.append("updateTime");
        sb.append('=');
        sb.append(((this.updateTime == null)?"<null>":this.updateTime));
        sb.append(',');
        sb.append("isShowAds");
        sb.append('=');
        sb.append(((this.isShowAds == null)?"<null>":this.isShowAds));
        sb.append(',');
        sb.append("categoryType");
        sb.append('=');
        sb.append(((this.categoryType == null)?"<null>":this.categoryType));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
