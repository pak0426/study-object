package io.studyobject.telePhone.composition.fee;

import io.studyobject.telePhone.Call;
import io.studyobject.telePhone.composition.DateTimeInterval;

import java.util.List;

public interface FeeCondition {
    List<DateTimeInterval> findTimeIntervals(Call call);
}
