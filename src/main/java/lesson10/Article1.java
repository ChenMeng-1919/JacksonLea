package lesson10;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * @author: cm
 * @since: Created in 2021/12/22 16:26
 * @description:
 */
public class Article1 {

    private String title;
    private String content;

    @JsonGetter("t")
    public String getTitle() {
        return title;
    }

    @JsonSetter("t")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonGetter("c")
    public String getContent() {
        return content;
    }

    @JsonSetter("c")
    public void setContent(String content) {
        this.content = content;
    }
}
