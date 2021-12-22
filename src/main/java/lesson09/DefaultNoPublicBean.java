package lesson09;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/22 15:03
 * @description:默认序列化空Bean时会抛出异常
 */
@Slf4j
public class DefaultNoPublicBean {
    public static void main(String[] args) throws JsonProcessingException {
        AnimalNoPublic animal = new AnimalNoPublic();
        animal.setName("sam");
        animal.setSex(1);
        animal.setWeight(100);
        ObjectMapper mapper = new ObjectMapper();
        log.info(mapper.writeValueAsString(animal));
    }
}
