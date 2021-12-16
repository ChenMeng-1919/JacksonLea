package lesson03;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;

/*
 * @author: cm
 * @date: Created in 2021/12/16 22:30
 * @description:自定义命名策略，为字段添加下划线前缀
 */
public class AppendPrefixStrategy extends PropertyNamingStrategy.PropertyNamingStrategyBase {
    @Override
    public String translate(String input) {
        return '_' + input;
    }
}
