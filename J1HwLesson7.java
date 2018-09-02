/*
* Homework. Java 1. Lesson 7.
*
*@author Ilya Kukushkin
*@version 02 Sept 2018

*/

class J1HwLesson7 {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Barsik", 20), new Cat("Murzik", 10), 
                        new Cat("Murka", 5)};
        Plate plate = new Plate(30);
        System.out.println(plate);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + " is bellyful: " + cat.isBellyful());
        }
        System.out.println(plate);
        plate.increaseFood(20);
        System.out.println(plate);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + " is bellyful: " + cat.isBellyful());
        }
        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite;
    private int countBellyful;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    void eat(Plate plate) {
        if (appetite <= plate.getFood() && isBellyful() == false) {
            plate.dicreaseFood(appetite);
            countBellyful++;
        }
    }

    String getName() {
        return name;
    }

    boolean isBellyful() {
        return countBellyful > 0;
    }
}

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    int getFood() {
        return food;
    }

    void dicreaseFood(int food) {
        this.food -= food;
    }

    void increaseFood(int food) {
        this.food += food;
    }

    @Override
    public String toString() {
        return "Food: " + food;
    }
}