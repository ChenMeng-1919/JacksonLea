package lesson08;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/22 11:50
 * @description:
 */
@Slf4j
public class NoConfig {
    public static void main(String[] args) throws JsonProcessingException {
        Article article = new Article();
        article.setTitle("title");
        article.setSummary("summary");
        article.setContent("content");

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writerWithView(MyJsonViews.Summary.class).writeValueAsString(article);
        log.info(jsonString);
    }
}
