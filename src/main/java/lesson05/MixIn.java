package lesson05;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @author: cm
 * @since: Created in 2021/12/17 13:08
 * @description:下面的例子，会将IgnoreType类的注解，添加到Date和Address上，因此序列化时这两个类对应的字段会被忽略。
 */
@Slf4j
public class MixIn {
    public static void main(String[] args) throws JsonProcessingException {
        AnimalIgnoreType2 animal = new AnimalIgnoreType2();
        animal.setName("sam");
        animal.setDate(new Date());

        AnimalIgnoreType2.Address address = new AnimalIgnoreType2.Address();
        address.setCity("gz");
        animal.setAddress(address);

        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixIn(Date.class, IgnoreType2.class);
        mapper.addMixIn(AnimalIgnoreType2.Address.class, IgnoreType2.class);
        log.info(mapper.writeValueAsString(animal));
    }
}
