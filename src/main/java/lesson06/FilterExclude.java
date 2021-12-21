package lesson06;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/21 15:17
 * @description:忽略指定字段
 * 创建一个不序列化sex和weight的过滤器SimpleBeanPropertyFilter，再将这个过滤器和ID为myFilter的注解进行关联，最后将过滤器应用于ObjectMapper。
 * 最终的效果，就是使得被@JsonFilter(“myFilter”)注解的类，在类对象被序列化时，不序列化sex和weight。
 */
@Slf4j
public class FilterExclude {
    public static void main(String[] args) throws JsonProcessingException {
        Animal animal = new Animal();
        animal.setName("sam");
        animal.setSex(1);
        animal.setWeight(100);

        ObjectMapper mapper = new ObjectMapper();

        // 创建一个不序列化sex和weight的过滤器
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.serializeAllExcept("sex", "weight");
        // 将上面的过滤器和ID为myFilter的注解进行关联
        FilterProvider filters = new SimpleFilterProvider().addFilter("myFilter", filter);

       log.info(mapper.writer(filters).writeValueAsString(animal));
    }
}
