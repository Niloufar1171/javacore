package com.niloufar.training.learningspring.cracking_code_of_interviewing;

public class Country {
    String name;
    String continent;
    Integer population;

    public Country(String name, String continent, Integer population) {
        this.name = name;
        this.continent = continent;
        this.population = population;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public float getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }
    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", population=" + population +
                '}';
    }

}
