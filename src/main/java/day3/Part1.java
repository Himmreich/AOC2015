package day3;

import util.InputHelper;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Part1 {

    public static void main(String[] args) {
        try {

            Map<String, Integer> coords = new HashMap<>();

            //Point de depart
            coords.put(computeCoords(0, 0), 1);

            int x = 0;
            int y = 0;
            List<String> lines = InputHelper.readValues(3);
            for (Character dir : lines.get(0).toCharArray()) {
                switch (dir) {
                    case '^':
                        x++;
                        break;
                    case 'v':
                        x--;
                        break;
                    case '<':
                        y--;
                        break;
                    case '>':
                        y++;
                        break;
                }
                String computedCoords = computeCoords(x, y);
                if (coords.containsKey(computedCoords)) {
                    coords.put(computedCoords, coords.get(computedCoords) + 1);
                } else {
                    coords.put(computedCoords, 1);
                }
            }
            System.out.println("The first response is : " + coords.keySet().size());
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

    public static String computeCoords(int x, int y) {
        return x + ";" + y;
    }
}
