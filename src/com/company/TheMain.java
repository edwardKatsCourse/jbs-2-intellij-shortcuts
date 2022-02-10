package com.company;

import java.time.LocalDateTime;

public class TheMain {

    public static void main(String[] args) throws InterruptedException {
        // Project explorer     -> Alt + 1
        // Run tab (console)    -> Alt + 4
        // Debug tab (console)  -> Alt + 5


        // Back to code     -> Esc

        // Close side tab   -> Shift + Esc
        // (Project explorer, Run menu)

        // entities.users.User

        // Run current application -> ctrl + shift + F10

        // start program         -> shift + F10
        // start program (debug) -> shift + F9


        // Run tab (console)    -> Alt + 4
        // restart              -> ctrl + F5
        // stop                 -> ctrl + F2

        // Switch Tabs           -> Alt + left/right arrow
        // Switch opened classes -> Alt + left/right arrow


        // Open recent files -> ctrl + e

        // close current tab (class) -> ctrl + F4

        // rename (+ all usages) -> shift + F6
        // (variables, classes, methods)

        // alt + F7 -> find class/method/variable usages in the entire project

        String zyx = "abc";
        System.out.println(zyx + "");
        System.out.println(zyx + zyx);


        String value = "abc";
        System.out.println(value);
        new User().display();



        // Search
        // - inside files/classes (regular)
        // - by class/file name   (boost)

        // search inside file -> ctrl + f
        // search inside all files -> ctrl + shift + f

        // search by class name -> ctrl + n
        // search by file name -> ctrl + shift + n

        // search by method name (symbols) -> ctrl + shift + alt + n

        // update multiple lines -> ctrl + shift + alt + (mouse click)
        // расставить множественные катретки




        System.out.println("main " + LocalDateTime.now());

        while (true) {
            Thread.sleep(1000);
        }
    }

    public void display() {
    }


}

class Abc {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("abc" + LocalDateTime.now());

        new User().display();
        while (true) {
            Thread.sleep(1000);
        }
    }
}

class Zyx {

    public static void aaa() {

        new User().display();
    }
}