public class InsertionSort {
  public static void main(String[] args) {

    InsertionSort ob = new InsertionSort();
    int arr[] = {6, 1, 5, 4, 2, 3};
    ob.sort(arr);

    int len = arr.length;
    for (int i = 0; i < len; i++) {
      System.out.println(arr[i]);
    }
  }

  void sort(int arr[]) {

    int len = arr.length;

    for (int i = 1; i < len; i++) {

      int min = arr[i];
      int j = i - 1;

      while (j >= 0 && arr[j] > min) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }

      arr[j + 1] = min;

    }
  }
}
