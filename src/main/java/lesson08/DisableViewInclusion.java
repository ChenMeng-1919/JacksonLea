package lesson08;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/22 11:52
 * @description:没有添加@JsonView注解的字段不会被序列化
 */
@Slf4j
public class DisableViewInclusion {
    public static void main(String[] args) throws JsonProcessingException {
        Article article = new Article();
        article.setTitle("title");
        article.setSummary("summary");
        article.setContent("content");

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION); // 禁止序列化没有注解的字段
        String jsonString = mapper.writerWithView(MyJsonViews.Summary.class).writeValueAsString(article);
        log.info(jsonString);
    }
}
