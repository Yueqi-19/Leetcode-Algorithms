public class Solution {
  public int[] solve(int[] array) {
    if(array==null||array.length==0){
      return array;
    }
    for(int i =0;i<array.length-1;i++){//why array.length-1 
      int min = i;
      for(int j = i+1;j<array.length;j++){
        if(array[min]>array[j]){
          min=j;
        }
      }
      swap(array,i,min);

    }
    return array;
  }
  public void swap(int[] array, int left ,int right){
    int temp = array[left];
    array[left]=array[right];
    array[right]=temp;
  }
}
