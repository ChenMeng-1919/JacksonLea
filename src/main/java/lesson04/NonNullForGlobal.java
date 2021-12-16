package lesson04;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @date: Created in 2021/12/16 22:45
 * @description:序列化时忽略值为null的字段
 */
@Slf4j
public class NonNullForGlobal {
    public static void main(String[] args) throws JsonProcessingException {
        Animal animal = new Animal();
        animal.setName("sam");
        animal.setSex(1);

        ObjectMapper mapper = new ObjectMapper();

        // 指定序列化时的包含规则，NON_NULL表示序列化时忽略值为null的字段
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        log.info(mapper.writeValueAsString(animal));
    }
}
