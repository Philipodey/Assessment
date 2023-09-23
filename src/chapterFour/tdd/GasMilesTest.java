package chapterFour.tdd;

import chapterFour.main.GasMileage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GasMilesTest {




            @Test
            public void testMilesDriven() {
                int milesDrive = GasMileage.milesDrive(5);
                assertEquals(5, milesDrive);

            }

            @Test
            public void testGallonsUsed() {
                int gallonUsed = GasMileage.gallonUsed(20);
                assertEquals(20, gallonUsed);
            }

            @Test
            public void testMilesPerGallon() {
                double milesPerGallon = GasMileage.milesPerGallon(50, 10);
                assertEquals(5.00, milesPerGallon, 0.05);

            }


    }