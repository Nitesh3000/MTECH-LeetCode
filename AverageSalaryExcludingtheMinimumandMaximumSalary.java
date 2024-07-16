public class AverageSalaryExcludingtheMinimumandMaximumSalary{
    public static double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int total = 0;
        for(int sal:salary){
            if(sal<min){
                min = sal;
            }
            if(sal>max){
                max = sal;
            }
            total+=sal; 
           }
    return (double)(total - min - max)/(salary.length-2);
    }

    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        System.out.println(average(salary));
    }
}