public class Solution {
  public int min(int[] array) {
    if(array==null||array.length==0){
      return 0;
    }
	//先设最小值从index 为 0 开始
    int min =array[0];
    for (int i =1 ;i<array.length;i++){
      if (min > array[i] ){
        min = array[i];
      }
    }
    return min;
  }
}
