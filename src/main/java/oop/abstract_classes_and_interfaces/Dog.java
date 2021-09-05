package oop.abstract_classes_and_interfaces;

public class Dog extends Animal implements Canine{
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String eat(String food) {
        return "Eat some " + food;
    }

    @Override
    public String bark() {
        return "woof";
    }

    @Override
    public String chaseTail() {
        return "COME HERE, STAY Still";
    }

    @Override
    public String play(String gameToPlay) {
        return "I love playing " + gameToPlay;
    }
}
