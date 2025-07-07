package io.studyobject.example.is_a;

public class Bird {
    public void fly() {

    }

    public void flyBird(Bird bird) {
        if (!(bird instanceof Penguin)) {
            bird.fly();
        }
    }
}
