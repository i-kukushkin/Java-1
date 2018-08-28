/**
* Homework. Java 1. Lesson 6.
*
*@author Ilya Kukushkin
*@version 28 Aug 2018
*/

class J1HwLesson6 {
    public static void main(String[] args) {
        IAnimal[] animals = {new Cat(100, 400, 1), new Dog(100, 5, 0.5)};
        for (IAnimal animal : animals) 
            System.out.println("Run: " + animal.run() + "\nSwim: " + animal.swim() +
                                "\nJump: " + animal.jump());
    }
}

interface IAnimal {
    abstract boolean run();
    abstract boolean jump();
    abstract boolean swim();
}

abstract class Animal implements IAnimal {
    int limitForRun;
    int limitForSwim;
    double heightForJump;

    Animal(int limitForRun, int limitForSwim, double heightForJump) {
        this.limitForRun = limitForRun;
        this.limitForSwim = limitForSwim;
        this.heightForJump = heightForJump;
    }
}

class Cat extends Animal {

    Cat(int limitForRun, int limitForSwim, double heightForJump) {
        super(limitForRun, limitForSwim, heightForJump);
    }

    public boolean run() {
        return (limitForRun > 0 && limitForRun <= 200);
    }

    public boolean jump() {
        return (heightForJump > 0 && heightForJump <= 2);
    }

    public boolean swim() {
        return false; // Cat can not swim.
    }
}

class Dog extends Animal {

    Dog(int limitForRun, int limitForSwim, double heightForJump) {
        super(limitForRun, limitForSwim, heightForJump);
    }

    public boolean run() {
        return (limitForRun > 0 && limitForRun <= 500);
    }

    public boolean jump() {
        return (heightForJump > 0 && heightForJump <= 0.5f);
    }

    public boolean swim() {
        return (limitForSwim > 0 && limitForSwim <= 10);
    }
}