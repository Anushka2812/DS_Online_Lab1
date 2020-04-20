import java.util.*;
import java.lang.*;

class Occurrence
{
    public static void main(String args[])
    {
        int [] myArray= {2,5,6,4,1,2,6,7,1,3,4};
        int num=5; //let
        int [] occur=occurrences(myArray,num);
        System.out.print("Occurrence of : "+num + " --> ");
        for(int a : occur){
            if(a!=0){System.out.print(a+" ");}
        }
    }

    public static int[] occurrences(int [] array ,int number){
        int [] out =new int[array.length];
        for(int a=0; a<array.length; a++){
            if(array[a]==number){
                out[a]=a;
            }
        }
        return out;
    }
}