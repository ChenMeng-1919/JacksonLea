package lesson05;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @author: cm
 * @since: Created in 2021/12/17 13:01
 * @description:JsonIgnoreType注解
 * 使用JsonIgnoreType注解忽略指定类型的字段
 * 在指定的类型上，添加@JsonIgnoreType注解，可以忽略该类型的字段进行序列化。
 */
@Getter
@Setter
public class AnimalIgnoreType {
    private String name;
    private Date date;
    private Address address;

    @JsonIgnoreType
    @Setter
    @Getter
    public static class Address {
        private String city;


        @Override
        public String toString() {
            return "Address [city=" + city + "]";
        }

    }


    @Override
    public String toString() {
        return "AnimalIgnoreType [name=" + name + ", date=" + date + ", address=" + address + "]";
    }
}
