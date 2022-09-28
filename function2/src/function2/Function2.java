package function2;

public class Function2 {

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(power(5, 3));
    }
    
    static int fact(int n)
    {
        if (n > 1)
            return n * fact(n-1);
        else
            return 1;
        
    }
    static int power(int n, int base)
    {
        if (base >= 1)
            return n * power(n, base-1);
        else
            return 1;
        
    }
    
}
