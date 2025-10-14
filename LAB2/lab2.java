class Lab2 {
    public static void main(String[] args) {
        int n = 10;
        int m = 3;
        Tree tree = new Tree(n);
        tree.draw();
        System.out.println();
        array(n, m);
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
