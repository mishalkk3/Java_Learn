package Vet;

abstract class Animal {
    abstract void bark();
}

class Dog extends Animal {
    @Override
    void bark() {
        System.out.println("Bow! Bow!");
    }
}

class Cat extends Animal {
    @Override
    void bark() {
        System.out.println("Meow! Moew!");
    }
}


public class Test1 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};
        for (Animal animal : animals){
            animal.bark();
        }
    }
}