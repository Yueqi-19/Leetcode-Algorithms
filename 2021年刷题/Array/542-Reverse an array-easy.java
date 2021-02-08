public class Solution {
  public void reverse(int[] array) {//双指针
    for(int i=0,j=array.length-1;i<j;i++,j--){
      int temp=array[i];
      array[i]=array[j];
      array[j]=temp;
      
    }
  }
}
