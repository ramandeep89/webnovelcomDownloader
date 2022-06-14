
package com.webnovel.downloader.json;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MachineTrans implements Serializable
{

    @SerializedName("isWhiteUser")
    @Expose
    private Integer isWhiteUser;
    private final static long serialVersionUID = 3633191744253064078L;

    public Integer getIsWhiteUser() {
        return isWhiteUser;
    }

    public void setIsWhiteUser(Integer isWhiteUser) {
        this.isWhiteUser = isWhiteUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MachineTrans.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isWhiteUser");
        sb.append('=');
        sb.append(((this.isWhiteUser == null)?"<null>":this.isWhiteUser));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
