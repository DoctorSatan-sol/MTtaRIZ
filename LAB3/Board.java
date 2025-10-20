public class Board {
    private int[] cell;

    public Board() {
        cell = new int[9];
    }

    public void printBoard() {
        for (int i = 0; i < cell.length; i++) {
            if (i % 3 == 0 && i != 0) System.out.println();

            char symbol = '-';
            if (cell[i] == 1) symbol = 'X';
            else if (cell[i] == 2) symbol = 'O';

            System.out.print(symbol + " ");
        }
        System.out.println();
    }

    public int getCell(int index) {
        return cell[index];
    }

    public void setCell(int index, int value) {
        cell[index] = value;
    }

    public boolean checkWin(int playerNumber) {
        int[][] winCombos = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8},
            {0, 3, 6},
            {1, 4, 7},
            {2, 5, 8},
            {0, 4, 8},
            {2, 4, 6}
        };

        for (int[] combo : winCombos) {
            if (cell[combo[0]] == playerNumber &&
                cell[combo[1]] == playerNumber &&
                cell[combo[2]] == playerNumber) {
                return true;
            }
        }
        return false;
    }
}