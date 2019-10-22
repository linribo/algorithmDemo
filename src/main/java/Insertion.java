/**
 * 插入排序法
 * 每次都将当前元素插入到左侧已经排序的数组中，使得插入之后左侧数组依然有序。
 * @param <T>
 */
public class Insertion<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        for (int i = 1; i < N; i++) {
            //第二个元素和第一个元素比较
            //if小于，则
            for (int j = i; j > 0 && less(nums[j], nums[j - 1]); j--) {
                System.out.println(j);
                swap(nums, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] nums = {3, 5, 2, 4, 1};
        Insertion insertion = new Insertion();
        insertion.sort(nums);
    }
}