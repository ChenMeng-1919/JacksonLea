package lesson08;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @author: cm
 * @since: Created in 2021/12/22 14:22
 * @description:
 */
@Slf4j
public class Deserialize {
    public static void main(String[] args) throws IOException {
        String jsonString = "{\"title\":\"title\",\"summary\":\"summary\",\"content\":\"content\"}";
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION); // 禁止序列化没有注解的字段

        ArticleWithExtendView article = mapper.readerWithView(MyJsonViews2.Summary.class).readValue(jsonString, ArticleWithExtendView.class);
        //ArticleWithExtendView article = mapper.readerWithView(MyJsonViews.Summary.class).forType(ArticleWithExtendView.class).readValue(jsonString);
        log.info(article.toString());
    }
}
