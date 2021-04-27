package general.avoid_collection_modification_during_iteration.solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import general.Supply;

//2.4
class Inventory {

    private List<Supply> supplies = new ArrayList<>();

    void disposeContaminatedSupplies() {
        Iterator<Supply> iterator = supplies.iterator();
        while (iterator.hasNext()){
            if(iterator.next().isContaminated()){
                iterator.remove();
            }
        }
    }
}
