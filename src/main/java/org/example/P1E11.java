package org.example;

public class P1E11 {
    // Part 1: Defining Base Structure - Interface for Animal Behavior
    public interface AnimalBehavior {
        void eat();
        void sleep();
        void makeSound();
    }

    // Part 1: Defining Base Structure - Abstract class for Animals
    public static abstract class Animal implements AnimalBehavior {
        String name;
        int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void sleep() {
            System.out.println(name + " is sleeping.");
        }

        public abstract void displayInformation();
    }

    // Part 2: Creating Specific Animal Classes - mammal class
    public static class Mammal extends Animal {
        public Mammal(String name, int age) {
            super(name, age);
        }

        @Override
        public void eat() {
            System.out.println(name + " the mammal is eating.");
        }

        @Override
        public void makeSound() {
            System.out.println(name + " makes a sound.");
        }

        @Override
        public void displayInformation() {
            System.out.println("Mammal Name: " + name + ", Age: " + age);
        }
    }

    // Part 2: Creating Specific Animal Classes - Bird class
    public static class Bird extends Animal {
        public Bird(String name, int age) {
            super(name, age);
        }

        @Override
        public void eat() {
            System.out.println(name + " the bird is eating a worm.");
        }

        @Override
        public void makeSound() {
            System.out.println(name + " chirp chirp!");
        }

        @Override
        public void displayInformation() {
            System.out.println("Bird Name: " + name + ", Age: " + age);
        }
    }

    // Part 2: Creating Specific Animal Classes - Specific animal classes
    public static class Lion extends Mammal {
        public Lion(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " roars.");
        }
    }

    public static class Elephant extends Mammal {
        public Elephant(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " makes elephant noises...");
        }
    }

    public static class Parrot extends Bird {
        public Parrot(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " mimics human.");
        }
    }

    public static class Eagle extends Bird {
        public Eagle(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " screeches.");
        }
    }

    // Part 3: Implementing Features Using OOP Concepts
    public static void main(String[] args) {
        Animal lion = new Lion("Aslan", 100);
        Animal elephant = new Elephant("Dumbo", 2);
        Animal parrot = new Parrot("Polly", 17);
        Animal eagle = new Eagle("Americaaa", 1);

        Animal[] zooAnimals = {lion, elephant, parrot, eagle};

        for (Animal animal : zooAnimals) {
            animal.eat();
            animal.makeSound();
            animal.sleep();
            animal.displayInformation();
            System.out.println("**********");
        }
    }
}
