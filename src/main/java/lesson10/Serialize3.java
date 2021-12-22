package lesson10;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/22 16:34
 * @description:使用JsonGetter注解的别名进行序列化
 */
@Slf4j
public class Serialize3 {
    public static void main(String[] args) throws JsonProcessingException {
        Article3 article = new Article3();
        article.setTitle("spring");
        article.setContent("flowers");

        ObjectMapper mapper = new ObjectMapper();
        log.info(mapper.writeValueAsString(article));
    }
}
