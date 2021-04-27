package general.simplify_boolean_expressions.solution;

import general.simplify_boolean_expressions.Crew;
import general.simplify_boolean_expressions.FuelTank;
import general.simplify_boolean_expressions.Hull;
import general.simplify_boolean_expressions.Navigator;
import general.simplify_boolean_expressions.OxygenTank;

//1.4
class SpaceShip {

    Crew crew;
    FuelTank fuelTank;
    Hull hull;
    Navigator navigator;
    OxygenTank oxygenTank;

    boolean willCrewSurvive() {
        boolean hasEnoughResources = hasEnoughFuel() && hasEnoughOxygen();
        return hull.isIntact() && hasEnoughResources;
    }

    private boolean hasEnoughOxygen() {
        return oxygenTank.lastsFor(crew.size) > navigator.timeToEarth();
    }

    private boolean hasEnoughFuel() {
        return fuelTank.fuel >= navigator.requiredFuelToEarth();
    }
}
