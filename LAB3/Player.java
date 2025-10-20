import java.util.Scanner;

public class Player {
    private static final Scanner scanner = new Scanner(System.in);
    private char symbol;
    private int playerNumber;

    public Player(char symbol, int playerNumber) {
        this.symbol = symbol;
        this.playerNumber = playerNumber;
    }

    public int move(Board board) {
        int position;
        while (true) {
            System.out.print("Player " + playerNumber + " (" + symbol + "), input cell (1-9): ");
            position = scanner.nextInt();
            if (position < 1 || position > 9) {
                System.out.println("Invalid input! Please enter a number from 1 to 9.");
                continue;
            }
            if (board.getCell(position - 1) != 0) {
                System.out.println("Cell is already occupied! Choose another one.");
                continue;
            }
            break;
        }
        return position;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }
}