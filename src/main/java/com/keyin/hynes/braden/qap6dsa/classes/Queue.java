package com.keyin.hynes.braden.qap6dsa.classes;
import com.keyin.hynes.braden.qap6dsa.enums.Species;
public class Queue {
    private Animal[] animals;
    private int qty;
    private int front;
    private int back;
    public Queue(int size) {
        this.animals = new Animal[size];
        this.qty = 0;
        this.front = -1;
        this.back = -1;
    }
    public boolean isFull() {
        if (back == animals.length - 1) {
            System.err.println("Queue is full.");
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty() {
        if (qty == 0) {
            System.err.println("Queue is empty.");
            return true;
        } else {
            return false;
        }
    }
    public void enqueue(Animal animal) {
        if (isEmpty()) {
            this.front = 0;
            qty++;
            back++;
            animals[back] = animal;
            System.out.println("Animal successfully added.");
        } else if (!isFull() && !isEmpty()) {
            back++;
            qty++;
            animals[back] = animal;
            System.out.println("Animal successfully added.");
        } else {
            isFull();
        }
    }
    public void dequeue(Species species) {
        if (!isEmpty()) {
            for (int i = front; i <= back; i++) {
                if (animals[i].getSpecies() == species) {
                    System.out.println("Removed: " + animals[i].getName());
                    for (int j = i; j < back; j++) {
                        animals[j] = animals[j + 1];
                    }
                    animals[back] = null;
                    back--;
                    qty--;
                    return;
                }
            }
        } else {
            isEmpty();
        }
    }
    public Animal peek() {
        return animals[front];
    }
    public void delete() {
        this.animals = null;
        this.qty = 0;
        this.front = -1;
        this.back = -1;
        System.out.println("Queue deleted.");
    }
}