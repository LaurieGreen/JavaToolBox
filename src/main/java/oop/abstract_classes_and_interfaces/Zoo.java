package oop.abstract_classes_and_interfaces;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {
        List<Animal> animalsInZoo = new ArrayList<>();
        Dog sarah = new Dog("sarah");
        Cat bennie = new Cat("bennie");

        animalsInZoo.add(sarah);
        animalsInZoo.add(bennie);

        System.out.println(animalsInZoo);
    }



}
