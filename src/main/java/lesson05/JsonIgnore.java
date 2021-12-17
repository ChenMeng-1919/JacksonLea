package lesson05;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/17 12:57
 * @description:
 */
@Slf4j
public class JsonIgnore {
    public static void main(String[] args) throws JsonProcessingException {
        ArticleIgnore article = new ArticleIgnore();
        article.setTitle("title");
        article.setSummary("summary");
        article.setContent("content");
        article.setAuthor("author");

        ObjectMapper mapper = new ObjectMapper();
        log.info(mapper.writeValueAsString(article));

        String str = "{\"title\":\"title\",\"summary\":\"summary\",\"content\":\"content\",\"author\":\"author\"}";
        ArticleIgnore newArticle = mapper.readValue(str, ArticleIgnore.class);
        log.info(newArticle.toString());
    }
}
