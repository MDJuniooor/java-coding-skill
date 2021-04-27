package general.favor_java_api_over_diy.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import general.Supply;

//2.8
class Inventory {

    private List<Supply> supplies = new ArrayList<>();

    int getQuantity(Supply supply) {
        Objects.requireNonNull(supply, "supply must not be null");
        return Collections.frequency(supplies, supply);

    }
}
