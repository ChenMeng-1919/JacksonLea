package lesson03;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;

/*
 * @author: cm
 * @date: Created in 2021/12/16 22:34
 * @description:在反序列化时，想使用原来的字段名，而不是添加前缀后的名称。
 */
public class AppendPrefixStrategyForSetter extends PropertyNamingStrategy.PropertyNamingStrategyBase {
    @Override
    public String translate(String input) {
        return '_' + input;
    }

    @Override
    public String nameForSetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
        return defaultName;
    }
}
