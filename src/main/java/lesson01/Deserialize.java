package lesson01;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author: cm
 * @since: Created in 2021/12/16 11:54
 * @description:反序列化
 */
@Slf4j
public class Deserialize {
    public static void main(String[] args) throws IOException {
        // 为了进行序列化/反序列化，需要创建一个ObjectMapper对象
        ObjectMapper mapper = new ObjectMapper();

        // 将JSON字符串反序列化为People对象
        People people1 = mapper.readValue("{\"name\":\"fanny\", \"age\":26}", People.class);
        log.info("name: " + people1.getName() + ", age: " + people1.getAge());

        // 将文件中的JSON字符串反序列化为People对象
        People people2 = mapper.readValue(new File("D://result.json"), People.class);
        log.info("name: " + people2.getName() + ", age: " + people2.getAge());

        // 将字节数组反序列化为People对象
        byte[] jsonBytes = mapper.writeValueAsBytes(people2);
        People people3 = mapper.readValue(jsonBytes, People.class);
        log.info("name: " + people3.getName() + ", age: " + people3.getAge());

        // 读取网络文件中的JSON字符串，并反序列化为People对象
        People people4 = mapper.readValue(new URL("http://youwebsite.com/result.json"), People.class);
        log.info("name: " + people4.getName() + ", age: " + people4.getAge());
    }
}
