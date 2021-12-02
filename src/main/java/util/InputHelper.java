package util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class InputHelper {

    public static List<String> readValues(int number) throws IOException, URISyntaxException {
        Path path = Paths.get(InputHelper.class.getClassLoader()
                .getResource("input" + number).toURI());
        return Files.readAllLines(path);
    }
}
