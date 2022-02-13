class Main1 {
  public static void main(String[] args) {
    int[][] arr = new int[3][4];

    System.out.println(arr[0].length);  //4 columns
    System.out.println(arr[1].length);  // || similar than before
    System.out.println(arr[2].length);  // || similar than before

    System.out.println("***************");

    arr[1] = new int[5];

    System.out.println(arr[0].length);    //4 columns
    System.out.println(arr[1].length);    //5 columns
    System.out.println(arr[2].length);    //4 columns
  }
}