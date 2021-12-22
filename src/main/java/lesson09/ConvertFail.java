package lesson09;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/22 16:13
 * @description:
 */
@Slf4j
public class ConvertFail {
    public static void main(String[] args) throws JsonProcessingException {
        String jsonString = "{\"name\":\"\",\"age\":26}";

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        Student student = mapper.readValue(jsonString, Student.class);
        log.info(mapper.writeValueAsString(student));
    }
}
