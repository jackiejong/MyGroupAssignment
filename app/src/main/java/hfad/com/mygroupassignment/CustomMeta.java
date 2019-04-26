package hfad.com.mygroupassignment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomMeta {

    @SerializedName("Source")
    @Expose
    private String source;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}