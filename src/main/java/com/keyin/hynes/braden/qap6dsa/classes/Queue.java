package com.keyin.hynes.braden.qap6dsa.classes;
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
    public void dequeue(int id) {
        if (!isEmpty()) {
            for (Animal animal : animals) {
                if (animal.getId() == id) {
                    animal = null;
                    front++;
                    if (front > back) {
                        front = back = 1;
                    }
                    qty--;
                    System.out.println("Animal successfully removed.");
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
        System.out.println("Queue deleted.");
    }
}