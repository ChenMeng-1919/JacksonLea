package lesson10;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/22 16:30
 * @description:
 */
@Slf4j
public class Serialize2 {
    public static void main(String[] args) throws JsonProcessingException {
        Article2 article = new Article2();
        article.setTitle("spring");
        article.setContent("flowers");

        ObjectMapper mapper = new ObjectMapper();
        log.info(mapper.writeValueAsString(article));
    }
}
