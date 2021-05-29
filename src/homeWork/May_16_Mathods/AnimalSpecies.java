package homeWork.May_16_Mathods;

public class AnimalSpecies {
    String name;
    int population;
    int groveRate;

    public void setInfo(String inputName, int inputPopulation, int inputGrowthRate){
        name = inputName;
        population = inputPopulation;
        groveRate = inputGrowthRate;
    }

    public String getName(){
        return name;
    }

    public double getPopulation(){
        return population;
    }

    public double getGrowthRate(){
        return groveRate;
    }

    @Override
    public String toString() {
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", population=" + population + "mil" +
                ", groveRate=" + groveRate + "%" +
                '}';
    }
}
