public class recursion3 {
    public static void printFib(int a, int b, int n){
        if(n==0){
            return;
        }
        int c= a+b;
        System.out.println(c);
        printFib(b, c, n-1);
    }
    public static void main(String[] args) {
        int n=7;
        printFib(0, 1, n-2);
    }
    
}
