package lesson05;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: cm
 * @since: Created in 2021/12/17 12:57
 * @description:使用JsonIgnore注解忽略单个字段 为字段添加@JsonIgnore注解，可以忽略该字段的序列化和反序列化。
 */
@Getter
@Setter
public class ArticleIgnore {
    private String title;
    @JsonIgnore
    private String summary;
    private String content;
    @JsonIgnore
    private String author;


    @Override
    public String toString() {
        return "ArticleIgnore [title=" + title + ", summary=" + summary + ", content=" + content + ", author=" + author
                + "]";
    }
}
