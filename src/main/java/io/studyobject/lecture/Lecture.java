package io.studyobject.lecture;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private int pass;
    private String title;
    private List<Integer> scores = new ArrayList<>();

    public Lecture(int pass, String title, List<Integer> scores) {
        this.pass = pass;
        this.title = title;
        this.scores = scores;
    }

    public double average() {
        return scores.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }

    public List<Integer> getScores() {
        return scores;
    }

    public String evaluate() {
        return String.format("Pass:%d Fail %d", passCount(), failCount());
    }

    private long passCount() {
        return scores.stream().filter(scores -> scores >= pass).count();
    }

    private long failCount() {
        return scores.size() - passCount();
    }
}
