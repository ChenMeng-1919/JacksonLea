package lesson10;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/22 16:26
 * @description:序列化时，使用原来的字段名，不会替换为别名
 */
@Slf4j
public class SerializeNoEffect {
    public static void main(String[] args) throws JsonProcessingException {
        Article article = new Article();
        article.setTitle("spring");
        article.setContent("flowers");

        ObjectMapper mapper = new ObjectMapper();
        log.info(mapper.writeValueAsString(article));
    }
}
