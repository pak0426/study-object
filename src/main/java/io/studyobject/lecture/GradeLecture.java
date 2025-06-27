package io.studyobject.lecture;

import java.util.List;

public class GradeLecture extends Lecture {
    private List<Grade> grades;


    public GradeLecture(String name, int pass, List<Grade> grades, List<Integer> scores) {
        super(name, pass, scores);
        this.grades = grades;
    }
}
