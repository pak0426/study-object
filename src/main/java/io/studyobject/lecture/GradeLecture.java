package io.studyobject.lecture;

import java.util.List;

public class GradeLecture extends Lecture {
    private List<Grade> grades;


    public GradeLecture(int pass, String name, List<Grade> grades, List<Integer> scores) {
        super(pass, name, scores);
        this.grades = grades;
    }
}
