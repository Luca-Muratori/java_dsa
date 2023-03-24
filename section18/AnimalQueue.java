import java.util.*;

public class AnimalQueue {
    LinkedList<Dog> dogs = new LinkedList<Dog>();
    LinkedList<Cat> cats = new LinkedList<Cat>();

    private int order = 0;

    public void enQueue(Animal a) {
        a.setOrder(order);
        order++;
        if (a instanceof Dog) {
            dogs.addLast((Dog) a);
        } else if (a instanceof Cat) {
            cats.addLast((Cat) a);
        }
    }

    public int size() {
        return dogs.size() + cats.size();
    }

    public Dog deQueueDog() {
        return dogs.poll();
    }

    public Dog peekDog() {
        return dogs.peek();
    }

    public Cat deQueueCat() {
        return cats.poll();
    }

    public Cat peekCat() {
        return cats.peek();
    }

    public Animal deQueueAny() {
        if (dogs.size() == 0) {
            return deQueueCat();
        } else if (cats.size() == 0) {
            return deQueueDog();
        }
        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.isOlderThan(cat)) {
            return dogs.poll();
        } else {
            return cats.poll();
        }
    }

    public Animal peek() {
        if (dogs.size() == 0) {
            return cats.peek();
        } else if (cats.size() == 0) {
            return dogs.peek();
        }
        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.isOlderThan(cat)) {
            return dogs.peek();
        } else {
            return cats.peek();
        }

    }
}
