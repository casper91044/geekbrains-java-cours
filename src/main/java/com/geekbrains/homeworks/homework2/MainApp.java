package com.geekbrains.homeworks.homework2;

/** Практическое задание:
 1. Продолжаем работать с участниками и выполнением действий. Создайте три класса Человек,
 Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и
 прыгать, все также с выводом информации о действии в консоль.
 2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
 должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
 печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
 (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
 3. Создайте два массив: с участниками и препятствиями, и заставьте всех участников пройти
 этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
 списку он препятствий не идет. */

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
