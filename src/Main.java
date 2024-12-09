import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String appVersion = "0.1";

        Scanner sc = new Scanner(System.in);
        BoardManager boardManager = new BoardManager();
        TerminalTextManager textManager = new TerminalTextManager();

        textManager.printLine("Welcome to Peduu's\n", 'b');
        textManager.printLine("ooooooooooooo  o8o                        .                                   .                       ", 'b');
        textManager.printLine("8'   888   `8  `\"'                      .o8                                 .o8                       ", 'b');
        textManager.printLine("     888      oooo   .ooooo.          .o888oo  .oooo.    .ooooo.          .o888oo  .ooooo.   .ooooo.  ", 'b');
        textManager.printLine("     888      `888  d88' `\"Y8           888   `P  )88b  d88' `\"Y8           888   d88' `88b d88' `88b ", 'b');
        textManager.printLine("     888       888  888       8888888   888    .oP\"888  888       8888888   888   888   888 888ooo888 ", 'b');
        textManager.printLine("     888       888  888   .o8           888 . d8(  888  888   .o8           888 . 888   888 888    .o ", 'b');
        textManager.printLine("    o888o     o888o `Y8bod8P'           \"888\" `Y888\"\"8o `Y8bod8P'           \"888\" `Y8bod8P' `Y8bod8P' ", 'b');
        System.out.println("\nVersion " + appVersion + "\n\n\n");
        textManager.printLine("Press [ENTER] to start...", 'd');
        System.in.read();


    }
}