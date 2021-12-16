package lesson02;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: cm
 * @since: Created in 2021/12/16 14:29
 * @description:自定义一个类
 */
@Getter
@Setter
public class People {
    private String name;
    private int age;

    // 此处省略了getter和setter方法

    @Override
    public String toString() {
        return "People [name=" + name + ", age=" + age + "]";
    }
}
