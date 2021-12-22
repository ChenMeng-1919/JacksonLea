package lesson08;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: cm
 * @since: Created in 2021/12/22 14:18
 * @description:
 */
@Getter
@Setter
public class ArticleWithExtendView {
    @JsonView(MyJsonViews2.Summary.class)
    private String title;
    @JsonView(MyJsonViews2.Summary.class)
    private String summary;
    @JsonView(MyJsonViews2.Detail.class)
    private String content;

    // 省略getter、setter方法

    @Override
    public String toString() {
        return "ArticleWithExtendView [title=" + title + ", summary=" + summary + ", content=" + content + "]";
    }

}
