package io.studyobject.telePhone.composition.fee;

import io.studyobject.telePhone.Call;
import io.studyobject.telePhone.composition.DateTimeInterval;

import java.util.Collections;
import java.util.List;

public class FixedFeeCondition implements FeeCondition {
    @Override
    public List<DateTimeInterval> findTimeIntervals(Call call) {
        return Collections.singletonList(call.getInterval());
    }
}
