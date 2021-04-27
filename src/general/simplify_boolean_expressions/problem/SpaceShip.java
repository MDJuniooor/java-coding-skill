package general.simplify_boolean_expressions.problem;

import general.simplify_boolean_expressions.Crew;
import general.simplify_boolean_expressions.FuelTank;
import general.simplify_boolean_expressions.Hull;
import general.simplify_boolean_expressions.Navigator;
import general.simplify_boolean_expressions.OxygenTank;


class SpaceShip {

    Crew crew;
    FuelTank fuelTank;
    Hull hull;
    Navigator navigator;
    OxygenTank oxygenTank;

    boolean willCrewSurvive() {
        return hull.holes == 0 &&
                fuelTank.fuel >= navigator.requiredFuelToEarth() &&
                oxygenTank.lastsFor(crew.size) > navigator.timeToEarth();
    }
}
