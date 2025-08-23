package io.studyobject.example.appendix.a;

public class Customer {
    private Book book;

    public void order(BookStall bookStall) {
        this.book = bookStall.sell(new IndependentPublisher());
    }

}
