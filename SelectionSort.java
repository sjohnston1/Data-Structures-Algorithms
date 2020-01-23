public class SelectionSort {
  public static void main(String[] args) {

    SelectionSort ob = new SelectionSort();
    int arr[] = {6, 1, 5, 4, 2, 3};
    ob.sort(arr);

    int len = arr.length;
    for (int i = 0; i < len; i++) {
      System.out.println(arr[i]);
    }

  }

  void sort(int arr[]) {

    int len = arr.length;

    for (int i = 0; i < len; i++) {
      int min = i;

      for (int j = i + 1; j < len; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }

      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
  }
}
