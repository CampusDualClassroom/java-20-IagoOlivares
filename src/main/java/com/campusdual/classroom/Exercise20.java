package com.campusdual.classroom;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        List<Person> people = new ArrayList<>();
        Person person = new Person("John", "Smith");
        Teacher teacher = new Teacher("Maria", "Montessori", "Educacion");
        PoliceOfficer police = new PoliceOfficer("Jake ", "Peralta", "B-99");
        Doctor doctor = new Doctor("Gregory ", "House", "Nefrología e infectología");

        people.add(person);
        people.add(teacher);
        people.add(police);
        people.add(doctor);
        return people;
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
