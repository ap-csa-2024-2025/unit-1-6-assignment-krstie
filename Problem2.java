public class Problem2
{
  public static void main(String[] args)
  {
    double numOne = 17.1834;
    double numTwo = 38.3456;
    System.out.println("Two original numbers:");
    System.out.println(numOne);
    System.out.println(numTwo);
    int num1Round = (int) (numOne + 0.5);
    int num2Round = (int) (numTwo + 0.5);
    System.out.println("Answer: " + (num1Round + num2Round));
  }
}



