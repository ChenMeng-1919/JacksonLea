package lesson03;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/*
 * @author: cm
 * @date: Created in 2021/12/16 21:16
 * @description:
 */
@Slf4j
public class JsonNaming {
    public static void main(String[] args) throws JsonProcessingException {
        AnimalJSONNaming animal = new AnimalJSONNaming();
        animal.setAnimalName("sam");
        animal.setAnimalSex(1);
        animal.setAnimalWeight(100);

        ObjectMapper mapper = new ObjectMapper();
        log.info(mapper.writeValueAsString(animal));
    }
}
