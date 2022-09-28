package array3;

public class Array3 {

    public static void main(String[] args) {
        int v[] = {10, 50, 2, 60, 9};
        int t;
        for(int j = 0; j < v.length; j++)
        {
            for(int i = 0; i < v.length - 1; i++)
            {
                if(v[i] > v[i + 1])
                {
                    t = v[i];
                    v[i] = v[i+1];
                    v[i+1] = t;
                }
            }
        }
        for(int x : v)
        {
            System.out.println(x);
        }
    }
    
}
