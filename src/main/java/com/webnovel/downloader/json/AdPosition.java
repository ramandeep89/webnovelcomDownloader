
package com.webnovel.downloader.json;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AdPosition implements Serializable
{

    @SerializedName("readChapterEnd")
    @Expose
    private Boolean readChapterEnd;
    private final static long serialVersionUID = 7073879925344677744L;

    public Boolean getReadChapterEnd() {
        return readChapterEnd;
    }

    public void setReadChapterEnd(Boolean readChapterEnd) {
        this.readChapterEnd = readChapterEnd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdPosition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("readChapterEnd");
        sb.append('=');
        sb.append(((this.readChapterEnd == null)?"<null>":this.readChapterEnd));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
