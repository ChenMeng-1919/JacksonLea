package lesson04;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/*
 * @author: cm
 * @date: Created in 2021/12/16 22:48
 * @description:
 */
@Getter
@Setter
public class Animal2NonNull2 {
    private String name;
    private int sex;
    @JsonInclude(JsonInclude.Include.NON_NULL) // 如果字段值为null，则不进行序列化
    private Integer weight;
}
