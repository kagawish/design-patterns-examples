package io.gawish.bridge;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Companion> companions = new ArrayList<>();

    public void addCompanion(Companion companion) {
        this.companions.add(companion);
    }

    public void attack() {
        System.out.println("ORDER TO ATTACK");
        this.orderCompanionsToCharge();
        this.orderCompanionsToShoot();
    }

    public void guard() {
        System.out.println("ORDER TO FALLBACK");
        this.orderCompanionsToHide();
        this.orderCompanionsToHeal();
    }

    private void orderCompanionsToShoot() {
        for (Companion companion: this.companions) {
            companion.attack();
        }
    }

    private void orderCompanionsToCharge() {
        for (Companion companion: this.companions) {
            companion.charge();
        }
    }

    private void orderCompanionsToHeal() {
        for (Companion companion: this.companions) {
            companion.heal();
        }
    }

    private void orderCompanionsToHide() {
        for (Companion companion: this.companions) {
            companion.hide();
        }
    }
}
