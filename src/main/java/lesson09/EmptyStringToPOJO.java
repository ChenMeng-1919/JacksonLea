package lesson09;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/22 16:09
 * @description:
 */
@Slf4j
public class EmptyStringToPOJO {
    public static void main(String[] args) throws JsonProcessingException {
        String jsonString = "{\"student\":\"\"}";

        ObjectMapper mapper = new ObjectMapper();
        Teacher teacher = mapper.readValue(jsonString, Teacher.class);
        log.info(mapper.writeValueAsString(teacher));
    }
}
