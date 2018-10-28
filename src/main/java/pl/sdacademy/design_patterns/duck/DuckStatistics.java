package pl.sdacademy.design_patterns.duck;

import pl.sdacademy.design_patterns.duck.Duck;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class DuckStatistics {


    private List<Duck> duckList;

    public DuckStatistics(List <Duck> duckList) {
        this.duckList = duckList;
    }


    public Integer getOldestDuckAge () {
        Integer oldest = duckList.stream()
                .sorted(Comparator.comparing(Duck::duckAge).reversed())
                .findFirst().map(Duck::duckAge).orElse(Integer.MIN_VALUE);


        return oldest;
    }

    public Integer getOldestDuckAgeLoop () {
        Integer oldest = Integer.MIN_VALUE;

        for (Duck duck : duckList) {
            Integer duckAge = duck.duckAge();
            if (duckAge > oldest) {
                oldest = duckAge;
            }
        }
        return oldest;
    }
}
