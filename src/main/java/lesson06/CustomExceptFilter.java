package lesson06;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/21 15:28
 * @description:自定义过滤器
 * 前面在过滤字段的时候，我们使用的是SimpleBeanPropertyFilter.serializeAllExcept和SimpleBeanPropertyFilter.filterOutAllExcept。
 * 这两个方法，实际上是使用了预先定义好的两个过滤器，分别是SerializeExceptFilter和FilterExceptFilter。
 * 当已有的过滤器满足不了需求的时候，可以参考现有的过滤器，通过自定义过滤器来实现。
 * 先创建一个自定义的过滤器类，然后继承SimpleBeanPropertyFilter，实现两个include方法即可。
 */
@Slf4j
public class CustomExceptFilter extends SimpleBeanPropertyFilter {
    @Override
    protected boolean include(BeanPropertyWriter writer) {
        return filter(writer.getName(), writer.getType());
    }

    @Override
    protected boolean include(PropertyWriter writer) {
        return filter(writer.getName(), writer.getType());
    }

    private boolean filter(String fieldName, JavaType fieldType) {
        log.info(fieldName + " " + fieldType.getTypeName() + " " + fieldType.getRawClass());
        // 排除以n开头的字段，以及int类型的字段
        if (fieldName.startsWith("n") || fieldType.getRawClass() == int.class) {
            return false;
        }
        return true;
    }
}
