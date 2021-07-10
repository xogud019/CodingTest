package CodingTest.LeetCode.Array.Easy;

import java.util.*;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public double average(int[] salary) {
        double sum = 0;
        
        Arrays.sort(salary);
        
        for(int i=1; i<salary.length-1; i++){
            sum += salary[i];
        }
        
        return sum/(salary.length-2);
    }
}
