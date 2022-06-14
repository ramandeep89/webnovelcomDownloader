
package com.webnovel.downloader.json;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChapterInfo implements Serializable
{

    @SerializedName("chapterId")
    @Expose
    private String chapterId;
    @SerializedName("chapterName")
    @Expose
    private String chapterName;
    @SerializedName("chapterIndex")
    @Expose
    private Integer chapterIndex;
    @SerializedName("preChapterId")
    @Expose
    private String preChapterId;
    @SerializedName("preChapterName")
    @Expose
    private String preChapterName;
    @SerializedName("nextChapterId")
    @Expose
    private String nextChapterId;
    @SerializedName("nextChapterName")
    @Expose
    private String nextChapterName;
    @SerializedName("vipStatus")
    @Expose
    private Integer vipStatus;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("originalPrice")
    @Expose
    private Integer originalPrice;
    @SerializedName("discountInfo")
    @Expose
    private String discountInfo;
    @SerializedName("chapterLevel")
    @Expose
    private Integer chapterLevel;
    @SerializedName("userLevel")
    @Expose
    private Integer userLevel;
    @SerializedName("contents")
    @Expose
    private List<Content> contents = null;
    @SerializedName("isAuth")
    @Expose
    private Integer isAuth;
    @SerializedName("batchUnlockStatus")
    @Expose
    private Integer batchUnlockStatus;
    @SerializedName("isRichFormat")
    @Expose
    private Integer isRichFormat;
    @SerializedName("announcementItems")
    @Expose
    private List<Object> announcementItems = null;
    @SerializedName("groupItems")
    @Expose
    private List<Object> groupItems = null;
    @SerializedName("editorItems")
    @Expose
    private List<Object> editorItems = null;
    @SerializedName("translatorItems")
    @Expose
    private List<TranslatorItem> translatorItems = null;
    @SerializedName("firstChapterId")
    @Expose
    private String firstChapterId;
    @SerializedName("chapterReviewItems")
    @Expose
    private List<ChapterReviewItem> chapterReviewItems = null;
    @SerializedName("firstChapterIndex")
    @Expose
    private Integer firstChapterIndex;
    @SerializedName("reviewTotal")
    @Expose
    private Integer reviewTotal;
    @SerializedName("notes")
    @Expose
    private Notes notes;
    @SerializedName("orderIndex")
    @Expose
    private Integer orderIndex;
    @SerializedName("noArchive")
    @Expose
    private Integer noArchive;
    @SerializedName("transRating")
    @Expose
    private Integer transRating;
    @SerializedName("banner")
    @Expose
    private Banner banner;
    @SerializedName("adPosition")
    @Expose
    private AdPosition adPosition;
    @SerializedName("encryptType")
    @Expose
    private Integer encryptType;
    @SerializedName("encryptKeyPool")
    @Expose
    private String encryptKeyPool;
    @SerializedName("encryptVersion")
    @Expose
    private Integer encryptVersion;
    @SerializedName("nextChapterEncrypt")
    @Expose
    private NextChapterEncrypt nextChapterEncrypt;
    private final static long serialVersionUID = 131468419960445373L;

    public String getChapterId() {
        return chapterId;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public Integer getChapterIndex() {
        return chapterIndex;
    }

    public void setChapterIndex(Integer chapterIndex) {
        this.chapterIndex = chapterIndex;
    }

    public String getPreChapterId() {
        return preChapterId;
    }

    public void setPreChapterId(String preChapterId) {
        this.preChapterId = preChapterId;
    }

    public String getPreChapterName() {
        return preChapterName;
    }

    public void setPreChapterName(String preChapterName) {
        this.preChapterName = preChapterName;
    }

    public String getNextChapterId() {
        return nextChapterId;
    }

    public void setNextChapterId(String nextChapterId) {
        this.nextChapterId = nextChapterId;
    }

    public String getNextChapterName() {
        return nextChapterName;
    }

    public void setNextChapterName(String nextChapterName) {
        this.nextChapterName = nextChapterName;
    }

    public Integer getVipStatus() {
        return vipStatus;
    }

    public void setVipStatus(Integer vipStatus) {
        this.vipStatus = vipStatus;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getDiscountInfo() {
        return discountInfo;
    }

    public void setDiscountInfo(String discountInfo) {
        this.discountInfo = discountInfo;
    }

    public Integer getChapterLevel() {
        return chapterLevel;
    }

    public void setChapterLevel(Integer chapterLevel) {
        this.chapterLevel = chapterLevel;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public List<Content> getContents() {
        return contents;
    }

    public void setContents(List<Content> contents) {
        this.contents = contents;
    }

    public Integer getIsAuth() {
        return isAuth;
    }

    public void setIsAuth(Integer isAuth) {
        this.isAuth = isAuth;
    }

    public Integer getBatchUnlockStatus() {
        return batchUnlockStatus;
    }

    public void setBatchUnlockStatus(Integer batchUnlockStatus) {
        this.batchUnlockStatus = batchUnlockStatus;
    }

    public Integer getIsRichFormat() {
        return isRichFormat;
    }

    public void setIsRichFormat(Integer isRichFormat) {
        this.isRichFormat = isRichFormat;
    }

    public List<Object> getAnnouncementItems() {
        return announcementItems;
    }

    public void setAnnouncementItems(List<Object> announcementItems) {
        this.announcementItems = announcementItems;
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

    public String getFirstChapterId() {
        return firstChapterId;
    }

    public void setFirstChapterId(String firstChapterId) {
        this.firstChapterId = firstChapterId;
    }

    public List<ChapterReviewItem> getChapterReviewItems() {
        return chapterReviewItems;
    }

    public void setChapterReviewItems(List<ChapterReviewItem> chapterReviewItems) {
        this.chapterReviewItems = chapterReviewItems;
    }

    public Integer getFirstChapterIndex() {
        return firstChapterIndex;
    }

    public void setFirstChapterIndex(Integer firstChapterIndex) {
        this.firstChapterIndex = firstChapterIndex;
    }

    public Integer getReviewTotal() {
        return reviewTotal;
    }

    public void setReviewTotal(Integer reviewTotal) {
        this.reviewTotal = reviewTotal;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    public Integer getNoArchive() {
        return noArchive;
    }

    public void setNoArchive(Integer noArchive) {
        this.noArchive = noArchive;
    }

    public Integer getTransRating() {
        return transRating;
    }

    public void setTransRating(Integer transRating) {
        this.transRating = transRating;
    }

    public Banner getBanner() {
        return banner;
    }

    public void setBanner(Banner banner) {
        this.banner = banner;
    }

    public AdPosition getAdPosition() {
        return adPosition;
    }

    public void setAdPosition(AdPosition adPosition) {
        this.adPosition = adPosition;
    }

    public Integer getEncryptType() {
        return encryptType;
    }

    public void setEncryptType(Integer encryptType) {
        this.encryptType = encryptType;
    }

    public String getEncryptKeyPool() {
        return encryptKeyPool;
    }

    public void setEncryptKeyPool(String encryptKeyPool) {
        this.encryptKeyPool = encryptKeyPool;
    }

    public Integer getEncryptVersion() {
        return encryptVersion;
    }

    public void setEncryptVersion(Integer encryptVersion) {
        this.encryptVersion = encryptVersion;
    }

    public NextChapterEncrypt getNextChapterEncrypt() {
        return nextChapterEncrypt;
    }

    public void setNextChapterEncrypt(NextChapterEncrypt nextChapterEncrypt) {
        this.nextChapterEncrypt = nextChapterEncrypt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChapterInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("chapterId");
        sb.append('=');
        sb.append(((this.chapterId == null)?"<null>":this.chapterId));
        sb.append(',');
        sb.append("chapterName");
        sb.append('=');
        sb.append(((this.chapterName == null)?"<null>":this.chapterName));
        sb.append(',');
        sb.append("chapterIndex");
        sb.append('=');
        sb.append(((this.chapterIndex == null)?"<null>":this.chapterIndex));
        sb.append(',');
        sb.append("preChapterId");
        sb.append('=');
        sb.append(((this.preChapterId == null)?"<null>":this.preChapterId));
        sb.append(',');
        sb.append("preChapterName");
        sb.append('=');
        sb.append(((this.preChapterName == null)?"<null>":this.preChapterName));
        sb.append(',');
        sb.append("nextChapterId");
        sb.append('=');
        sb.append(((this.nextChapterId == null)?"<null>":this.nextChapterId));
        sb.append(',');
        sb.append("nextChapterName");
        sb.append('=');
        sb.append(((this.nextChapterName == null)?"<null>":this.nextChapterName));
        sb.append(',');
        sb.append("vipStatus");
        sb.append('=');
        sb.append(((this.vipStatus == null)?"<null>":this.vipStatus));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("originalPrice");
        sb.append('=');
        sb.append(((this.originalPrice == null)?"<null>":this.originalPrice));
        sb.append(',');
        sb.append("discountInfo");
        sb.append('=');
        sb.append(((this.discountInfo == null)?"<null>":this.discountInfo));
        sb.append(',');
        sb.append("chapterLevel");
        sb.append('=');
        sb.append(((this.chapterLevel == null)?"<null>":this.chapterLevel));
        sb.append(',');
        sb.append("userLevel");
        sb.append('=');
        sb.append(((this.userLevel == null)?"<null>":this.userLevel));
        sb.append(',');
        sb.append("contents");
        sb.append('=');
        sb.append(((this.contents == null)?"<null>":this.contents));
        sb.append(',');
        sb.append("isAuth");
        sb.append('=');
        sb.append(((this.isAuth == null)?"<null>":this.isAuth));
        sb.append(',');
        sb.append("batchUnlockStatus");
        sb.append('=');
        sb.append(((this.batchUnlockStatus == null)?"<null>":this.batchUnlockStatus));
        sb.append(',');
        sb.append("isRichFormat");
        sb.append('=');
        sb.append(((this.isRichFormat == null)?"<null>":this.isRichFormat));
        sb.append(',');
        sb.append("announcementItems");
        sb.append('=');
        sb.append(((this.announcementItems == null)?"<null>":this.announcementItems));
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
        sb.append("firstChapterId");
        sb.append('=');
        sb.append(((this.firstChapterId == null)?"<null>":this.firstChapterId));
        sb.append(',');
        sb.append("chapterReviewItems");
        sb.append('=');
        sb.append(((this.chapterReviewItems == null)?"<null>":this.chapterReviewItems));
        sb.append(',');
        sb.append("firstChapterIndex");
        sb.append('=');
        sb.append(((this.firstChapterIndex == null)?"<null>":this.firstChapterIndex));
        sb.append(',');
        sb.append("reviewTotal");
        sb.append('=');
        sb.append(((this.reviewTotal == null)?"<null>":this.reviewTotal));
        sb.append(',');
        sb.append("notes");
        sb.append('=');
        sb.append(((this.notes == null)?"<null>":this.notes));
        sb.append(',');
        sb.append("orderIndex");
        sb.append('=');
        sb.append(((this.orderIndex == null)?"<null>":this.orderIndex));
        sb.append(',');
        sb.append("noArchive");
        sb.append('=');
        sb.append(((this.noArchive == null)?"<null>":this.noArchive));
        sb.append(',');
        sb.append("transRating");
        sb.append('=');
        sb.append(((this.transRating == null)?"<null>":this.transRating));
        sb.append(',');
        sb.append("banner");
        sb.append('=');
        sb.append(((this.banner == null)?"<null>":this.banner));
        sb.append(',');
        sb.append("adPosition");
        sb.append('=');
        sb.append(((this.adPosition == null)?"<null>":this.adPosition));
        sb.append(',');
        sb.append("encryptType");
        sb.append('=');
        sb.append(((this.encryptType == null)?"<null>":this.encryptType));
        sb.append(',');
        sb.append("encryptKeyPool");
        sb.append('=');
        sb.append(((this.encryptKeyPool == null)?"<null>":this.encryptKeyPool));
        sb.append(',');
        sb.append("encryptVersion");
        sb.append('=');
        sb.append(((this.encryptVersion == null)?"<null>":this.encryptVersion));
        sb.append(',');
        sb.append("nextChapterEncrypt");
        sb.append('=');
        sb.append(((this.nextChapterEncrypt == null)?"<null>":this.nextChapterEncrypt));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
