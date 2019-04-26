package hfad.com.mygroupassignment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Quote {

    @SerializedName("ID")
    @Expose
    private int iD;


    @SerializedName("title")
    @Expose
    private String title;


    @SerializedName("content")
    @Expose
    private String content;


    @SerializedName("link")
    @Expose
    private String link;


    @SerializedName("custom_meta")
    @Expose
    private CustomMeta customMeta;

    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public CustomMeta getCustomMeta() {
        return customMeta;
    }

    public void setCustomMeta(CustomMeta customMeta) {
        this.customMeta = customMeta;
    }

}