package lesson02;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;

/**
 * @author: cm
 * @since: Created in 2021/12/16 14:44
 * @description:通过TypeReference解决类型无法传递问题
 */
@Slf4j
public class DeserializeNonPrimitiveWithTypeReference {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        // 反序列化List<People>
        String jsonString = "[{\"name\":\"sam\",\"age\":26}]";
        List<People> newList = mapper.readValue(jsonString, new TypeReference<List<People>>() {
        });
        log.info("List：{}", newList.get(0).toString());

        // 反序列化Map<String, People>
        String jsonString2 = "{\"xiaoming\":{\"name\":\"cy\",\"age\":1},\"xiaoli\":{\"name\":\"fanny\",\"age\":20}}";
        Map<String, People> map = mapper.readValue(jsonString2, new TypeReference<Map<String, People>>() {
        });
        People p1 = map.get("xiaoming");
        People p2 = map.get("xiaoli");
        log.info("xiaoming：{}", p1.toString());
        log.info("xiaoli：{}", p2.toString());
    }
}
