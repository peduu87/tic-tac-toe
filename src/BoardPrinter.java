public class BoardPrinter {
    TerminalTextManager textManager = new TerminalTextManager();

    public void printBoard(char[][] board) {
        String[] lineLetters = {"A", "B", "C"};

        System.out.println("\n\n\n\n\n");

        textManager.printLine("   1   2   3 ", 'd');

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

            }
        }
    }
}
