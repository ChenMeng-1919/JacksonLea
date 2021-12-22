package lesson09;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: cm
 * @since: Created in 2021/12/22 14:52
 * @description:定义一个用于序列化的类。
 */
@Getter
@Setter
public class Animal {
    private String name;
    private int sex;
    private Integer weight;
    private People owner;

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


    @Override
    public String toString() {
        return "Animal [name=" + name + ", sex=" + sex + ", weight=" + weight + ", owner=" + owner + "]";
    }
}
