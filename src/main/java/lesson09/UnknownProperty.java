package lesson09;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/22 15:53
 * @description:
 */
@Slf4j
public class UnknownProperty {
    public static void main(String[] args) throws JsonProcessingException {
        String jsonString = "{\"name\":\"sam\",\"sex\":1,\"weight2\":100}";

        ObjectMapper mapper = new ObjectMapper();
        Animal animal = mapper.readValue(jsonString, Animal.class);
        log.info(mapper.writeValueAsString(animal));
    }
}
