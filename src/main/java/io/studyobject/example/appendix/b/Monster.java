package io.studyobject.example.appendix.b;

public class Monster implements Collidable {
    @Override
    public boolean CollideWith(Collidable other) {
        return false;
    }

    @Override
    public Point getPosition() {
        return null;
    }

    @Override
    public void update(Graphics graphics) {

    }

    @Override
    public String getName() {
        return "";
    }
}
