package lesson09;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/22 14:53
 * @description:启用缩进输出，对JSON字符串进行格式化
 */
@Slf4j
public class IndentOutput {
    public static void main(String[] args) throws JsonProcessingException {
        Animal animal = new Animal();
        animal.setName("sam");
        animal.setSex(1);
        animal.setWeight(100);

        Animal.People owner = animal.new People();
        animal.setOwner(owner);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT); // 格式化
        log.info(mapper.writeValueAsString(animal));
    }
}
