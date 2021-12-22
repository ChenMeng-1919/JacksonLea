package lesson09;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author: cm
 * @since: Created in 2021/12/22 16:11
 * @description:
 */
@Slf4j
public class EmptyStringToMapValue {
    public static void main(String[] args) throws JsonProcessingException {
        String jsonString = "{\"sam\":\"\"}";

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);

        Map<String, Student> map = mapper.readValue(jsonString, new TypeReference<Map<String, Student>>() {
        });
        log.info("{}", map);
    }
}
