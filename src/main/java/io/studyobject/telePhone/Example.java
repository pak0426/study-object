package io.studyobject.telePhone;

import io.studyobject.movie.Money;

import java.time.Duration;
import java.time.LocalDateTime;

public class Example {
    public static void main(String[] args) {
        RegularPhone regularPhone = new RegularPhone(Money.wons(5), Duration.ofSeconds(10), 0.0);
        regularPhone.call(new Call(LocalDateTime.of(2018, 1, 1, 12, 10, 0),
                            LocalDateTime.of(2018, 1, 1, 12, 11, 0)));
        regularPhone.call(new Call(LocalDateTime.of(2018, 2, 1, 12, 10, 0),
                            LocalDateTime.of(2018, 1, 2, 12, 11, 0)));
    }
}
