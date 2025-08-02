package io.studyobject.telePhone.composition.appendix;

import io.studyobject.movie.Money;
import io.studyobject.telePhone.composition.CompositionPhone;

public class Bill {
    private CompositionPhone phone;
    private Money fee;

    public Bill(CompositionPhone phone, Money fee) {
        if (phone == null) {
            throw new IllegalArgumentException();
        }

        if (fee.isLessThan(Money.ZERO)) {
            throw new IllegalArgumentException();
        }

        this.phone = phone;
        this.fee = fee;
    }
}
