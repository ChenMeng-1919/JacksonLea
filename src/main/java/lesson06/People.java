package lesson06;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: cm
 * @since: Created in 2021/12/21 15:21
 * @description:
 */
@Getter
@Setter
public class People {
    private String name;
    private int age;


    @Override
    public String toString() {
        return "People [name=" + name + ", age=" + age + "]";
    }
}
