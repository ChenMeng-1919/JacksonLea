package lesson05;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/17 13:00
 * @description:为类添加@JsonIgnoreProperties注解，忽略指定字段的序列化和反序列化。
 */
@Slf4j
public class JsonIgnoreProperties {
    public static void main(String[] args) throws JsonProcessingException {
        ArticleIgnoreProperties article = new ArticleIgnoreProperties();
        article.setTitle("title");
        article.setSummary("summary");
        article.setContent("content");
        article.setAuthor("author");

        ObjectMapper mapper = new ObjectMapper();
        log.info(mapper.writeValueAsString(article));

        String str = "{\"title\":\"title\",\"summary\":\"summary\",\"content\":\"content\",\"author\":\"author\"}";
        ArticleIgnoreProperties newArticle = mapper.readValue(str, ArticleIgnoreProperties.class);
        log.info(newArticle.toString());
    }
}
