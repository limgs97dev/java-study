package java_start.array;

public class ArrayDi4 {

  public static void main(String[] args) {
    // 2 x 3 배열
    int[][] arr = new int[10][10];

    int i = 1;
    for (int row = 0; row < arr.length; row++) {
      for (int column = 0; column < arr[row].length; column++) {
        arr[row][column] = i;
        i++;
      }
    }

    for (int row = 0; row < arr.length; row++) {
      for (int column = 0; column < arr[row].length; column++) {
        System.out.print(arr[row][column] + " ");
      }
      System.out.println();
    }
  }

}
