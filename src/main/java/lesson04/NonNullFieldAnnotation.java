package lesson04;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * @author: cm
 * @date: Created in 2021/12/16 22:48
 * @description:
 */
public class NonNullFieldAnnotation {
    public static void main(String[] args) throws JsonProcessingException {
        Animal2NonNull2 animal = new Animal2NonNull2();
        animal.setSex(26);

        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(animal)); // 不输出weight
    }
}
