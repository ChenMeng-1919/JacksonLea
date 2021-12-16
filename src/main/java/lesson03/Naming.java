package lesson03;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: cm
 * @date: Created in 2021/12/16 21:13
 * @description:全局的命名策略 Jackson为我们提供了6个默认的命名策略。
 */
@Slf4j
public class Naming {
    public static void main(String[] args) throws JsonProcessingException {
        AnimalNaming animal = new AnimalNaming();
        animal.setAnimalName("sam");
        animal.setAnimalSex(1);
        animal.setAnimalWeight(100);

        // 驼峰命名，字段的首字母小写. {"animalName":"sam","animalSex":1,"animalWeight":100}
        ObjectMapper mapper1 = new ObjectMapper();
        mapper1.setPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CAMEL_CASE);
        log.info(mapper1.writeValueAsString(animal));

        // 驼峰命名，字段的首字母大写. {"AnimalName":"sam","AnimalSex":1,"AnimalWeight":100}
        ObjectMapper mapper2 = new ObjectMapper();
        mapper2.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
        log.info(mapper2.writeValueAsString(animal));

        // 字段小写，多个单词以下划线_分隔. {"animal_name":"sam","animal_sex":1,"animal_weight":100}
        ObjectMapper mapper3 = new ObjectMapper();
        mapper3.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        log.info(mapper3.writeValueAsString(animal));

        // 字段小写，多个单词以中横线-分隔. {"animal-name":"sam","animal-sex":1,"animal-weight":100}
        ObjectMapper mapper4 = new ObjectMapper();
        mapper4.setPropertyNamingStrategy(PropertyNamingStrategy.KEBAB_CASE);
        log.info(mapper4.writeValueAsString(animal));

        // 字段小写，多个单词间无分隔符. {"animalname":"sam","animalsex":1,"animalweight":100}
        ObjectMapper mapper5 = new ObjectMapper();
        mapper5.setPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CASE);
        log.info(mapper5.writeValueAsString(animal));

        // 字段小写，多个单词以点号.分隔. {"animal.name":"sam","animal.sex":1,"animal.weight":100}
        ObjectMapper mapper6 = new ObjectMapper();
        mapper6.setPropertyNamingStrategy(PropertyNamingStrategy.LOWER_DOT_CASE);
        log.info(mapper6.writeValueAsString(animal));
    }
}
