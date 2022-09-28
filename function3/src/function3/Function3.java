package function3;

public class Function3 {

    static double a(double ... num)
    {
        double s = 0;
        for(int i = 0; i < num.length; i++)
        {
            s += num[i];
        }
        return s;
    }
    
    public static void main(String[] args) {
        System.out.println(a(10, 20, 20, 30));
    }
    
}
