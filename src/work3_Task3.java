public class work3_Task3 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};

        int[] c = merge(a, b);

        System.out.print("Массив C: ");
        for (int num : c) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] merge(int[] a, int[] b) {
        int n = a.length;
        int[] c = new int[2 * n];
        int i = 0, j = 0, k = 0;

        while (i < n && j < n) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < n) {
            c[k++] = a[i++];
        }

        while (j < n) {
            c[k++] = b[j++];
        }

        return c;
    }
}