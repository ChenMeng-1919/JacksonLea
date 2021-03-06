/*
 * 爱组搭 http://aizuda.com 低代码组件化开发平台
 * ------------------------------------------
 * 受知识产权保护，请勿删除版权申明
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;

/**
 * JSON 字符与对像转换
 * <p>
 * 尊重知识产权，CV 请保留版权，爱组搭 http://aizuda.com 出品
 *
 * @author hubin
 * @since 2021-11-09
 */
@Slf4j
public class JacksonUtils {

    private static ObjectMapper OBJECT_MAPPER;

    /**
     * 获取 Jackson ObjectMapper 为空则初始化
     *
     * @return {@link ObjectMapper}
     */
    public static ObjectMapper getObjectMapper() {
        if (null == OBJECT_MAPPER) {
            OBJECT_MAPPER = new ObjectMapper();
            //在反序列化时忽略在 json 中存在但 Java 对象不存在的属性
            OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            //在序列化时忽略值为 null 的属性
            OBJECT_MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            // 忽略 transient 关键词属性
            OBJECT_MAPPER.configure(MapperFeature.PROPAGATE_TRANSIENT_MARKER, true);
            // Long 转为 String 防止 js 丢失精度
            SimpleModule simpleModule = new SimpleModule();
            simpleModule.addSerializer(Long.class, ToStringSerializer.instance);
            OBJECT_MAPPER.registerModule(simpleModule);
            OBJECT_MAPPER.registerModule(new JavaTimeModule());
        }
        return OBJECT_MAPPER;
    }

    /**
     * 把JavaBean转换为json字符串
     */
    public static String toJSONString(Object object) {
        try {
            return toJsonThrows(object);
        } catch (Exception e) {
            log.error("toJSONString error.", e);
        }
        return null;
    }


    /**
     * 把json字符串转换为JavaBean
     */
    public static <T> T parse(String json, Class<T> tClass) {
        try {
            return parseThrows(json, tClass);
        } catch (Exception e) {
            log.error("JSONString parse error.", e);
        }
        return null;
    }

    /**
     * 把json字符串转换为JavaBean,支持泛型
     */
    public static <T> T parse(String json, TypeReference<T> valueTypeRef) {
        try {
            return parseThrows(json, valueTypeRef);
        } catch (Exception e) {
            log.error("JSONString parse error.", e);
        }
        return null;
    }

    /**
     * 把JavaBean转换为json字符串，抛出异常
     */
    public static String toJsonThrows(Object object) throws Exception {
        return getObjectMapper().writeValueAsString(object);
    }

    /**
     * 把json字符串转换为JavaBean，抛出异常
     */
    public static <T> T parseThrows(String json, Class<T> tClass) throws Exception {
        return getObjectMapper().readValue(json, tClass);
    }

    /**
     * 把json字符串转换为JavaBean，支持泛型，抛出异常
     */
    public static <T> T parseThrows(String json, TypeReference<T> valueTypeRef) throws JsonProcessingException {
        return getObjectMapper().readValue(json, valueTypeRef);
    }

}
