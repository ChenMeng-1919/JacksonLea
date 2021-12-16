package lesson03;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/*
 * @author: cm
 * @date: Created in 2021/12/16 21:10
 * @description:
 */
@Slf4j
public class PropertyName {
    public static void main(String[] args) throws JsonProcessingException {
        AnimalPropertyName animal = new AnimalPropertyName();
        animal.setName("sam");
        animal.setSex(26);
        animal.setWeight(100);

        ObjectMapper mapper = new ObjectMapper();

        // 序列化
        String jsonString = mapper.writeValueAsString(animal);
        log.info(jsonString);

        // 正确反序列化
        String jsonString2 = "{\"weight\":200,\"animalName\":\"sam2\",\"animalSex\":2}";
        AnimalPropertyName animal2 = mapper.readValue(jsonString2, AnimalPropertyName.class);
        log.info(animal2.toString());

        // 错误反序列化. 不能使用原来的字段名name和sex，需要使用注解的名称animalName和animalSex
        String jsonString3 = "{\"weight\":200,\"name\":\"sam2\",\"sex\":2}";

        AnimalPropertyName animal3 = mapper.readValue(jsonString3, AnimalPropertyName.class);
        log.info(animal3.toString());
    }
}
