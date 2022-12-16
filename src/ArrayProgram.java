import java.util.Arrays;

public class ArrayProgram
{
    public static void main(String[] args)
    {
        int arr[]={2,4,3,7,5,1};
        int temp;
        //Arrays.sort(arr);
        //System.out.println(arr[arr.length-1]);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                temp=arr[i];
                arr[j]=arr[i];
                arr[i]=arr[j];
            }
            System.out.println(arr[i]);
        }
    }
}
