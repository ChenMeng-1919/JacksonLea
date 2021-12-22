package lesson10;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/22 16:28
 * @description:反序列化时，只支持使用字段别名
 */
@Slf4j
public class Deserialize1 {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        // 不支持使用原字段名
        //  String jsonString = "{\"title\":\"spring\",\"content\":\"flowers\"}";
        // 正确. 使用别名
        String jsonString = "{\"t\":\"spring\",\"c\":\"flowers\"}";
        Article1 article = mapper.readValue(jsonString, Article1.class);
        log.info(mapper.writeValueAsString(article));
    }
}
