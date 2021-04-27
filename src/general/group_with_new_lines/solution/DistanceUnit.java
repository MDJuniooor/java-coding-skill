package general.group_with_new_lines.solution;

//2.6
enum DistanceUnit {

    MILES, KILOMETERS;

    static final int IDENTITY = 1;

    static final double MILE_IN_KILOMETERS = 1.60934;
    static final double KILOMETER_IN_MILES = 1 / MILE_IN_KILOMETERS;

    double getConversionRate(DistanceUnit unit) {
        if (this == unit) {
            return IDENTITY;
        }

        if (this == MILES && unit == KILOMETERS) {
            return MILE_IN_KILOMETERS;
        } else {
            return KILOMETER_IN_MILES;
        }
    }
}
