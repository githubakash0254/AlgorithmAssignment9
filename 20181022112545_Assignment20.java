/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment20;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author 1794147
 */
public class Assignment20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        Random rd=new Random();
        String location="0";
        int index=0;
        System.out.println("How many elements?");
        int elemCount=sc.nextInt();
        int[] searchArray=new int[elemCount];
        System.out.println("Random numbers are:");
        for(int i=0;i<elemCount;i++)
        {
            int rdm=rd.nextInt(1000);
            searchArray[i]=rdm;
        }
        for(int i=0;i<elemCount;i++)
        {
            System.out.println(i+1+": "+searchArray[i]);
        }
        System.out.println("Which number to search?");
        int seachNumber=sc2.nextInt();
         for(int i=0;i<elemCount;i++)
        {
            if(searchArray[i]==seachNumber)
            {
                index=i+1;
                location="1";
            }
        }
         if(location.equals("1"))
         {
            System.out.println("Element found at index:"+" "+index);
         }
         else{
             System.out.println("Element not found");
         }
         System.out.println("End of this assignment");
    }
    
}
