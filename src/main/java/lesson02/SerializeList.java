package lesson02;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cm
 * @since: Created in 2021/12/16 14:17
 * @description:List的序列化与反序列化
 * 和处理普通对象一样，对List的序列化和反序列化，也分别是通过writeValue*方法和readValue方法来实现的。
 */
@Slf4j
public class SerializeList {
    public static void main(String[] args) throws JsonProcessingException {
        List<String> list = new ArrayList<>();
        list.add("sam");
        list.add("fanny");
        log.info("List对象：{}", list);

        ObjectMapper mapper = new ObjectMapper();

        // 将List对象序列化
        log.info("List对象序列化：{}", mapper.writeValueAsString(list));

        // 将数组对应的字符串反序列化为List对象
        String str = "[\"sam2\",\"fanny2\"]";
        log.info("反序列化为List对象：{}", mapper.readValue(str, List.class));
    }
}
