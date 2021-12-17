package lesson05;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @author: cm
 * @since: Created in 2021/12/17 13:03
 * @description:如果需要忽略某个具体的类型（类、接口）的序列化，可以使用@JsonIgnoreType注解来实现。
 */
@Slf4j
public class IgnoreType {
    public static void main(String[] args) throws JsonProcessingException {
        AnimalIgnoreType animal = new AnimalIgnoreType();
        animal.setName("sam");
        animal.setDate(new Date());
        //由于Address类型添加了忽略类型的注解，因此在序列化和反序列化时该类型的字段被忽略了。
        AnimalIgnoreType.Address address = new AnimalIgnoreType.Address();
        address.setCity("gz");
        animal.setAddress(address);

        ObjectMapper mapper = new ObjectMapper();
       log.info(mapper.writeValueAsString(animal));

        String jsonString = "{\"name\":\"sam\",\"date\":1601714443779,\"address\":{\"city\":\"gz\"}}";
        AnimalIgnoreType newAnimal = mapper.readValue(jsonString, AnimalIgnoreType.class);
       log.info(newAnimal.toString());
    }
}
