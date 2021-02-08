public class Solution {
  public int sumOfSquare(List<Integer> list) {
    if(list==null){
      return 0;
    }
    int sum=0;
    for(int i=0;i<list.size();i++){
      sum+=list.get(i)*list.get(i);
    }
    return sum;

  }
}
