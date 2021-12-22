package lesson10;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * @author: cm
 * @since: Created in 2021/12/22 16:29
 * @description:如果只给字段添加JsonGetter注解，或者只添加JsonSetter注解。在序列化和反序列化时，都需要统一用注解的名称。
 */
public class Article2 {
    private String title;
    private String content;

    @JsonGetter("t")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    @JsonSetter("c")
    public void setContent(String content) {
        this.content = content;
    }
}
