package com.geekbrains.homeworks.homework2;

public class Wall implements Obstacle{
    private int height;

    Wall(int height) {
        this.height = height;
    }


    @Override
    public boolean contest(Contestant contestant) {
        if (contestant.jump(height)) {
            System.out.println(contestant.toString() + " перепрыгнул стену!");
            return true;
        } else {
            System.out.println(contestant.toString() + " не смог перепрыгнуть стену!");
            return false;
        }
    }
}
