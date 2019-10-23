import java.util.Arrays;

/**
 * 希尔排序
 *
 * @param <T>
 */
public class Shell<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {

        int N = nums.length;
        int h = 1;
        //数组长度
        while (h < N / 3) {
            h = 3 * h + 1; // 1, 4, 13, 40, ...
        }
        System.out.println("N的大小:" + N);
        System.out.println("h的大小:" + h);
        System.out.println("N / 3:" + N / 3);
        //4
        while (h >= 1) {
            //
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(nums[j], nums[j - h]); j -= h) {
                    System.out.println(j);
                    swap(nums, j, j - h);
                    System.out.println(Arrays.toString(nums));
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        //Integer[] nums = {3, 5, 2, 4, 1};
        Integer[] nums = {5, 11, 7, 9, 2, 3, 12, 8, 6, 1, 4, 10};
        Shell shell = new Shell();
        shell.sort(nums);
        System.out.println(nums);
    }
}