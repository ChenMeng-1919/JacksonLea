package lesson02;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: cm
 * @since: Created in 2021/12/16 14:24
 * @description:Set序列化与反序列化
 */
@Slf4j
public class SerializeSet {
    public static void main(String[] args) throws JsonProcessingException {
        Set<String> set = new HashSet<>();
        set.add("sam");
        set.add("fanny");
        log.info("Set对象：" + set);

        ObjectMapper mapper = new ObjectMapper();

        // 将Set对象序列化
        log.info("Set对象序列化：{}", mapper.writeValueAsString(set));

        // 将数组对应的字符串反序列化为Set对象
        String str = "[\"sam2\",\"fanny2\"]";
        log.info("反序列化为Set对象：{}", mapper.readValue(str, Set.class));
    }
}
