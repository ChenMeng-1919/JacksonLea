package lesson03;

/*
 * @author: cm
 * @date: Created in 2021/12/16 21:12
 * @description:
 */
public class AnimalNaming {
    private String animalName;
    private int animalSex;
    private int animalWeight;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalSex() {
        return animalSex;
    }

    public void setAnimalSex(int animalSex) {
        this.animalSex = animalSex;
    }

    public int getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(int animalWeight) {
        this.animalWeight = animalWeight;
    }

    @Override
    public String toString() {
        return "AnimalNaming [animalName=" + animalName + ", animalSex=" + animalSex + ", animalWeight=" + animalWeight
                + "]";
    }
}
