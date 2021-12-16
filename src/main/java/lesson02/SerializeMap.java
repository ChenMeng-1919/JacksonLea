package lesson02;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: cm
 * @since: Created in 2021/12/16 14:28
 * @description:Map序列化与反序列化
 */
@Slf4j
public class SerializeMap {
    public static void main(String[] args) throws JsonProcessingException {
        Map<String, Integer> map = new HashMap<>();
        map.put("sam", 26);
        map.put("fanny", 1);
        log.info("Map对象：" + map);

        ObjectMapper mapper = new ObjectMapper();

        // 将Map对象序列化
        log.info("Map对象序列化：" + mapper.writeValueAsString(map));

        // 将数组对应的字符串反序列化为Map对象
        String str = "{\"fanny\":1,\"sam\":26}";
        log.info("反序列化为Map对象：" + mapper.readValue(str, Map.class));
    }
}
