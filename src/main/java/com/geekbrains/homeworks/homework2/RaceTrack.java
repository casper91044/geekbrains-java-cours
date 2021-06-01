package com.geekbrains.homeworks.homework2;

public class RaceTrack implements Obstacle{
    private int length;

    public RaceTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean contest(Contestant contestant) {
        if (contestant.run(length)) {
            System.out.println(contestant.toString() + " дистанция пройдена!");
            return true;
        } else {
            System.out.println(contestant.toString() + " не смог пройти дистанцию!");
            return false;
        }
    }
}
