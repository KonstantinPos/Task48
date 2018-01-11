public class Main {
    public static void main(String[] args) {
        int arr[][] = new int[5][8];
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 198) - 99;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {

                if (arr[i][j] > arr[max1][max2]) {
                    max1 = i;
                    max2 = j;
                }
            }
        }
        System.out.println("Максимальное значение двухмерного массива равно " + arr[max1][max2]);
    }
}
