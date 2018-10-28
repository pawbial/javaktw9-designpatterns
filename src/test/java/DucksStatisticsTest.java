import org.junit.Assert;
import org.junit.Test;
import pl.sdacademy.design_patterns.duck.Duck;
import pl.sdacademy.design_patterns.duck.DuckStatistics;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DucksStatisticsTest {

    @Test
    public void shoulAcceptDuckListAsParameter() {
        // Given
        List<Duck> duckList = new ArrayList<>();
        // When
        new DuckStatistics(duckList);
        // Then

    }

    @Test
    public void shouldReturnOldestDuck() {
        // Given
        Duck duck1 = mock(Duck.class);
        // When
        when(duck1.duckAge()).thenReturn(15);
        Duck oldestDuck = mock(Duck.class);
        doReturn(555).when(oldestDuck).duckAge();

        Duck duck3 = mock(Duck.class);

        doReturn(7).when(duck3).duckAge();

        List<Duck> duckList = new ArrayList<>();
        duckList.add(duck1);
        duckList.add(duck3);
        duckList.add(oldestDuck);

        DuckStatistics duckStatistics = new DuckStatistics(duckList);
        // Then


        Integer age = duckStatistics.getOldestDuckAge ();

        Assert.assertEquals((Integer) 555, age);

    }


}
