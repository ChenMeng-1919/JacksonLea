package lesson05;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: cm
 * @since: Created in 2021/12/17 12:59
 * @description:使用JsonIgnoreProperties注解忽略多个字段
 * 为类添加JsonIgnoreProperties注解，可以忽略指定多个字段的序列化和反序列化。
 */
@Getter
@Setter
@JsonIgnoreProperties({"summary", "author"})
public class ArticleIgnoreProperties {

    private String title;
    private String summary;
    private String content;
    private String author;


    @Override
    public String toString() {
        return "ArticleIgnoreProperties [title=" + title + ", summary=" + summary + ", content=" + content + ", author="
                + author + "]";
    }
}
