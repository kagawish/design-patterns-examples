package io.gawish.abstractfactory;

import io.gawish.abstractfactory.futuristic.LaserSabre;
import io.gawish.abstractfactory.futuristic.Spaceship;
import io.gawish.abstractfactory.medieval.Horse;
import io.gawish.abstractfactory.medieval.Sword;

public class Player {
    public void travel() {
        if (Runner.environmentSetting.compareTo("medieval") == 0) {
            Horse horse = new Horse();
            horse.travel();
        } else if (Runner.environmentSetting.compareTo("futuristic") == 0) {
            Spaceship spaceship = new Spaceship();
            spaceship.travel();
        }
    }

    public void visit() {
        if (Runner.environmentSetting.compareTo("medieval") == 0) {
            Horse horse = new Horse();
            horse.visit();
        } else if (Runner.environmentSetting.compareTo("futuristic") == 0) {
            Spaceship spaceship = new Spaceship();
            spaceship.visit();
        }
    }

    public void attack() {
        if (Runner.environmentSetting.compareTo("medieval") == 0) {
            Sword sword = new Sword();
            sword.attack();
        } else if (Runner.environmentSetting.compareTo("futuristic") == 0) {
            LaserSabre laserSabre = new LaserSabre();
            laserSabre.attack();
        }
    }
}
