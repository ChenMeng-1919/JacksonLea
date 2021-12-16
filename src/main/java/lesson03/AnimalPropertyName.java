package lesson03;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: cm
 * @date: Created in 2021/12/16 21:09
 * @description:属性名称@JsonProperty 对于需要修改名称的字段，可以在字段或getter方法添加@JsonProperty注解，指定一个固定的名称来替代原来的字段名。
 */
public class AnimalPropertyName {

    @JsonProperty("animalName") // 字段重命名. 可以对字段或getter进行声明
    private String name;
    private int sex;
    private Integer weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("animalSex") // 字段重命名. 可以对字段或getter进行声明
    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", sex=" + sex + ", weight=" + weight + "]";
    }
}
