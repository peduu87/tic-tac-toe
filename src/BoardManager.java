public class BoardManager {

    public char[][] createEmptyBoard() {
        char[][] board = new char[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = ' ';
            }
        }

        return board;
    }

    public char checkBoard(char[][] board) { // Return 'X' if the X player win and 'O' if the O player win. Otherwise, if there's no win, it will return some other letter ('N').
        // Diagonal check.
        if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
            return 'X';
        }
        else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
            return 'X';
        }

        // Vertical check.
        for (int i = 0; i < board.length; i++){
            if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X') {
                return 'X';
            }
        }

        // Horizontal check.
        for (int i = 0; i < board[0].length; i++){
            if (board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X') {
                return 'X';
            }
        }

        // Diagonal check.
        if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
            return 'O';
        }
        else if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
            return 'O';
        }

        // Vertical check.
        for (int i = 0; i < board.length; i++){
            if (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O') {
                return 'O';
            }
        }

        // Horizontal check.
        for (int i = 0; i < board[0].length; i++){
            if (board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == 'O') {
                return 'O';
            }
        }

        return 'N';
    }

    public void mark(char[][] board, String sCoord, char markingSymbol) {
        int[] coord = convertCoord(sCoord);
        markingSymbol = String.valueOf(markingSymbol).toUpperCase().charAt(0);

        board[coord[0]][coord[1]] = (markingSymbol == 'X') ? 'X' : 'O';
    }

    public boolean checkCoord(String coord) {
        if (coord.length() != 2) {
            return false;
        }
        else {
            coord = coord.toUpperCase();

            if (!(coord.charAt(0) == 'A' || coord.charAt(0) == 'B' || coord.charAt(0) == 'C')) {
                return false;
            }

            try {
                Integer.parseInt(String.valueOf(coord.charAt(1)));
            }
            catch (Exception e) {
                return false;
            }
        }

        return true;
    }

    public int[] convertCoord(String sCoord) {
        int[] coord = new int[2];

        sCoord = sCoord.toUpperCase();

        coord[0] = switch(sCoord.charAt(0)) {
            case 'A' -> 0;
            case 'B' -> 1;
            default -> 2;
        };

        coord[1] = Integer.parseInt(String.valueOf(sCoord.charAt(1)));

        return coord;
    }
}
