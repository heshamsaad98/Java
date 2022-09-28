package for1;

public class For1 {

    public static void main(String[] args) {
     for(int i = 1; i <= 12; i++)
     {
         for(int x = 1; x <= 12; x++)
         {
             System.out.print(i + "*" + x + "=" + (i * x) + " ");
         }
         System.out.println();
         for(int x = 1; x <= 12; x++)
         {
             System.out.print("*");
         }
         System.out.println();
     }
    }
    
}
