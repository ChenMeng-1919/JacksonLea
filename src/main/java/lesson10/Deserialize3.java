package lesson10;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/22 16:35
 * @description:
 */
@Slf4j
public class Deserialize3 {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        String jsonString = "{\"tw\":\"spring\",\"cw\":\"flowers\"}";
        Article3 article = mapper.readValue(jsonString, Article3.class);
        log.info(mapper.writeValueAsString(article));
    }
}
