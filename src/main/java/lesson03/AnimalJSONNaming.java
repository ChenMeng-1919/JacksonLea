package lesson03;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * @author: cm
 * @date: Created in 2021/12/16 21:15
 * @description:单个类的命名策略 如果命名策略只需要作用于某个类，那么可以使用@JsonNaming注解。
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class AnimalJSONNaming {
    private String animalName;
    private int animalSex;
    private int animalWeight;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalSex() {
        return animalSex;
    }

    public void setAnimalSex(int animalSex) {
        this.animalSex = animalSex;
    }

    public int getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(int animalWeight) {
        this.animalWeight = animalWeight;
    }

    @Override
    public String toString() {
        return "AnimalNaming [animalName=" + animalName + ", animalSex=" + animalSex + ", animalWeight=" + animalWeight
                + "]";
    }
}
