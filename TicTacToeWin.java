public class TicTacToeWin {
    public static void WinCondition(char[][] state) {
        if ((state[0][0] == 'x') && (state[0][1] == 'x') && (state[0][2] == 'x')) {
            System.out.println("\nVictoire des X".toUpperCase());
            System.exit(0);
        } else if ((state[0][0] == 'o') && (state[0][1] == 'o') && (state[0][2] == 'o')) {
            System.out.println("\nVictoiredes O".toUpperCase());
            System.exit(0);
        } else if ((state[1][0] == 'x') && (state[1][1] == 'x') && (state[1][2] == 'x')) {
            System.out.println("\nVictoire des X".toUpperCase());
            System.exit(0);
        } else if ((state[1][0] == 'o') && (state[1][1] == 'o') && (state[1][2] == 'o')) {
            System.out.println("\nVictoiredes O".toUpperCase());
            System.exit(0);
        } else if ((state[2][0] == 'x') && (state[2][1] == 'x') && (state[2][2] == 'x')) {
            System.out.println("\nVictoire des X".toUpperCase());
            System.exit(0);
        } else if ((state[2][0] == 'o') && (state[2][1] == 'o') && (state[2][2] == 'o')) {
            System.out.println("\nVictoire des O".toUpperCase());
            System.exit(0);
        } else if ((state[0][0] == 'x') && (state[1][0] == 'x') && (state[2][0] == 'x')) {
            System.out.println("\nVictoire des X".toUpperCase());
            System.exit(0);
        } else if ((state[0][0] == 'o') && (state[1][0] == 'o') && (state[2][0] == 'o')) {
            System.out.println("\nVictoire des O".toUpperCase());
            System.exit(0);
        } else if ((state[0][1] == 'x') && (state[1][1] == 'x') && (state[2][1] == 'x')) {
            System.out.println("\nVictoire des X".toUpperCase());
            System.exit(0);
        } else if ((state[0][1] == 'o') && (state[1][1] == 'o') && (state[2][1] == 'o')) {
            System.out.println("\nVictoire des O".toUpperCase());
            System.exit(0);
        } else if ((state[0][2] == 'x') && (state[1][2] == 'x') && (state[2][2] == 'x')) {
            System.out.println("\nVictoire des X".toUpperCase());
            System.exit(0);
        } else if ((state[0][2] == 'o') && (state[1][2] == 'o') && (state[2][2] == 'o')) {
            System.out.println("\nVictoire des O".toUpperCase());
            System.exit(0);
        } else if ((state[0][0] == 'x') && (state[1][1] == 'x') && (state[2][2] == 'x')) {
            System.out.println("\nVictoire des X".toUpperCase());
            System.exit(0);
        } else if ((state[0][0] == 'o') && (state[1][1] == 'o') && (state[2][2] == 'o')) {
            System.out.println("\nVictoire des O".toUpperCase());
            System.exit(0);
        } else if ((state[2][2] == 'x') && (state[1][1] == 'x') && (state[2][0] == 'x')) {
            System.out.println("\nVictoire des X".toUpperCase());
            System.exit(0);
        } else if ((state[2][2] == 'o') && (state[1][1] == 'o') && (state[2][0] == 'o')) {
            System.out.println("\nVictoire des O".toUpperCase());
            System.exit(0);
        }
    }
}