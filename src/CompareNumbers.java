import java.util.Comparator;

public class CompareNumbers implements Comparator<Integer> {
  
  public int compare(Integer a, Integer b){
    return a.compareTo(b);
  }
}