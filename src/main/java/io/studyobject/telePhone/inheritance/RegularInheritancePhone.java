package io.studyobject.telePhone.inheritance;

import io.studyobject.movie.Money;
import io.studyobject.telePhone.Call;
import lombok.Getter;

import java.time.Duration;

@Getter
public class RegularInheritancePhone extends InheritancePhone {
    private Money amount;
    private Duration seconds;

    public RegularInheritancePhone(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times((double) call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
