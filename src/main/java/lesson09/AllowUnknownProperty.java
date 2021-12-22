package lesson09;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/22 15:56
 * @description:遇到不存在的字段时不抛异常
 */
@Slf4j
public class AllowUnknownProperty {
    public static void main(String[] args) throws JsonProcessingException {
        String jsonString = "{\"name\":\"sam\",\"sex\":1,\"weight2\":100}";

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES); // 禁用

        Animal animal = mapper.readValue(jsonString, Animal.class);
        System.out.println(mapper.writeValueAsString(animal));
    }
}
