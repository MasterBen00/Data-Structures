public class Task03
{
  public static void main(String [] args)
  {
   int [] a = {2,4,5,7,8,9,11,12,14,23,45,46,49,51,56,57,58,60};
  
    int index = recursiveBinarySearch(a,0,a.length,14);
    System.out.println(index);
  }
  
  public static int recursiveBinarySearch(int [] a, int left, int right, int key)
  {
   int mid=0;
   while (left<=right)
   {
     mid=(left+right)/2;
     if(key<a[mid])
     {
      right=mid-1;
       return recursiveBinarySearch(a, left, right, key);
     }
     else if (key>a[mid])
     {
       left=mid+1;
       return recursiveBinarySearch(a, left, right, key);
     }
     else {
       return mid;
     }    
   }
   return -1;
  }
}