public class factorialusingrecursion{
    public static int calcfactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_num1=calcfactorial(n-1);
        int fact_n=n*fact_num1;
        return fact_n;
    }
    public static void main(String[] args) {
        
        int result=calcfactorial(5);
        System.out.print("result is" +result);
    }
}