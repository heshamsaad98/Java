package array4;

public class Array4 {

    public static void main(String[] args) {
        int v[] = {10, 50, 2, 60, 9};
        sort(v);
        printArray(v);
        System.out.println(a(v));
        
    }
    
    static  int[] sort(int arr[])
    {
        int t;
        for(int j = 0; j < arr.length; j++)
        {
            for(int i = 0; i < arr.length - 1; i++)
            {
                if(arr[i] > arr[i + 1])
                {
                    t = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = t;
                }
            }
        }
        return arr;
    }
    
    static int a(int aa[])
    {
        int s = 0;
        for(int b:aa)
        {
            s += b;
        }
        return s;
    }
    
    static void printArray(int arr[])
    {
        for(int b:arr)
        {
            System.out.println(b);
        }
    }
}
