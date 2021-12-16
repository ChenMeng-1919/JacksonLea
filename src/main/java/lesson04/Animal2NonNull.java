package lesson04;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/*
 * @author: cm
 * @date: Created in 2021/12/16 22:46
 * @description:
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@Getter
public class Animal2NonNull {
    private String name;
    private int sex;
    private Integer weight;

}
