package lesson07;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @author: cm
 * @since: Created in 2021/12/21 18:55
 * @description:
 */
@Slf4j
public class DateToLong {
    public static void main(String[] args) throws JsonProcessingException {
        Product product = new Product();
        product.setName("TV");
        product.setPublishDate(new Date());

        ObjectMapper mapper = new ObjectMapper();
        log.info(mapper.writeValueAsString(product));
    }
}
