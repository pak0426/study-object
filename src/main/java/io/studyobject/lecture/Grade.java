package io.studyobject.lecture;

import lombok.Getter;

@Getter
public class Grade {
    private String name;
    private int upper, lower;

    public Grade(String name, int upper, int lower) {
        this.name = name;
        this.upper = upper;
        this.lower = lower;
    }

    public boolean isName(String name) {
        return this.name.equals(name);
    }

    public boolean isInclude(int score) {
        return score >= lower && score <= upper;
    }
}
