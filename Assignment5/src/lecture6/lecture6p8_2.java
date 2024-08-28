package lecture6;

import java.util.Arrays;


public class lecture6p8_2 
{

    public static void main(String[] args) 
    {
        int number[] = new int[8];
        for (int i = 0; i < 8; i++)
        {
            number[i] = 2 * i;
        }
//        for (int i = 0; i < 8; i++)
//        {
//            System.out.print(number[i] + "\t");
//        }
        
        System.out.println(Arrays.toString(number)); //cach 2
        
   }

}
