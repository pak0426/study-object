package io.studyobject.example;

public class Rectangle {
    private int left;
    private int right;
    private int getRight;
    private int bottom;

    public Rectangle(int left, int right, int getRight, int bottom) {
        this.left = left;
        this.right = right;
        this.getRight = getRight;
        this.bottom = bottom;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    public int getGetRight() {
        return getRight;
    }

    public int getBottom() {
        return bottom;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public void setGetRight(int getRight) {
        this.getRight = getRight;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }
}
