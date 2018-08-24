/**
* Homework. Java 1. Lesson 5.
*
*@author Ilya Kukushkin
*@version 24 Aug 2018
*/

import java.util.Arrays;

class J1HwLesson5 {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan Ivanovich", "Developer", "ivanov@gmail.com",
            "89167511211", 65000, 30);
        empArray[1] = new Employee("Gavrilenko Larisa Valerievna", "President of Gazprom", "larisaPresGazprom@rambler.ru",
            "89851111111", 450000, 44);
        empArray[2] = new Employee("Kuptsova Evegenia Vladimirovna", "Secretary of the President of Gazprom", "sec@gazprom.ru",
            "89855648976", 200000, 28);
        empArray[3] = new Employee("Kuranova Ekaterina Sergeevna", "Accountant of Pomidorka", "buh@pomidorka.org",
            "89035136974", 60000, 48);
        empArray[4] = new Employee("Kuranova Margarita Sergeevna", "Cosmetologist", "cosmetology@inbox.ru",
            "89633695645", 120000, 31);
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40)
                System.out.println(empArray[i].displayInf());
        }
        System.out.println(empArray[0].toString());
    }
}

class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    void setFullName(String fullName) {
        this.fullName = fullName;
    }

    String getFullName() {
        return this.fullName;
    }

    void setPosition(String position) {
        this.position = position;
    }

    String getPosition() {
        return this.position;
    }

    void setEmail(String email) {
        this.email = email;
    }

    String getEmail() {
        return this.email;
    }

    void setPhone(String phone) {
        this.phone = phone;
    }

    String getPhone() {
        return this.phone;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    int getSalary() {
        return this.salary;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }

    Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    String displayInf() {
        return "Full name: " + this.fullName + "\nPosition: " + this.position + "\nEmail: " + this.email + "\nPhone: " + this.phone +
            "\nSalary: " + this.salary + "\nAge: " + this.age + "\n";
    }

    @Override 
        public String toString() {
        return "Full name: " + this.fullName + "\nPosition: " + this.position + "\nEmail: " + this.email + "\nPhone: " + this.phone +
            "\nSalary: " + this.salary + "\nAge: " + this.age + "\n";
    }
}