public class Solution {
  public static void main(String[] args) {

  }
  public List<String> subSets(String set) {
    List<String> result = new ArrayList<String>();
    if(set == null){
      return result;
    }
    char[] arraySet = set.toCharArray();//字符串转换成字符数组,给定的字符串变换成字符的序列转换。返回的数组长度等于字符串的长度,固定搭配记住
    StringBuilder sb = new StringBuilder();//是 append和insert方法，它们被重载以接受任何类型的数据。
    //每个有效地将给定的基准转换为字符串，然后将该字符串的字符追加或插入到字符串生成器中。
    //该 append方法总是将这些字符添加到生成器的末尾。该insert方法在指定点添加字符
    helper(arraySet,sb, 0 ,result);
    return result;
  }
  private void helper(char[] set , StringBuilder sb, int index ,List<String> result){
    if(index ==set.length){
      result.add(sb.toString());
      return;
    }
    helper(set,sb,index+1,result);
    sb.append(set[index]);//吃
    helper(set,sb,index +1,result);
    sb.deleteCharAt(sb.length() -1);//吐
  }

}