package example.project.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TestScenario {
    
    Scenario s1 = new Scenario();
    Scenario s2 = new Scenario();

    @BeforeEach
    public void init() {
        s1.roadType = "curve";
        s1.weatherCondition = "clean";
        s1.initEgoCarPos = Arrays.asList(0F, 0F);
        s1.initCarInFrontPos = Arrays.asList(0.5F, 0.5F);

        s2.roadType = "curve";
        s2.weatherCondition = "clean";
        s2.initEgoCarPos = Arrays.asList(0F, 0F);
        s2.initCarInFrontPos = Arrays.asList(0.51F, 0.51F);
    }

    @Test
    public void testEquality() {
        assertEquals(s1,s2);
    }
}
