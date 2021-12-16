package lesson04;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @date: Created in 2021/12/16 22:43
 * @description:
 */
@Slf4j
public class OutputNull {
    public static void main(String[] args) throws JsonProcessingException {
        Animal animal = new Animal();
        animal.setName("sam");
        animal.setSex(1);

        ObjectMapper mapper = new ObjectMapper();
        log.info(mapper.writeValueAsString(animal));
    }
}
