package lesson10;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: cm
 * @since: Created in 2021/12/22 16:22
 * @description:
 */
@Setter
@Getter
public class Article {
    private String title;
    @JsonAlias({"cont", "detail"})
    private String content;
}
