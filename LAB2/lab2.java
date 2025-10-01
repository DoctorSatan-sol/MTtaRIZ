class Lab2 {
    public static void main(String[] args) {
        int n = 5;
        int m = 3;
        tree(n);
        System.out.println();
        array(n, m);
    }

    public static void tree(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i -1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void array(int n, int m) {
        int[][] arr = new int[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = count;
                count += 3;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
