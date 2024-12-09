public class TerminalTextManager {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_GRAY = "\u001b[30;1m";

    public void printLine(String str, char colorChar) {
        String color = switch (colorChar) {
            case 'w' -> ANSI_WHITE;
            case 'r' -> ANSI_RED;
            case 'g' -> ANSI_GREEN;
            case 'y' -> ANSI_YELLOW;
            case 'b' -> ANSI_BLUE;
            case 'p' -> ANSI_PURPLE;
            case 'c' -> ANSI_CYAN;
            case 'd' -> ANSI_GRAY;
            default -> ANSI_BLACK;
        };

        System.out.println(color + str + ANSI_RESET);
    }

    public void print(String str, char colorChar) {
        String color = switch (colorChar) {
            case 'w' -> ANSI_WHITE;
            case 'r' -> ANSI_RED;
            case 'g' -> ANSI_GREEN;
            case 'y' -> ANSI_YELLOW;
            case 'b' -> ANSI_BLUE;
            case 'p' -> ANSI_PURPLE;
            case 'c' -> ANSI_CYAN;
            case 'd' -> ANSI_GRAY;
            default -> ANSI_BLACK;
        };

        System.out.print(color + str + ANSI_RESET);
    }
}
