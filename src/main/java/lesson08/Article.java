package lesson08;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: cm
 * @since: Created in 2021/12/22 11:49
 * @description:为字段添加JsonView注解，将字段和视图Summary进行关联。这使得在使用Summary视图序列化时，包含关联的字段。
 */
@Getter
@Setter
public class Article {
    @JsonView(MyJsonViews.Summary.class)
    private String title;
    @JsonView(MyJsonViews.Summary.class)
    private String summary;
    private String content;
}
