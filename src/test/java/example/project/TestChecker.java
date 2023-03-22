package example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

import example.project.domain.Scenario;
import org.junit.jupiter.api.Test;

public class TestChecker {

    @Test
    public void testCheckCollisionViolations()
    {

        // setup
        Simulator simulator = mock();
        Scenario scenario = new Scenario();
        Checker checker = mock();
        when(checker.checkCollisionViolations(scenario)).thenReturn(false);

        // testing target
        boolean isCollision = checker.checkCollisionViolations(scenario); // this invokes a null pointer exception due to the dummy simulator
        assertEquals(false, isCollision);
        verify(checker, times(1)).checkCollisionViolations(scenario); // verify if ads.predict(scenario) has been called only once
    }

}