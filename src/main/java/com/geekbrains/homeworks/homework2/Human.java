package com.geekbrains.homeworks.homework2;

public class Human implements Contestant{
    private int maxRunDistance;
    private int maxJumpDistance;

    Human() {
        this.maxRunDistance = 100;
        this.maxJumpDistance = 3;
    }

    @Override
    public boolean run(int distance) {
        if (distance >= maxRunDistance) {
            System.out.println("Дистанция " + distance + " не преодалима для " + this.toString());
            return false;
        } else {
            System.out.println(this.toString() + " успешно преодалел дистанцию в " + distance + " метров");
            return true;
        }

    }

    @Override
    public boolean jump(int height) {
        if (height >= maxJumpDistance) {
            System.out.println("Высота " + height + " не преодалима для " + this.toString());
            return false;
        } else {
            System.out.println(this.toString() + " перепрыгнул препятствие в " + height + " метров");
            return true;
        }
    }

    @Override
    public String toString() {
        return "Human";
    }
}
