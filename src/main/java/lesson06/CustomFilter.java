package lesson06;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/21 15:33
 * @description:自定义过滤器. 通过继承SimpleBeanPropertyFilter，根据实际需要编写过滤规则.
 */
@Slf4j
public class CustomFilter {
    public static void main(String[] args) throws JsonProcessingException {
        Animal animal = new Animal();
        animal.setName("sam");
        animal.setSex(1);
        animal.setWeight(100);

        ObjectMapper mapper = new ObjectMapper();

        SimpleBeanPropertyFilter filter = new CustomExceptFilter();
        FilterProvider filters = new SimpleFilterProvider().addFilter("myFilter", filter);

        log.info(mapper.writer(filters).writeValueAsString(animal));
    }
}
