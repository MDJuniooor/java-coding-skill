package comments.replace_comment_with_utility_method.solution;

import java.util.ArrayList;
import java.util.List;

//3.4
class FuelSystem {

    List<Double> tanks = new ArrayList<>();

    int getAverageTankFillingPercent() {
        double sum = 0;
        for (double tankFilling : tanks) {
            sum += tankFilling;
        }
        double averageFuel = sum / tanks.size();
        return roundToIntegerPercent(averageFuel);
    }

    static int roundToIntegerPercent(double value) {
        return Math.toIntExact(Math.round(value * 100));
    }
}
