package lesson06;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: cm
 * @since: Created in 2021/12/21 15:21
 * @description:
 */
@Getter
@Setter
public class AnimalWithOwner {
    private String name;
    private int sex;
    private Integer weight;
    @JsonFilter("myFilter")
    private People owner;


    @Override
    public String toString() {
        return "AnimalJsonFilterOnField [name=" + name + ", sex=" + sex + ", weight=" + weight + ", owner=" + owner
                + "]";
    }
}
