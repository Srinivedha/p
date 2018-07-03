import java.io.*;
import java.util.*;
class interchange
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String arr[]=a.split("");
        int len=arr.length;
        for(int i=0;i<len;i++)
        {
            String temp=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;
            i++;
            
        }
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
