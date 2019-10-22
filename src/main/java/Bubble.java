/**
 * 冒泡排序
 * 从左到右不断交换相邻逆序的元素，在一轮的循环之后，可以让未排序的最大元素上浮到右侧。
 * @param <T>
 */
public class Bubble<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        boolean isSorted = false;
        for (int i = N - 1; i > 0 && !isSorted; i--) {
            isSorted = true;
            //一轮交换下来，最大的值已经被交换到数组的最右端
            //并且如果isSorted还是true，证明数组已经有序，直接跳出最外层循环
            for (int j = 0; j < i; j++) {
                //第二个元素和第一个元素比较
                //if前者小于后者，则两元素交换位置,
                //否则，不作处理
                //继续第三个元素和第二个元素比较，以此类推
                if (less(nums[j + 1], nums[j])) {
                    isSorted = false;
                    swap(nums, j, j + 1);
                }
            }
        }
    }
}