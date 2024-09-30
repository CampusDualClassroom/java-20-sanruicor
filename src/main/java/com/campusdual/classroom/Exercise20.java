package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        List <Person> lista = new ArrayList<>();
        lista.add(new Person("John", "Smith"));
        lista.add(new Teacher("María", "Montessori", "Educación"));
        lista.add(new PoliceOfficer("Jake", "Peralta", "B-99"));
        lista.add(new Doctor("Gregory", "House", "Nefrología e infectología"));

        return lista;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        for (Person person : stringList) {
            person.getDetails();
        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }



}
