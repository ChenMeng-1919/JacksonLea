package lesson02;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/16 14:29
 * @description:数组的序列化与反序列化
 */
@Slf4j
public class SerializeArray {
    public static void main(String[] args) throws JsonProcessingException {
        String[] array = {"sam", "fanny"};

        ObjectMapper mapper = new ObjectMapper();

        // 将数组对象序列化
        log.info("数组对象序列化：{}" , mapper.writeValueAsString(array));

        // 将数组对应的字符串反序列化为数组对象
        String str = "[\"sam2\",\"fanny2\"]";
        String[] newArray = mapper.readValue(str, String[].class);
        log.info("反序列化为数组对象. size: " + newArray.length +
                ", value: [" + newArray[0] + "," + newArray[1] + "]");
    }
}
