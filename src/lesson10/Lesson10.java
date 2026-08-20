package lesson10;

public class Lesson10 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();

        dog.name = "Mike";
        dog.age = 5;
        dog.gender = true;
        dog.color = "White";

        dog.makeSound();

        Puppy p = new Puppy();
        p.makeSound();

        Cat cat = new Cat();
        Puppy puppy = new Puppy();
        Horse horse = new Horse();

        Animal[] animals = {dog, puppy, horse, cat};

        System.out.println("++++++++++++++++++++++");
        for (Animal a : animals) {
            a.makeSound();
        }


    }


}
