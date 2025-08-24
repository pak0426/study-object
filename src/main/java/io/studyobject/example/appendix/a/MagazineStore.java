package io.studyobject.example.appendix.a;

public class MagazineStore extends BookStall {
    @Override
    public Book sell(Publisher publisher) {
        return new Magazine(publisher);
    }
}
