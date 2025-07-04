package io.studyobject.example.is_a;

public class Bird {
    public void fly() {
        System.out.println("날다.");
    }

    public void flyBird(Bird bird) {
        bird.fly();
    }
}
