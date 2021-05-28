package com.geekbrains.lesson2;

public class MainApp {

    static class Human{
        private Transport currentTransport;

        public void stop() {
            if (currentTransport != null) {
                currentTransport.stop();
                currentTransport = null;
            } else {
                System.out.println("Я никуда не еду");
            }
        }

        public void drive(Transport transport) {
            transport.start();
            this.currentTransport = transport;

        }
    }

    static class Car implements Transport{
        @Override
        public void start() {
            System.out.println("Человек начал ехать на машине");
        }

        @Override
        public void stop() {
            System.out.println("Человек остановил машину");

        }
    }

    static class Skateboard implements Transport{
        @Override
        public void start() {
            System.out.println("Человек начал ехать на борде");
        }

        @Override
        public void stop() {
            System.out.println("Человек остановил борд");

        }
    }

    static class Bicycle implements Transport{

        @Override
        public void start() {
            System.out.println("Человек начал ехать на велосипеде");
        }

        @Override
        public void stop() {
            System.out.println("Человек остановил велосипед");

        }
    }

    public static void main(String[] args) {
        Transport transport = new Car();
        Human human = new Human();
        human.stop();
        human.drive(transport);
        human.stop();
    }
}
