
package com.webnovel.downloader.json;

import java.io.Serializable;

public class NextChapterEncrypt implements Serializable
{

    private final static long serialVersionUID = 5576645189653445703L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NextChapterEncrypt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
