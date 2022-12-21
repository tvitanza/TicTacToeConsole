import java.util.Scanner;

import static java.lang.System.exit;

public class TicTacToe {

    public static void main(String[] args) {
        char[][] state = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        show(state);

        int turn = 1;
        for (int j = 1; j < 9; ++j) {
            if (turn % 2 != 0) {        // tu peux rassembler les deux swtiches en paramétrisant 'x' et 'o' avec une variable et la condition
                Scanner scanner = new Scanner(System.in);
                System.out.println("\nA quelle position souhaitez-vous mettre le \"x\"?");
                int asnwerX = scanner.nextInt();
                switch (asnwerX) {
                    case 1 -> state[0][0] = 'x';
                    case 2 -> state[0][1] = 'x';
                    case 3 -> state[0][2] = 'x';
                    case 4 -> state[1][0] = 'x';
                    case 5 -> state[1][1] = 'x';
                    case 6 -> state[1][2] = 'x';
                    case 7 -> state[2][0] = 'x';
                    case 8 -> state[2][1] = 'x';
                    case 9 -> state[2][2] = 'x';
                    default -> System.out.println("\nChoisissez une position du tableau");
                }
                turn++;
                show(state);
                TicTacToeWin tictactoewin = new TicTacToeWin();
                tictactoewin.WinCondition(state);
            }
            if (turn % 2 == 0) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("\nA quelle position souhaitez-vous mettre le \"o\"?");
                int asnwerX = scanner.nextInt();
                switch (asnwerX) {
                    case 1 -> state[0][0] = 'o';
                    case 2 -> state[0][1] = 'o';
                    case 3 -> state[0][2] = 'o';
                    case 4 -> state[1][0] = 'o';
                    case 5 -> state[1][1] = 'o';
                    case 6 -> state[1][2] = 'o';
                    case 7 -> state[2][0] = 'o';
                    case 8 -> state[2][1] = 'o';
                    case 9 -> state[2][2] = 'o';
                    default -> System.out.println("\nChoisissez une position du tableau");
                }
                turn++;
                show(state);
                TicTacToeWin tictactoewin = new TicTacToeWin();
                tictactoewin.winCondition(state);   // camel case
            }
        }
    }

    public static void show(char[][] state) {
        for (int i = 0; i < 3; i++) {
            System.out.println("" + state[i][0] + state[i][1] + state[i][2]);
        }
    }
}
