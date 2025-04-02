package io.studyobject.movie;

import io.studyobject.movie.policy.DiscountPolicy;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration duration;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration duration, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.duration = duration;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        if (discountPolicy == null) {
            return fee;
        }

        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
