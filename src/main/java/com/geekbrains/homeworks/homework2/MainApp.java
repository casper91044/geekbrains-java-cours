package com.geekbrains.homeworks.homework2;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Obstacle> obstacles = new ArrayList<>();

        obstacles.add(new RaceTrack(50));
        obstacles.add(new Wall(2));
        obstacles.add(new RaceTrack(200));

        List<Contestant> contestants = new ArrayList<>();

        contestants.add(new Cat());
        contestants.add(new Human());
        contestants.add(new Robot());

        for (Contestant contestant: contestants) {
            for (Obstacle obstacle: obstacles) {
                if (!obstacle.contest(contestant)) break;
            }
        }
    }
}
