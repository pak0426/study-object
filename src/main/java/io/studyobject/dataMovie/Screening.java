package io.studyobject.dataMovie;

import io.studyobject.movie.Money;

import java.time.LocalDateTime;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    public Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this);
    }

    public Movie getMovie() {
        return movie;
    }

    public int getSequence() {
        return sequence;
    }

    public LocalDateTime getWhenScreened() {
        return whenScreened;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setWhenScreened(LocalDateTime whenScreened) {
        this.whenScreened = whenScreened;
    }
}
