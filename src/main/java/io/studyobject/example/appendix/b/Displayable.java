package io.studyobject.example.appendix.b;

import java.awt.*;

public interface Displayable extends GameObject {
    Point getPosition();
    void update(Graphics graphics);
}
