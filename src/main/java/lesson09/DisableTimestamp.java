package lesson09;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: cm
 * @since: Created in 2021/12/22 15:32
 * @description:禁止将日期序列化为数字类型的时间戳. 默认输出格式：yyyy-MM-dd'T'HH:mm:ss.SSSX
 */
@Slf4j
public class DisableTimestamp {
    public static void main(String[] args) throws JsonProcessingException {
        List<Date> list = new ArrayList<>();
        list.add(new Date());

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        log.info(mapper.writeValueAsString(list));
    }
}
