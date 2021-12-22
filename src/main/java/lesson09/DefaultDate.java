package lesson09;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: cm
 * @since: Created in 2021/12/22 15:31
 * @description:默认日期序列化为数字类型的时间戳
 */
@Slf4j
public class DefaultDate {
    public static void main(String[] args) throws JsonProcessingException {
        List<Date> list = new ArrayList<>();
        list.add(new Date());

        ObjectMapper mapper = new ObjectMapper();
        log.info(mapper.writeValueAsString(list));
    }
}
