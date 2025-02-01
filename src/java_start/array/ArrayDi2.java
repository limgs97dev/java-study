package java_start.array;

public class ArrayDi2 {

  public static void main(String[] args) {
    // 2 x 3 배열
    int[][] arr = new int[][]{
      {1, 2, 3},
      {4, 5, 6}
    };

    for (int row = 0; row < 2; row++) {
      for (int column = 0; column < 3; column++) {
        System.out.print(arr[row][column] + " ");
      }
      System.out.println();
    }
  }

}
