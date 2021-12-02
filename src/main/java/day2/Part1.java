package day2;

import util.InputHelper;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class Part1 {
    public static void main(String[] args) {
        try {
            List<String> lines = InputHelper.readValues(2);
            int nbSquareFeet = 0;
            for (String line : lines) {
                String[] dim = line.split("x");
                nbSquareFeet += (2 * Integer.valueOf(dim[0]) * Integer.valueOf(dim[1])) +
                        (2 * Integer.valueOf(dim[1]) * Integer.valueOf(dim[2])) +
                        (2 * Integer.valueOf(dim[2]) * Integer.valueOf(dim[0])) +
                        (Integer.valueOf(dim[0]) * Integer.valueOf(dim[1]));
            }
            System.out.println("The first response is : " + nbSquareFeet);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }
}
