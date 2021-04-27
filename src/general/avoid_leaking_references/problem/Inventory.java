package general.avoid_leaking_references.problem;

import java.util.ArrayList;
import java.util.List;

import general.Supply;

class Inventory {

    private final List<Supply> supplies;

    Inventory(List<Supply> supplies) {
        this.supplies = supplies;
    }

    List<Supply> getSupplies() {
        return supplies;
    }
}

class Usage {

    static void main(String[] args) {
        List<Supply> supplies = new ArrayList<>();
        Inventory inventory = new Inventory(supplies);

        inventory.getSupplies().size(); // == 0
        supplies.add(new Supply("Apple"));
        inventory.getSupplies().size(); // == 1

        inventory.getSupplies().add(new Supply("Banana"));
        inventory.getSupplies().size(); // == 2
    }
}
