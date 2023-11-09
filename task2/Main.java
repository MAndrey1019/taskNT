import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            BufferedReader br1 = new BufferedReader(new FileReader(args[1]));

            String line, line1;
            List<String> circle = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                circle.add(line);
            }

            List<String> dots = new ArrayList<>();
            while ((line1 = br1.readLine()) != null) {
                dots.add(line1);
            }

            String tempStr = circle.get(0);
            String[] circleCenterStrArr = tempStr.split(" ");
            float[] circleCenter = new float[2];

            // center of the circle
            for (int i = 0; i < circleCenterStrArr.length; i++) {
                circleCenter[i] = Float.parseFloat(circleCenterStrArr[i]);
            }

            // radius
            float radius = Float.parseFloat(circle.get(1));

            // center of the circle coordinates
            float x0 = circleCenter[0];
            float y0 = circleCenter[1];

            for (String tempStr2 : dots) {
                String[] dotsStrArr = tempStr2.split(" ");
                float x1 = Float.parseFloat(dotsStrArr[0]);
                float y1 = Float.parseFloat(dotsStrArr[1]);

                float dx = Math.abs(x0 - x1);
                float dy = Math.abs(y0 - y1);

                double delta = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));

                if (delta == radius) {
                    // on the line
                    System.out.println("0");
                } else if (delta < radius) {
                    // inside the circle
                    System.out.println("1");
                } else {
                    // outside the circle
                    System.out.println("2");
                }
            }
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}