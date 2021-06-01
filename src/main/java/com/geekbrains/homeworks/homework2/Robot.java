package com.geekbrains.homeworks.homework2;

public class Robot implements Contestant{
    private int maxRunDistance;
    private int maxJumpDistance;

    Robot() {
        this.maxRunDistance = 250;
        this.maxJumpDistance = 5;
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
        return "Robot";
    }
}
