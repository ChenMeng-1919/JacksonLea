package lesson01;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;

/**
 * @author: cm
 * @since: Created in 2021/12/16 11:46
 * @description:序列化
 */
@Slf4j
public class Serialize {
    public static void main(String[] args) throws IOException {
        // 创建一个Java Bean对象
        People people = new People();
        people.setName("sam");
        people.setAge(26);

        // 为了进行序列化/反序列化，需要创建一个ObjectMapper对象
        ObjectMapper mapper = new ObjectMapper();

        // 将people对象序列化为字符串
        String jsonString = mapper.writeValueAsString(people);
        log.info("序列化为JSON字符串：{}", jsonString);

        // 将people对象序列化为字节数组
        byte[] jsonBytes = mapper.writeValueAsBytes(people);
        log.info("序列化为字节数组，再转换为字符串：{}", new String(jsonBytes, "UTF-8"));

        // 将people对象序列化为JSON字符串，并保存到文件result.json中
        mapper.writeValue(new File("result.json"), people);
    }
}
