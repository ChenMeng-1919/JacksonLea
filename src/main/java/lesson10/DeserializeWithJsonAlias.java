package lesson10;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/22 16:24
 * @description:
 */
@Slf4j
public class DeserializeWithJsonAlias {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        // 使用原字段名
        String jsonString = "{\"title\":\"spring\",\"content\":\"flowers\"}";
        Article article = mapper.readValue(jsonString, Article.class);
        log.info(mapper.writeValueAsString(article));

        // 使用别名cont
        jsonString = "{\"title\":\"spring\",\"cont\":\"flowers\"}";
        article = mapper.readValue(jsonString, Article.class);
        log.info(mapper.writeValueAsString(article));

        // 使用别名detail
        jsonString = "{\"title\":\"spring\",\"detail\":\"flowers\"}";
        article = mapper.readValue(jsonString, Article.class);
        log.info(mapper.writeValueAsString(article));
    }
}
