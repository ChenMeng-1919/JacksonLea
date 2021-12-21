package lesson07;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author: cm
 * @since: Created in 2021/12/21 19:11
 * @description:
 */
@Getter
@Setter
public class ProductWithJsonFormat {

    private String name;
    @JsonFormat(shape= JsonFormat.Shape.STRING)
    private Date publishDate;
}
