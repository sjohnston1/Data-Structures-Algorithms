public class BubbleSort {
  public static void main(String[] args) {

    BubbleSort ob = new BubbleSort();
    int arr[] = {6, 1, 5, 4, 2, 3};
    int len = arr.length;

    ob.bubbleSort(arr);

    for (int i = 0; i < len; i++) {
      System.out.println(arr[i]);
    }
  }

  void bubbleSort(int arr[]) {

    int len = arr.length;

    for (int i = 0; i < len - 1; i++) {
      for (int j = 0; j < len - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

  }
}
