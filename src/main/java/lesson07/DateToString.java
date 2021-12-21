package lesson07;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: cm
 * @since: Created in 2021/12/21 19:05
 * @description:
 */
@Slf4j
public class DateToString {
    public static void main(String[] args) throws JsonProcessingException {
        Product product = new Product();
        product.setName("TV");
        product.setPublishDate(new Date());

        ObjectMapper mapper = new ObjectMapper();

        // 设置日期格式
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        //mapper.setTimeZone(TimeZone.getTimeZone("UTC"));
        log.info(mapper.writeValueAsString(product));
        // 格式化
        String jsonString = "{\"name\":\"TV\",\"publishDate\":\"2020-10-04 22:21:07\"}";
        Product newProduct = mapper.readValue(jsonString, Product.class);
        log.info(newProduct.toString());
        // Long类型
        jsonString = "{\"name\":\"TV\",\"publishDate\":1601821267709}";
        newProduct = mapper.readValue(jsonString, Product.class);
        log.info(newProduct.toString());
    }
}
