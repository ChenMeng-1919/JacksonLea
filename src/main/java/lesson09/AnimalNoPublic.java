package lesson09;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: cm
 * @since: Created in 2021/12/22 15:02
 * @description:
 */
public class AnimalNoPublic {
    private String name;
    protected int sex;
    Integer weight;

    protected int getSex() {
        return sex;
    }

    Integer getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

}
