class Try{

public static int search(int x[], int key)
{
    for(int i=0,i<x.length;i++)
    {
        if(x[i]==key)
        return i;

        return -1;
    }
}

public static void main(String args[])
{
    int x[] ={1,2,3,4,5};
    int key = 2;

    System.out.println("found at index:"+ search(x,key));
}

}