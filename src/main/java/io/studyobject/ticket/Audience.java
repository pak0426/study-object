package io.studyobject.ticket;

public class Audience {
    private Bag bag;
    private Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}