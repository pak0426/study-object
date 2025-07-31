package io.studyobject.appendix.a;

import io.studyobject.movie.Money;
import io.studyobject.telePhone.Call;

import java.util.List;

public interface RatePolicy {
    Money calculateFee(List<Call> calls);
}
