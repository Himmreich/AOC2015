package day3;

import util.InputHelper;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Part2 {

    public static void main(String[] args) {
        try {

            Map<String, Integer> coords = new HashMap<>();

            //Point de depart
            coords.put(computeCoords(0, 0), 1);

            int xS = 0;
            int yS = 0;
            int xR = 0;
            int yR = 0;

            List<String> lines = InputHelper.readValues(3);
            for (int i = 0; i < lines.get(0).toCharArray().length; i++) {
                Character dir = lines.get(0).toCharArray()[i];
                String computedCoords;
                switch (dir) {
                    case '^':
                        if (i % 2 == 0) xS++;
                        else xR++;
                        break;
                    case 'v':
                        if (i % 2 == 0) xS--;
                        else xR--;
                        break;
                    case '<':
                        if (i % 2 == 0) yS--;
                        else yR--;
                        break;
                    case '>':
                        if (i % 2 == 0) yS++;
                        else yR++;
                        break;
                }
                if (i % 2 == 0) computedCoords = computeCoords(xR, yR);
                else computedCoords = computeCoords(xS, yS);
                if (coords.containsKey(computedCoords)) {
                    coords.put(computedCoords, coords.get(computedCoords) + 1);
                } else {
                    coords.put(computedCoords, 1);
                }
            }
            System.out.println("The first second is : " + coords.keySet().size());

        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

    public static String computeCoords(int x, int y) {
        return x + ";" + y;
    }
}
