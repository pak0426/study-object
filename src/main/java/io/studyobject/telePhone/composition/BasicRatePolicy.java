package io.studyobject.telePhone.composition;

import io.studyobject.movie.Money;
import io.studyobject.telePhone.Call;
import io.studyobject.telePhone.composition.appendix.EmptyCallException;
import io.studyobject.telePhone.composition.fee.FeeRule;

import java.util.Arrays;
import java.util.List;

public abstract class BasicRatePolicy implements RatePolicy {
    private List<FeeRule> feeRules;

    public BasicRatePolicy(FeeRule... feeRules) {
        this.feeRules = Arrays.asList(feeRules);
    }

    @Override
    public Money calculateFee(CompositionPhone phone) {
        return phone.getCalls()
                .stream()
                .map(call -> calculate(call))
                .reduce(Money.ZERO, Money::plus);
    }

    @Override
    public Money calculateFee(List<Call> calls) {
        if (calls == null || calls.isEmpty()) {
            throw new EmptyCallException();
        }

        Money result = Money.ZERO;

        for (Call call : calls) {
            result.plus(calculateCallFee(call));
        }

        return result;
    }

    private Money calculate(Call call) {
        return feeRules.stream()
                .map(rule -> rule.calculateFee(call))
                .reduce(Money.ZERO, Money::plus);
    }

    public Money calculate(RatePolicy policy,  List<Call> calls) {
        try {
            return policy.calculateFee(calls);
        } catch (EmptyCallException e) {
            return Money.ZERO;
        }
    }

    protected abstract Money calculateCallFee(Call call);
}
