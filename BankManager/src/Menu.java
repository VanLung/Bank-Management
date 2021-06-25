/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author
 */
public class Menu extends ArrayList<String> {

    public void printMenu() {
        for (int i = 0; i < this.size(); i++) {
            System.out.println((i + 1) + ". " + this.get(i));
        }
    }

    public static void printMainMenu() {
        Menu mainMenu = new Menu();
        mainMenu.add("Create");
        mainMenu.add("Find and Sort");
        mainMenu.add("Update/Delete");
        mainMenu.add("Report");
//        mainMenu.add("Update");
        mainMenu.add("Exit");
        System.out.println("STUDENT MANAGEMENT");
        mainMenu.printMenu();
        System.out.print("Your choice: ");
    }

    public static void printFindSortMenu() {
        Menu findOrSortMenu = new Menu();
        findOrSortMenu.add("Find and Sort");
        findOrSortMenu.add("Go back to menu");
        findOrSortMenu.printMenu();
    }

    public static void printUpdateDeleteMenu() {
        Menu updateOrDeleteMenu = new Menu();
        updateOrDeleteMenu.add("Update");
        updateOrDeleteMenu.add("Delete");
        updateOrDeleteMenu.add("Go back to menu");
        updateOrDeleteMenu.printMenu();
    }

    public static void printUpdateMenu() {
        Menu updateMenu = new Menu();
        updateMenu.add("Update name");
        updateMenu.add("Add new course");
        updateMenu.add("Remove course");
        updateMenu.add("Update course");
        updateMenu.add("Go back to menu");
        updateMenu.printMenu();
    }

    public static void printCourseMenu() {
        Menu courseMenu = new Menu();
        courseMenu.add("Java");
        courseMenu.add(".NET");
        courseMenu.add("C/C++");
        courseMenu.add("Finish");
        System.out.println("Choose course: ");
        courseMenu.printMenu();
    }

}
