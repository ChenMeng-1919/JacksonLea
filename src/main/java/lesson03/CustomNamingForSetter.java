package lesson03;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * @author: cm
 * @date: Created in 2021/12/16 22:36
 * @description:
 */
public class CustomNamingForSetter {
    public static void main(String[] args) throws JsonProcessingException {
        AnimalNaming animal = new AnimalNaming();
        animal.setAnimalName("sam");
        animal.setAnimalSex(1);
        animal.setAnimalWeight(100);

        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new AppendPrefixStrategyForSetter());
        System.out.println(mapper.writeValueAsString(animal));

//  String jsonString = "{\"_animalName\":\"sam\",\"_animalSex\":1,\"_animalWeight\":100}";
        String jsonString = "{\"animalName\":\"sam\",\"animalSex\":1,\"animalWeight\":100}";
        AnimalNaming animal2 = mapper.readValue(jsonString, AnimalNaming.class);
        System.out.println(animal2.toString());
    }
}
