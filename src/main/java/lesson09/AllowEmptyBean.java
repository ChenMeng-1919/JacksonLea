package lesson09;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/22 15:22
 * @description:
 */
@Slf4j
public class AllowEmptyBean {
    public static void main(String[] args) throws JsonProcessingException {
        AnimalNoPublic animal = new AnimalNoPublic();
        animal.setName("sam");
        animal.setSex(1);
        animal.setWeight(100);

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS); // 允许序列化空Bean
        log.info(mapper.writeValueAsString(animal));
    }
}
