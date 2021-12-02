package day2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Day2_Test {

    List<String> lines = Arrays.asList("2x3x4", "1x1x10");

    @Test
    public void part1() {
        int nbSquareFeet = 0;
        for (String line : lines) {
            String[] dim = line.split("x");
            nbSquareFeet += (2 * Integer.valueOf(dim[0]) * Integer.valueOf(dim[1])) +
                    (2 * Integer.valueOf(dim[1]) * Integer.valueOf(dim[2])) +
                    (2 * Integer.valueOf(dim[2]) * Integer.valueOf(dim[0])) +
                    (Integer.valueOf(dim[0]) * Integer.valueOf(dim[1]));
        }
        Assert.assertEquals(nbSquareFeet, 101);
    }

    @Test
    public void part2() {
        int feetRibbon = 0;
        for (String line : lines) {
            String[] dim = line.split("x");
            feetRibbon += Integer.valueOf(dim[0]) + Integer.valueOf(dim[0]) + Integer.valueOf(dim[1]) + Integer.valueOf(dim[1]);
            feetRibbon += Integer.valueOf(dim[0]) * Integer.valueOf(dim[1]) * Integer.valueOf(dim[2]);
        }
        Assert.assertEquals(feetRibbon, 48);
    }
}
