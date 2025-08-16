package com.niloufar.training.learningspring.java_features.streamAPI;

import com.niloufar.training.learningspring.java_features.streamAPI.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class chapterThirdteen {

    public static void main(String[] args) {
        List<Country> world = new ArrayList<>();
        world.add(new Country("Iran", "Asia", 100));
        world.add(new Country("Iraq", "Asia", 80));
        world.add(new Country("India", "Asia", 1600));
        world.add(new Country("Egypt", "Africa", 1600));
        float world_population = 0;
        for (Country c : world) {
            world_population += c.population;
        }
        System.out.println(world_population);

        world.stream().filter(country -> country.continent.equals("Asia")).forEach(System.out::println);
        //return all the countire's population in Asia!
        List<Integer> population_Asia = world.stream().filter(country -> country.continent.equals("Asia")).map(country -> country.population).collect(Collectors.toList());

        //calculate the population in asia
        Integer Asia_population2  = world.stream()
                .filter(country -> country.continent.equals("Asia"))
                .map(country -> country.population)
                .mapToInt(Integer::intValue).sum();


        Integer Asia_population =  population_Asia.stream().reduce(0, Integer::sum);
        System.out.println("The population in all asia is : " + Asia_population2);

    }


}
