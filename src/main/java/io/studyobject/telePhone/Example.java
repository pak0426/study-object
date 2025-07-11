package io.studyobject.telePhone;

import io.studyobject.movie.Money;
import io.studyobject.telePhone.composition.CompositionPhone;
import io.studyobject.telePhone.composition.NightlyDiscountPolicy;
import io.studyobject.telePhone.composition.FixedFeePolicy;

import java.time.Duration;

public class Example {
    public static void main(String[] args) {
//        RegularPhone regularPhone = new RegularPhone(Money.wons(5), Duration.ofSeconds(10));
//        regularPhone.call(new Call(LocalDateTime.of(2018, 1, 1, 12, 10, 0),
//                            LocalDateTime.of(2018, 1, 1, 12, 11, 0)));
//        regularPhone.call(new Call(LocalDateTime.of(2018, 2, 1, 12, 10, 0),
//                            LocalDateTime.of(2018, 1, 2, 12, 11, 0)));

        CompositionPhone regularPhone = new CompositionPhone(new FixedFeePolicy(Money.wons(10), Duration.ofSeconds(10)));

        CompositionPhone nightlyDiscountPhone = new CompositionPhone(new NightlyDiscountPolicy(Money.wons(5), Money.wons(10), Duration.ofSeconds(10)));
    }
}
