class Recursion {

  public static int findSum(int num) {
    if (num == 1) {
      return 1;
    }
    else {
      return num + findSum(num - 1);
    }
  }
  
  public static void main (String[] args) {
    int number = 5;
    int result = findSum(5);

    System.out.println("The sum of the first " + number + " numbers, beginning with 1 is " + result + ".");
  }
}
