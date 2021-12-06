package io.gawish.abstractfactory;

import io.gawish.abstractfactory.futuristic.LaserSabre;
import io.gawish.abstractfactory.futuristic.Spaceship;
import io.gawish.abstractfactory.medieval.Horse;
import io.gawish.abstractfactory.medieval.Sword;
import io.gawish.abstractfactory.modern.Car;
import io.gawish.abstractfactory.modern.MachineGun;

public class Player {
    public void travel() {
        if (Runner.environmentSetting.compareTo("medieval") == 0) {
            Horse horse = new Horse();
            horse.travel();
        } else if (Runner.environmentSetting.compareTo("futuristic") == 0) {
            Spaceship spaceship = new Spaceship();
            spaceship.travel();
        } else if (Runner.environmentSetting.compareTo("modern") == 0) {
            Car car = new Car();
            car.travel();
        }
    }

    public void visit() {
        if (Runner.environmentSetting.compareTo("medieval") == 0) {
            Horse horse = new Horse();
            horse.visit();
        } else if (Runner.environmentSetting.compareTo("futuristic") == 0) {
            Spaceship spaceship = new Spaceship();
            spaceship.visit();
        } else if (Runner.environmentSetting.compareTo("modern") == 0) {
            Car car = new Car();
            car.visit();
        }
    }

    public void attack() {
        if (Runner.environmentSetting.compareTo("medieval") == 0) {
            Sword sword = new Sword();
            sword.attack();
        } else if (Runner.environmentSetting.compareTo("futuristic") == 0) {
            LaserSabre laserSabre = new LaserSabre();
            laserSabre.attack();
        } else if (Runner.environmentSetting.compareTo("modern") == 0) {
            MachineGun machineGun = new MachineGun();
            machineGun.attack();
        }
    }
}
