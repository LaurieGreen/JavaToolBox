package oop.abstract_classes_and_interfaces;

public class Cat extends Animal implements Feline{
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String eat(String food) {
        return "chicken... only chicken owner!";
    }

    @Override
    public String meow() {
        return "I meow whe I want something";
    }

    @Override
    public String play(String gameToPlay) {
        return "I don't play " + gameToPlay;
    }

    @Override
    public String stareAtOwnerWhileAsleepJustInCaseTheyWakeUp() {
        return "that's right... I'm waiting for the right moment";
    }
}
