import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String line;
            List<Integer> nums = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                nums.add(Integer.parseInt(line));
            }

            Collections.sort(nums);

            int median;

            if (nums.size() % 2 == 0) {
                int middle = nums.size() / 2;
                median = (nums.get(middle) + nums.get(middle - 1)) / 2;
            } else {
                median = nums.get(nums.size() / 2);
            }

            int result = 0;

            for (Integer num : nums) {
                result += Math.abs(median - num);
            }

            System.out.print(result);
        } catch (IOException e) {
            System.out.print(e);
        }
    }
}