package comments.replace_comment_with_utility_method.problem;

import java.util.ArrayList;
import java.util.List;

class FuelSystem {

    List<Double> tanks = new ArrayList<>();

    int getAverageTankFillingPercent() {
        double sum = 0;
        for (double tankFilling : tanks) {
            sum += tankFilling;
        }
        double averageFuel = sum / tanks.size();
        // round to integer percent
        return Math.toIntExact(Math.round(averageFuel * 100));
    }
}

class FuelSystemAlternative {

    List<Double> tanks;

    int getAverageTankFillingPercent() {
        double sum = 0;
        for (double tankFilling : tanks) {
            sum += tankFilling;
        }
        double averageFuel = sum / tanks.size();
        int roundedToPercent = Math.toIntExact(Math.round(averageFuel * 100));
        return roundedToPercent;
    }
}