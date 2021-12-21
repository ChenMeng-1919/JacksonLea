package lesson07;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author: cm
 * @since: Created in 2021/12/21 15:42
 * @description:默认日期格式
 * 创建一个代表产品的类Product，其中发布时间publishDate为Date类型。
 */
@Getter
@Setter
public class Product {
    private String name;
    private Date publishDate;


    @Override
    public String toString() {
        return "Product [name=" + name + ", publishDate=" + publishDate + "]";
    }
}
