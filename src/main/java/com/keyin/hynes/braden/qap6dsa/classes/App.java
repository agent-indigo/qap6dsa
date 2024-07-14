package com.keyin.hynes.braden.qap6dsa.classes;
import java.util.Scanner;
import com.keyin.hynes.braden.qap6dsa.enums.Species;
public final class App {
    private int selection;
    private String selectionPromptMessage;
    private String invalidInputMessage;
    private Scanner scanner;
    private Animal animal;
    private Queue queue;
    private App() {
        this.selection = 0;
        this.selectionPromptMessage = "\nEnter selection:\n";
        this.invalidInputMessage = "\nInvalid input.\n";
        this.scanner = new Scanner(System.in);
        this.animal = new Animal();
        this.queue = new Queue(20);
    }
    public static void main(String[] args) {
        App app = new App();
        try {
            app.mainMenu();
        } catch (Exception exception) {
            exception.printStackTrace();
            System.exit(1);
        } finally {
            if (app.scanner != null) app.scanner.close();
        }
    }
    private void mainMenu() {
        while (selection != 3) {
            System.out.println("\nMain Menu\n");
            System.out.println("1: Add animal");
            System.out.println("2: Remove animal");
            System.out.println("3: Exit");
            System.out.println(selectionPromptMessage);
            try {
                this.selection = Integer.parseInt(scanner.nextLine());
                switch (selection) {
                    case 1: {
                        this.selection = 0;
                        add();
                        break;
                    } case 2: {
                        this.selection = 0;
                        remove();
                        break;
                    } case 3: {
                        System.exit(0);
                    } default: {
                        this.selection = 0;
                        System.err.println(invalidInputMessage);
                        break;
                    }
                }
            } catch (NumberFormatException numberFormatException) {
                System.err.println(invalidInputMessage);
            }
        }
    }
    private void add() {
        System.out.println("\nEnter animal\'s name:\n");
        animal.setName(scanner.nextLine());
        while (selection != 1 && selection != 2) {
            System.out.println("\nIs this animal a cat or a dog?\n");
            System.out.println("1: Cat");
            System.out.println("2: Dog");
            try {
                this.selection = Integer.parseInt(scanner.nextLine());
                switch (selection) {
                    case 1: {
                        animal.setSpecies(Species.cat);
                        break;
                    } case 2: {
                        animal.setSpecies(Species.dog);
                        break;
                    } default: {
                        this.selection = 0;
                        System.err.println(invalidInputMessage);
                        break;
                    }
                }
            } catch (NumberFormatException numberFormatException) {
                System.err.println(invalidInputMessage);
            }
        }
        this.selection = 0;
        queue.enqueue(animal);
    }
    private void remove() {
        while (selection != 1 && selection != 2) {
            System.out.println("\nRemove a cat or a dog?\n");
            System.out.println("1: Cat");
            System.out.println("2: Dog");
            System.out.println(selectionPromptMessage);
            try {
                this.selection = Integer.parseInt(scanner.nextLine());
                switch (selection) {
                    case 1: {
                        queue.dequeue(Species.cat);
                        break;
                    } case 2: {
                        queue.dequeue(Species.dog);
                        break;
                    } default: {
                        this.selection = 0;
                        System.err.println(invalidInputMessage);
                        break;
                    }
                }
            } catch (NumberFormatException numberFormatException) {
                System.err.println(invalidInputMessage);
            }
        }
        this.selection = 0;
    }
}