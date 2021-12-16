package lesson02;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cm
 * @since: Created in 2021/12/16 14:30
 * @description:如果集合的元素为非基本类型，那么在进行反序列化后，结果可能不符合预期。
 */
@Slf4j
public class DeserializeNonPrimitive {
    public static void main(String[] args) throws JsonProcessingException {
        People p1 = new People();
        p1.setName("sam");
        p1.setAge(26);

        List<People> list = new ArrayList<>();
        list.add(p1);

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(list); // [{"name":"sam","age":26}]

        // 下面看看反序列化的效果

        List<People> newList = mapper.readValue(jsonString, List.class);
        //  List<People> newList = mapper.readValue(jsonString, List<People>.class); // 错误的泛型用法

        // 正常输出[{name=sam, age=26}]
        log.info(newList.toString());

        // 抛出异常：java.lang.ClassCastException: java.util.LinkedHashMap cannot be cast to People
        log.info(newList.get(0).toString());
    }
}
