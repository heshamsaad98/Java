package for4;

public class For4 {

    public static void main(String[] args) {
        for(int i = 0; i <= 8; i++)
        {
            for(int x = 0; x <= (8 - i); x++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
