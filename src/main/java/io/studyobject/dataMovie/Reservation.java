package io.studyobject.dataMovie;

public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, Screening screening, Money money, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.money = money;
        this.audienceCount = audienceCount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Screening getScreening() {
        return screening;
    }

    public Money getFee() {
        return fee;
    }

    public int getAudienceCount() {
        return audienceCount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setScreening(Screening screening) {
        this.screening = screening;
    }

    public void setFee(Money fee) {
        this.fee = fee;
    }

    public void setAudienceCount(int audienceCount) {
        this.audienceCount = audienceCount;
    }
}
