package lesson10;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/22 16:31
 * @description:反序列化时，只支持使用字段别名
 */
@Slf4j
public class Deserialize2 {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        // 不支持使用原字段名
        //  String jsonString = "{\"title\":\"spring\",\"content\":\"flowers\"}";
        // 不支持. 即使setTitle()方法没有注解，也需要使用JsonGetter注解的别名.
        //  String jsonString = "{\"title\":\"spring\",\"c\":\"flowers\"}";
        // 正确. 都使用别名
        String jsonString = "{\"t\":\"spring\",\"c\":\"flowers\"}";
        Article2 article = mapper.readValue(jsonString, Article2.class);
        log.info(mapper.writeValueAsString(article));
    }
}
