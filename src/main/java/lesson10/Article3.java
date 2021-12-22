package lesson10;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * @author: cm
 * @since: Created in 2021/12/22 16:33
 * @description:
 */
public class Article3 {

    private String title;
    private String content;

    @JsonGetter("tr")
    public String getTitle() {
        return title;
    }

    @JsonSetter("tw")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonGetter("cr")
    public String getContent() {
        return content;
    }

    @JsonSetter("cw")
    public void setContent(String content) {
        this.content = content;
    }
}
