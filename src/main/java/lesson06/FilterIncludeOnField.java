package lesson06;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/21 15:22
 * @description:过滤对象的字段
 * 如果对一个类声明了JsonFilter注解，那么任何引用到该类的地方都可以使用到该注解。
 * 有时候，我们只是想针对引用该类的字段进行过滤，这种情况可以直接在该字段上面进行注解。
 * 下面为AnimalWithOwner的People类型的字段owner添加JsonFilter注解，实际上是作用于owner对象的字段。
 */
@Slf4j
public class FilterIncludeOnField {
    public static void main(String[] args) throws JsonProcessingException {
        AnimalWithOwner animal = new AnimalWithOwner();
        animal.setName("sam");
        animal.setSex(1);
        animal.setWeight(100);

        People owner = new People();
        owner.setName("fanny");
        owner.setAge(26);
        animal.setOwner(owner);

        ObjectMapper mapper = new ObjectMapper();

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name");
        FilterProvider filters = new SimpleFilterProvider().addFilter("myFilter", filter);

        log.info(mapper.writer(filters).writeValueAsString(animal));
    }

}
