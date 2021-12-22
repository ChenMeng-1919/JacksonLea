package lesson04;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/*
 * @author: cm
 * @date: Created in 2021/12/16 22:48
 * @description:
 */
@Slf4j
public class NonNullFieldAnnotation {
    public static void main(String[] args) throws JsonProcessingException {
        Animal2NonNull2 animal = new Animal2NonNull2();
        animal.setSex(26);

        ObjectMapper mapper = new ObjectMapper();
        log.info(mapper.writeValueAsString(animal)); // 不输出weight
    }
}
