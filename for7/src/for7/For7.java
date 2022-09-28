package for7;

public class For7 {

    public static void main(String[] args) {
        for(int r = 1; r <= 7; r++)
        {
            for(int s = 1; s <= (r - 1); s++)
            {
                System.out.print(" ");
            }
            for(int n = 1; n <= (9 - 2 * r); n++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
