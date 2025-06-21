package io.studyobject.telePhone.inheritance;

import io.studyobject.movie.Money;
import io.studyobject.telePhone.Call;
import lombok.Getter;

import java.time.Duration;

@Getter
public class NightlyDiscountInheritancePhone extends InheritancePhone {
    private static final int LATE_NIGHT_HOUR = 22;

    private Money nightlyAmount;
    private Money regularAmount;
    private Duration seconds;

    public NightlyDiscountInheritancePhone(Money nightlyAmount, Money regularAmount, Duration seconds) {
        this.nightlyAmount = nightlyAmount;
        this.regularAmount = regularAmount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        if (call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
            return nightlyAmount.times((double) call.getDuration().getSeconds() / seconds.getSeconds());
        } else {
            return regularAmount.times((double) call.getDuration().getSeconds() / seconds.getSeconds());
        }
    }
}
