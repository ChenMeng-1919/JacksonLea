package lesson05;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author: cm
 * @since: Created in 2021/12/17 13:05
 * @description:使用JsonIgnoreType注解动态忽略指定类型的字段
 * 前面使用JsonIgnoreType注解，忽略的类型是固定的。
 * 利用ObjectMapper的addMixIn方法，可以动态的将JsonIgnoreType注解应用于其他数据类型。
 */
@Getter
@Setter
public class AnimalIgnoreType2 {
    private String name;
    private Date date;
    private Address address;

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
