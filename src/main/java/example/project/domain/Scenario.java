package example.project.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * A class defining the definition of a driving scenario, which is dependent on the domain/application.
 * This must be modified and updated with class Snapshot.
 */
public class Scenario {
    String roadType;
    String weatherCondition;
    List<Float> initEgoCarPos;  // (x, y)
    List<Float> initCarInFrontPos;  // (x, y)

    public Scenario() {
        roadType = null;
        weatherCondition = null;
        initEgoCarPos = null;
        initCarInFrontPos = null;
    }

    public Scenario(String scenarioDescription) {
        // parse scenarioDescription and save the result to the class attributes
        // not implemented
    }

    @Override
    public boolean equals(Object obj) {
        // Let's define our equality as follows:
        // (1) roadType and weatherCondition must be the same.
        // (2) If Euclidean distance between the egoCar and car-in-front is less than 0.05,
        //      then they are equal in terms of car positions.

        /*
            How to calculate Euclidean Distance
            (initEgoCarPos_x1 - initEgoCarPos_x2)^2 + (initEgoCarPos_y1 - initEgoCarPos_y2)^2

         */
        if (obj == null)
            return false;


        Scenario scenario = (Scenario) obj;

        float x1_x2 = initCarInFrontPos.get(0)-scenario.initCarInFrontPos.get(0);
        float y1_y2 = initCarInFrontPos.get(1)-scenario.initCarInFrontPos.get(1);
        double euclideanDistance = Math.sqrt((x1_x2*x1_x2) + (y1_y2*y1_y2));

        return roadType.equals(scenario.roadType)
                && weatherCondition.equals(scenario.weatherCondition)
                && euclideanDistance < 0.05;
    }


}
