package track;

public class Arraaymax {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Enter the elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
System.out.println("The elements are :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum element is : " + max);
    }
}