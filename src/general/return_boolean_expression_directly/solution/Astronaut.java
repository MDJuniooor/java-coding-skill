package general.return_boolean_expression_directly.solution;

//1.3
class Astronaut {

    String name;
    int missions;

    boolean isValid() {
        return missions >= 0 && name != null && !name.trim().isEmpty();
    }
}

class Main {
    String name = "";
    int missions = 1;

    boolean isValid() {
        // bool expression 에 명명화
        boolean isValidMissions = missions >= 0;
        boolean isValidName = name != null && !name.trim().isEmpty();
        return isValidMissions && isValidName;
    }
}
