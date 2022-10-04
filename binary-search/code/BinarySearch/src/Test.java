import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        List<List<Integer>> ans = generate(5);
        System.out.println(ans);
    }

    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>(numRows);

        for (int i = 0; i < numRows; i++) {
            List<Integer> answer = new ArrayList<Integer>(i+1);
            if (i == 0) {
                answer.add(1);
                triangle.add(answer);
                continue;
            }
            answer.add(1);
            answer.add(i, 1);

            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    // ans[i][j] = 1;
                    continue;
                } else {
                    // int sum = ans[i-1][j-1] + ans[i-1][j];
                    int sum = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                    answer.add(j, sum);
                }
            }
            triangle.add(answer);
        }

        return triangle;
    }
}
