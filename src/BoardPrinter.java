public class BoardPrinter {
    TerminalTextManager textManager = new TerminalTextManager();

    public void printBoard(char[][] board) {
        String[] lineLetters = {"A", "B", "C"};

        System.out.println("\n\n\n\n\n");

        textManager.printLine("    1   2   3 ", 'd');

        for (int i = 0; i < 3; i++) {
            textManager.print(lineLetters[i], 'd');
            for (int j = 0; j < 3; j++) {
                System.out.print(" | ");

                if (board[i][j] == 'X') {
                    textManager.print(String.valueOf(board[i][j]), 'b');
                }
                else {
                    textManager.print(String.valueOf(board[i][j]), 'r');
                }
            }
            System.out.println(" |");
            if (i < 2) {
                System.out.println("  -------------");
            }
        }
    }
}
