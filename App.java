package com.example;

public class App {

    public static String greet(String name) {
        return "Hello, " + name + "! Built with Maven on Jenkins.";
    }

    public static void main(String[] args) {
        String target = args.length > 0 ? args[0] : "World";
        System.out.println(greet(target));
        System.out.println("Build successful ✓");
    }
}
