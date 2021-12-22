package lesson06;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/21 15:19
 * @description:序列化指定的字段
 * SimpleBeanPropertyFilter.serializeAllExcept用于排除掉不需要序列化的字段，对应的SimpleBeanPropertyFilter.filterOutAllExcept用于指定需要序列化的字段。前者相当于排除，而后者则是包含。
 */
@Slf4j
public class FilterInclude {
    public static void main(String[] args) throws JsonProcessingException {
        Animal animal = new Animal();
        animal.setName("sam");
        animal.setSex(1);
        animal.setWeight(100);

        ObjectMapper mapper = new ObjectMapper();

        // 创建一个只序列化sex和weight的过滤器
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("sex", "weight");
        // 将上面的过滤器和ID为myFilter的注解进行关联
        FilterProvider filters = new SimpleFilterProvider().addFilter("myFilter", filter);

        log.info(mapper.writer(filters).writeValueAsString(animal));
    }
}
