package lesson05;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

/**
 * @author: cm
 * @since: Created in 2021/12/17 13:07
 * @description:首先，定义一个空的类，并添加JsonIgnoreType注解。
 * 在序列化时，调用ObjectMapper的addMixIn方法，将JsonIgnoreType注解应用于目标类。
 *
 */
@JsonIgnoreType
public class IgnoreType2 {
}
