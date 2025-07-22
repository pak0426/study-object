package io.studyobject.telePhone.composition;

import io.studyobject.telePhone.Call;

import java.util.List;

public interface FeeCondition {
    List<DateTimeInterval> findTimeIntervals(Call call);
}
