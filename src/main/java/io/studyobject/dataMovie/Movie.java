package io.studyobject.dataMovie;

import io.studyobject.dataMovie.enums.MovieType;
import io.studyobject.movie.Money;
import io.studyobject.movie.condition.DiscountCondition;

import java.time.Duration;
import java.util.List;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;
}
