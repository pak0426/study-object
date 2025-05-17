package io.studyobject.example;

import java.util.Properties;
import java.util.Stack;

public class InheritExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("1st");
        stack.push("2nd");
        stack.push("3rd");

        stack.add(0, "4th");

        System.out.println(stack); // [4th, 1st, 2nd, 3rd]

        Properties properties = new Properties();
        properties.setProperty("Bjarne Stroustrup", "C++");
        properties.setProperty("James Gosling", "Java");

        properties.put("Dennis Ritchie", 67);

        System.out.println(properties.getProperty("Dennis Ritchie"));
    }
}
