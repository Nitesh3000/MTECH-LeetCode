public class Problem1009 {
    public int bitwiseComplement(int n) {
        int complement = 0;
        int i = 0;  
        if(n==0){
            return 1;
        } 
        while(n>0){
            if(n%2==0){
                complement+=Math.pow(2,i);
            }
            n = n/2;
            i++;
        }
         return complement;
    }
    public static void main(String[] args) {
        Problem1009 problem1009 = new Problem1009();
        System.out.println(problem1009.bitwiseComplement(10));
    }
}
