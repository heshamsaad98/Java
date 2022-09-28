package for6;

public class For6 {

    public static void main(String[] args) {
        for(int r = 1; r <= 4; r++)
        {
            for(int s = 1; s <= (4-r); s++)
            {
                System.out.print(" ");
            }
            for(int n = 1; n <= (2*r-1); n++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
