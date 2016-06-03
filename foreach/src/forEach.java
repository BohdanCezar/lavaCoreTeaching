/**
 * Created by Богдан on 6/3/2016.
 */
public class forEach {
    public static void main(String [] args)
    {
        float arr[] = new float[10];
        for (int i = 0; i < 10; i++)
            arr[i] = i;

        for(float x : arr)
            System.out.println(x);
    }
}