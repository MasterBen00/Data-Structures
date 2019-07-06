public class Task08
{
  public static void main(String [] args)
  {
    int [] a={12,5,6,32,43,15,3,11,35,1,9};
    int [] b=sortArray(a,0,a.length-1);
    for(int i=0;i<b.length;i++)
    {
      System.out.print(b[i]+" ");
    }
    System.out.println();    
  }
  
  public static int[] sortArray(int [] array, int start, int end)
  {
    if(start<end)
    {
      if(array[start]>array[start+1])
      {
        int temp=array[start];
        array[start]=array[start+1];
        array[start+1]=temp;
      }
      sortArray(array,start+1,end);
      sortArray(array,start,end-1);
  }
    return array;
  }
}