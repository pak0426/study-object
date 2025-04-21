package io.studyobject.movie;

import io.studyobject.dataMovie.PeriodCondition;
import io.studyobject.dataMovie.Screening;
import io.studyobject.dataMovie.SequenceCondition;

import java.util.List;

public class Movie {
    private List<PeriodCondition> periodConditions;
    private List<SequenceCondition> sequenceConditions;

    private boolean checkPeriodConditions(Screening screening) {
        return periodConditions.stream()
                .anyMatch(condition -> condition.isSatisfiedBy(screening));
    }

    private boolean checkSequenceConditions(Screening screening) {
        return sequenceConditions.stream()
                .anyMatch(condition -> condition.isSatisfiedBy(screening));
    }
}
