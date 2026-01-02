package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    public String[][] gameBoard = {{"|1|", "|2|", "|3|"}, {"|4|","|5|", "|6|"}, {"|7|", "|8|", "|9|"}};

    public void printGameBoard() {
        for (String[] row : gameBoard) {
            System.out.println(Arrays.toString(row));
        }
    }

    public void markBoard(char player,int numberSelect){
        if (player == 'x') {
            switch (numberSelect) {
                case 1:
                    gameBoard[0][0] = "x";
                    printGameBoard();
                    break;
                case 2:
                    gameBoard[0][1] = "x";
                    printGameBoard();
                    break;
                case 3:
                    gameBoard[0][2] = "x";
                    printGameBoard();
                    break;
                case 4:
                    gameBoard[1][0] = "x";
                    printGameBoard();
                    break;
                case 5:
                    gameBoard[1][1] = "x";
                    printGameBoard();
                    break;
                case 6:
                    gameBoard[1][2] = "x";
                    printGameBoard();
                    break;
                case 7:
                    gameBoard[2][0] = "x";
                    printGameBoard();
                    break;
                case 8:
                    gameBoard[2][1] = "x";
                    printGameBoard();
                    break;
                case 9:
                    gameBoard[2][2] = "x";
                    printGameBoard();
                    break;

            }
        }else{
            switch (numberSelect) {
                case 1:
                    gameBoard[0][0] = "o";
                    printGameBoard();
                    break;
                case 2:
                    gameBoard[0][1] = "o";
                    printGameBoard();
                    break;
                case 3:
                    gameBoard[0][2] = "o";
                    printGameBoard();
                    break;
                case 4:
                    gameBoard[1][0] = "o";
                    printGameBoard();
                    break;
                case 5:
                    gameBoard[1][1] = "o";
                    printGameBoard();
                    break;
                case 6:
                    gameBoard[1][2] = "o";
                    printGameBoard();
                    break;
                case 7:
                    gameBoard[2][0] = "o";
                    printGameBoard();
                    break;
                case 8:
                    gameBoard[2][1] = "o";
                    printGameBoard();
                    break;
                case 9:
                    gameBoard[2][2] = "o";
                    printGameBoard();
                    break;

            }

        }
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your player(x or o): ");
        char firstPlayer = scanner.next().charAt(0);
        char secondPlayer = anotherPlayer(firstPlayer);

        while (true) {

            if(isArrayFull()){
                System.out.println("Draw");
                break;
            }

            if(firstPlay(firstPlayer)) {
                System.out.println("you are win(player 1)");
                break;
            }
            if(isArrayFull()){
                System.out.println("Draw");
                break;
            }

            if(secondPlay(secondPlayer)){
                System.out.println("you are win(player2)");
                break;
            }


        }
    }

    private boolean firstPlay(char firstPlayer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("your game bord like this select number(player 1)");
        printGameBoard();
        int numberSelect = scanner.nextInt();
        markBoard(firstPlayer,numberSelect);
        boolean result = checkGameLogic();
        return result;


    }

    private boolean secondPlay(char secondPlayer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("your game bord like this select number(player 2)");
        printGameBoard();
        int secondNumberSelect = scanner.nextInt();
        markBoard(secondPlayer,secondNumberSelect);
        boolean result = checkGameLogic();
        return result;

    }

    private boolean checkGameLogic() {
        if((gameBoard[0][0].equals("x") && gameBoard[0][1].equals("x") && gameBoard[0][2].equals("x")) ||
                (gameBoard[1][0].equals("x") && gameBoard[1][1].equals("x") && gameBoard[1][2].equals("x")) ||
                (gameBoard[2][0].equals("x")  && gameBoard[2][1].equals("x")  && gameBoard[2][2].equals("x")) ||
                (gameBoard[0][0].equals("x") && gameBoard[1][1].equals("x") && gameBoard[2][2].equals("x")) ||
                (gameBoard[0][2].equals("x") && gameBoard[1][1].equals("x") && gameBoard[2][0].equals("x"))||
                (gameBoard[0][0].equals("x") && gameBoard[1][0].equals("x") && gameBoard[2][0].equals("x"))||
                (gameBoard[0][1].equals("x") && gameBoard[1][1].equals("x") && gameBoard[2][1].equals("x"))||
                (gameBoard[0][2].equals("x") && gameBoard[1][2].equals("x") && gameBoard[2][2].equals("x"))){

            return true;
        } else if ((gameBoard[0][0].equals("o") && gameBoard[0][1].equals("o") && gameBoard[0][2].equals("o")) ||
                (gameBoard[1][0].equals("o") && gameBoard[1][1].equals("o") && gameBoard[1][2].equals("o")) ||
                (gameBoard[2][0].equals("o")  && gameBoard[2][1].equals("o")  && gameBoard[2][2].equals("o")) ||
                (gameBoard[0][0].equals("o") && gameBoard[1][1].equals("o") && gameBoard[2][2].equals("o")) ||
                (gameBoard[0][2].equals("o") && gameBoard[1][1].equals("o") && gameBoard[2][0].equals("o"))||
                (gameBoard[0][0].equals("o") && gameBoard[1][0].equals("o") && gameBoard[2][0].equals("o"))||
                (gameBoard[0][1].equals("o") && gameBoard[1][1].equals("o") && gameBoard[2][1].equals("o"))||
                (gameBoard[0][2].equals("o") && gameBoard[1][2].equals("o") && gameBoard[2][2].equals("o"))) {
            return true;
        }
        else {
            return false;
        }
    }

    // if array is full = draw => is Arrayfull = true => any point cant without x or y
    private boolean isArrayFull() {
        boolean result = false;
        for (String[] row : gameBoard) {
            for (String node : row) {

                if (node == "x" || node == "o") {
                    result = true;
                }
                else{
                    result = false;
                    break;
                }

            }

            if(!result){
                break;
            }
        }
        return result;

    }

    public char anotherPlayer(char player) {
        char secondPlayer;
        if (player == 'x') {
            secondPlayer = 'y';
        }else {
            secondPlayer = 'x';
        }
        return secondPlayer;
    }

        public static void main (String[]args){
            var game = new TicTacToe();
            game.playGame();
        }
    }

