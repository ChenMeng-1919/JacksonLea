package lesson10;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/22 16:27
 * @description:使用注解的别名进行序列化
 */
@Slf4j
public class Serialize1 {
    public static void main(String[] args) throws JsonProcessingException {
        Article1 article = new Article1();
        article.setTitle("spring");
        article.setContent("flowers");

        ObjectMapper mapper = new ObjectMapper();
        log.info(mapper.writeValueAsString(article));
    }
}
