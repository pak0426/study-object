package io.studyobject.telePhone.inheritation;

import io.studyobject.movie.Money;
import io.studyobject.telePhone.Call;
import io.studyobject.telePhone.Phone;
import lombok.Getter;

import java.time.Duration;

@Getter
public class RegularPhone extends Phone {
    private Money amount;
    private Duration seconds;

    public RegularPhone(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times((double) call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
