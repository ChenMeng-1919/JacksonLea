package lesson06;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: cm
 * @since: Created in 2021/12/21 15:15
 * @description:过滤类的字段
 * 为需要过滤字段的类添加JsonFilter注解。
 */
@Getter
@Setter
@JsonFilter("myFilter")
public class Animal {
    private String name;
    private int sex;
    private Integer weight;


    @Override
    public String toString() {
        return "Animal [name=" + name + ", sex=" + sex + ", weight=" + weight + "]";
    }

}
