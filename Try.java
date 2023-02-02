import java .util.*;
class Try{

public static int search(int x[], int key)
{
    for(int i=0;i<x.length;i++)
    {
        if(x[i]==key)
        return i;

        return -1;
    }
    return -1;
}

public static int binarySearch(int x[], int key)
{
    int res = Arrays.binarySearch(x,key);
    if (res>0)
        return res;

        return -1; 
}

public static void main(String args[])
{
    int x[] ={1,2,3,4,5};
    int key = 2;

Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1. for linear search");
    System.out.println("Enter 2. for Binary search");
int s = sc.nextInt();

    switch(s)
    {
        case 1: 
        System.out.println("found at index:"+ search(x,key));
        break;

        case 2 :
        System.out.println("found at index"+ binarySearch(x,key));
        break;
    }

    
}

}