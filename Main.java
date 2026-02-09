public class Main {
    public static void main(String[] args) {
        // A class is a blueprint (definition). An object is a real instance created from that blueprint.

        Dog dog1 = new Dog("Buddy", 3);     // dog1 is an object (instance) of the Dog class
        Dog dog2 = new Dog("Luna", 5);      // dog2 is another object, same class, different data

        System.out.println(dog1);
        System.out.println(dog2);

        dog1.haveBirthday();                // behavior changes dog1's state (age)
        System.out.println("After birthday: " + dog1);
    }
}

// Class = blueprint that defines data (fields) + behavior (methods)
class Dog {
    private String name;
    private int age;

    // Constructor = used to create (instantiate) an object
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method (behavior) that changes the object
    public void haveBirthday() {
        age++;
    }

    // Method that returns info about the object
    @Override
    public String toString() {
        return "Dog{name='" + name + "', age=" + age + "}";
    }
}
