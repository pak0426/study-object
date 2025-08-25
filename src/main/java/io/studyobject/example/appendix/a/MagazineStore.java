package io.studyobject.example.appendix.a;

public class MagazineStore extends BookStall {
    @Override
    public Book sell(IndependentPublisher independentPublisher) {
        return new Magazine(independentPublisher);
    }
}
