package lesson08;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/22 11:54
 * @description:
 */
@Slf4j
public class MultiViews {
    public static void main(String[] args) throws JsonProcessingException {
        ArticleWithMultiViews article = new ArticleWithMultiViews();
        article.setTitle("title");
        article.setSummary("summary");
        article.setContent("content");
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION); // 禁止序列化没有注解的字段

        String jsonString1 = mapper.writerWithView(MyJsonViews.Summary.class).writeValueAsString(article);
        log.info(jsonString1);

        String jsonString2 = mapper.writerWithView(MyJsonViews.Welcome.class).writeValueAsString(article);
        log.info(jsonString2);
    }
}
