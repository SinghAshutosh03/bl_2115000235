
import java.util.Scanner;

interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " is cooking food.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " is serving food.");
    }
}

public class Restaurant {
    public static void main(String[] args) {
        Chef chef = new Chef("John", 201);
        Waiter waiter = new Waiter("Mike", 202);

        chef.performDuties();
        waiter.performDuties();
    }
}

