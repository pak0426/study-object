package io.studyobject.example.appendix.a;

public class BookStall {
    public Book sell(IndependentPublisher independentPublisher) {
        return new Book(independentPublisher);
    }
}
