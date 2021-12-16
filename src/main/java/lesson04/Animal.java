package lesson04;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: cm
 * @date: Created in 2021/12/16 22:42
 * @description:
 */
@Getter
@Setter
public class Animal {

    private String name;
    private int sex;
    private Integer weight;

    // 省略getter、setter方法

    @Override
    public String toString() {
        return "Animal [name=" + name + ", sex=" + sex + ", weight=" + weight + "]";
    }
}
