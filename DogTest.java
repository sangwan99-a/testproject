
class Dog {
    String name;

    Dog(String name) {
        this.name = name;
    }

    void bark() {
        System.out.println(name + " says Woog!");
    }
}

public class DogTest {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.bark();
    }
}

