package sixtydayofcoding;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        //Two sum question i will be using hashmap for this
        Scanner sc=new Scanner(System.in);//Scanner class for taking the input form thw user System.in signafies that the input in given by keyboard
        int n=sc.nextInt();//size of array
        int arr[]=new int[n];//crating an array
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();//filling inputs in the array given by user
        }
        int target=sc.nextInt();//the number to find in the array whose sum equal to adding two values of array
        HashMap<Integer,Integer>map=new HashMap<>();//creating a hashmap
        for (int i = 0; i < n; i++) {
            map.put(arr[i],i);//putting array value and index in the hashmap;
        }
        LinkedList<Integer>ll=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            int num=arr[i];//taking one by one value
            int remaning=target-num;//checking the remaning values in array after this step in map
            if(map.containsKey(remaning))
            {
                int index=map.get(remaning);
                if(i==index)
                {
                    continue;
                }
                ll.add(i);
                ll.add(index);
                break;
            }
        }
        System.out.println(ll);
    }
}
