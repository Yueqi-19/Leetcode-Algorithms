class Solution {
	public void partition(int[] array, int pivotIndex) {
    int pivot = array[pivotIndex];
    swap(array, pivotIndex ,array.length-1);
    int leftBound = 0 ;
    int rightBound = array.length-2;
    while(leftBound <= rightBound){
      if(array[leftBound] < pivot){
        leftBound++;
      }else{
        swap(array,leftBound,rightBound);
        rightBound --;
      }
    }
    swap(array,leftBound,array.length-1);
  }
  private void swap(int[] array, int left , int right){
    int temp = array[left];
    array[left] = array[right];
    array[right]=temp;  
  }
}