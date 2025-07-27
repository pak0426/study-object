package io.studyobject.telePhone.composition.fee;

import io.studyobject.movie.Money;
import io.studyobject.telePhone.composition.DateTimeInterval;

import java.time.Duration;

public class FeePerDuration {
    private Money fee;
    private Duration duration;

    public FeePerDuration(Money fee, Duration duration) {
        this.fee = fee;
        this.duration = duration;
    }

    public Money calculate(DateTimeInterval interval) {
        return fee.times(Math.ceil((double) interval.duration().toNanos() / duration.toNanos()));
    }
}
