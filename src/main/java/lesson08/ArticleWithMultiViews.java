package lesson08;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: cm
 * @since: Created in 2021/12/22 11:54
 * @description:
 */
@Getter
@Setter
public class ArticleWithMultiViews {
    @JsonView({MyJsonViews.Summary.class, MyJsonViews.Welcome.class})
    private String title;
    @JsonView(MyJsonViews.Summary.class)
    private String summary;
    @JsonView(MyJsonViews.Welcome.class)
    private String content;
}
