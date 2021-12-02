package day1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Part1 {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader(Part1.class.getClassLoader().getResource("input1").getFile());
            BufferedReader br = new BufferedReader(fr);
            int c;
            int floor = 0;
            while ((c = br.read()) != -1)
                switch ((char) c) {
                    case '(':
                        floor++;
                        break;
                    case ')':
                        floor--;
                        break;
                    default:
                        break;
                }
            System.out.println("The first response is : " + floor);
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
