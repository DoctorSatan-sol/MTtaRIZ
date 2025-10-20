class Lab3 {
    public static void main(String[] args) {
        Board board = new Board();
        Player player1 = new Player('X', 1);
        Player player2 = new Player('O', 2);

        for (int i = 0; i < 9; i++) {
            board.printBoard();
            Player current = (i % 2 == 0) ? player1 : player2;
            int move = current.move(board);
            board.setCell(move - 1, current.getPlayerNumber());
            if (board.checkWin(current.getPlayerNumber())) {
                board.printBoard();
                System.out.println("Player " + current.getPlayerNumber() + " wins!");
                break;
            }
            if (i == 8) {
                board.printBoard();
                System.out.println("It's a draw!");
            }
        }
    }
}