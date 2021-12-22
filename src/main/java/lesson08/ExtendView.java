package lesson08;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @since: Created in 2021/12/22 14:19
 * @description:不同视图之间可以相互继承，子视图将会包含父视图注解的字段
 */
@Slf4j
public class ExtendView {
    public static void main(String[] args) throws JsonProcessingException {
        ArticleWithExtendView article = new ArticleWithExtendView();
        article.setTitle("title");
        article.setSummary("summary");
        article.setContent("content");

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION); // 禁止序列化没有注解的字段

        String jsonString = mapper.writerWithView(MyJsonViews2.Summary.class).writeValueAsString(article);
        log.info(jsonString);

        // 由于Detail继承了Summary，所以能被Summary视图序列化的字段，也会被Detail视图序列化。
        jsonString = mapper.writerWithView(MyJsonViews2.Detail.class).writeValueAsString(article);
        log.info(jsonString);
    }
}
