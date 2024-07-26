import java.util.Scanner;

public class binarysrchtarget {

    public static int bs(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s=in.nextInt();
        int[] arr=new int[s];
        int target=in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        int index = bs(arr, target);

        if (index != -1) {
            System.out.println("Target " + target + " found at index " + index);
        } else {
            System.out.println("Target " + target + " not found in the array");
        }
    }
}
