package for10;

public class For10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         for(int i = 0; i < 12; i++)
        {
            for(int x = 0; x <= i; x++)
            {
                if(i == 0 || i == (12 - 1) || x == 0 || x == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
