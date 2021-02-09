package org.spyrosmouchlianitis.todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>(); //array list to store the tasks

        System.out.println("Welcome!");
        while (true) {
            //print the tasks, if there are any
            if (!tasks.isEmpty()) {
                for (Task task : tasks) {
                    System.out.println(task.getTask());
                }
            }

            menu(); //print the menu

            Scanner scanner = new Scanner(System.in);
            int input = 0;
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    input = scanner.nextInt();
                    break;
                }
                scanner.nextLine();
                System.out.println("Wrong input! Please enter a number");
            }

            switch (input) {
                case 1:
                    //add new task
                    System.out.println("Please enter your task");
                    Task temp = new Task();
                    temp.setTask(scanner.nextLine()); //TODO reads a line without input
                    tasks.add(temp);
                    break;
                case 2:
                    //check task

                    break;
                default:
                    System.out.println("Hope you had a productive day!");
                    System.exit(0);
            }
        }
    }

    private static void menu() {
        System.out.println("1. Add task");
        System.out.println("2. Check task");
        System.out.println("3. Remove task");
        System.out.println("4. Quit");
    }

}
