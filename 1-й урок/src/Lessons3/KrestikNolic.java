package Lessons3;

import java.util.Scanner;
import java.util.Random;


public class KrestikNolic {

    private static final char HUMAN_DOT = 'X';
    private static final char PC_DOT = 'O';
    private static final char EMPTY_DOT = '_';

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random(); // [0;1)

    public static int fieldSizeX;
    public static int fieldSizeY;
    public static char[][] field;

    public static void initMap() {
        fieldSizeX = 5;
        fieldSizeY = 5;
        field = new char[fieldSizeY][fieldSizeX];

        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = EMPTY_DOT;
            }
        }
    }

    public static void printMap() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты через Enter: ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidCell(y, x) || !isEmptyCell(y, x)); //&& - and / || - or
        field[y][x] = HUMAN_DOT;
    }

    public static boolean isTooHuman() {

        char c = HUMAN_DOT;
        int pozX = 0;
        int pozY = 0;

        for (int xl = 0; xl < field.length;xl++) {

            for (int yl = 0; yl < field.length;yl++) {
                int lpx = xl;
                int lpy = yl;
                pozX = rezultRekursiyaX(c,xl,yl,pozX);
                pozY = rezultRekursiyaY(c, xl, yl, pozY);
                if (pozX == 2 || pozY == 2){
                    break;
                }
            }
            if (pozX == 2 || pozY == 2){
                break;
            }

        }

        if (pozX == 2 || pozY == 2){
            return true;
        }
        return false;

    }

    public static int ReturnYKoordinat() {

        char c = HUMAN_DOT;
        int pozY = 0;
        int rezultY = 0;

        for (int xl = 0; xl < field.length; xl++) {

            for (int yl = 0; yl < field.length; yl++) {

                if (field[xl][yl] == c) {
                    pozY = ++pozY;
                    if (pozY == 2) {
                        rezultY = yl;
                        break;
                    }
                }

            }
            if (pozY == 2) {
                break;
            }
        }
            return rezultY;
    }

    public static int ReturnXKoordinat() {

        char c = HUMAN_DOT;
        int pozX = 0;
        int rezultx = 0;

        for (int xl = 0; xl < field.length; xl++) {

            for (int yl = 0; yl < field.length; yl++) {

                if (field[xl][yl] == c) {
                    pozX = ++pozX;
                    if (pozX == 2) {
                        rezultx = xl;
                        break;
                    }
                }
            }
            if (pozX == 2) {
                break;
            }
        }
        return rezultx;
    }

    public static void pcTurn() {
        int x;
        int y;
        if (isTooHuman()){
            x = ReturnXKoordinat();
            y = ReturnYKoordinat();

            while (true){
                if (x>=y) {
                    do {
                        x = ++x; // 0...2
                        x =(x>4)?4:x;
                    } while (!isEmptyCell(x, y));
                        field[x][y] = PC_DOT;
                        break;
                    }else
                    {
                        do {
                            y = ++y; // 0...2
                            y =(y>4)?4:y;
                        } while (!isEmptyCell(x, y));
                        field[x][y] = PC_DOT;
                        break;
                    }
                }


        }else {
            do {
                x = RANDOM.nextInt(fieldSizeX); // 0...2
                y = RANDOM.nextInt(fieldSizeY);
            } while (!isEmptyCell(y, x));
            field[y][x] = PC_DOT;
        }
    }

    public static boolean isValidCell(int y, int x) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    public static boolean isEmptyCell(int y, int x) {
        return field[y][x] == EMPTY_DOT;
    }

    public static int rezultRekursiyaX(char c, int lpx,int lpy, int pozX) {
            if (lpx == 5){
                lpx =4;
            }
            if (field[lpx][lpy] == c){
                pozX = ++pozX;
                if (pozX<4) {
                   rezultRekursiyaX(c, ++lpx,lpy, pozX);
                }
            }else {
                if (pozX<4) {
                    pozX=0;
                }
                return pozX;
            }
        return pozX;
    }

    public static int rezultRekursiyaY(char c, int lpx,int lpy, int pozY) {
            if (lpy == 5){
                lpy = 4;
            }
            if (field[lpy][lpx] == c){
                pozY = ++pozY;
                if (pozY<4) {
                    rezultRekursiyaY(c, lpx,++lpy, pozY);
                }
            }else {
                if (pozY<4) {
                    pozY=0;
                }
                return pozY;
            }
        return pozY;
    }
    public static boolean checkWin(char c) {
        int pozX = 0;
        int pozY = 0;

        for (int xl = 0; xl < field.length;xl++) {

            for (int yl = 0; yl < field.length;yl++) {
                int lpx = xl;
                int lpy = yl;
                pozX = rezultRekursiyaX(c,xl,yl,pozX);
                pozY = rezultRekursiyaY(c,xl,yl,pozY);
                if (pozX == 4 || pozY == 4){
                    break;
                }
            }
            if (pozX == 4 || pozY == 4){
                break;
            }

        }

        if (pozX == 4 || pozY == 4){
            return true;
        }

        return false;
    }

    public static boolean isFullMap() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if(field[y][x] == EMPTY_DOT) return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(HUMAN_DOT)) {
                System.out.println("Человек выиграл!!!");
                break;
            }
            if (isFullMap()) {
                System.out.println("Ничья");
                break;
            }
            System.out.println();
            pcTurn();
            printMap();
            if (checkWin(PC_DOT)) {
                System.out.println("Компьютер выиграл!!! $(((");
                break;
            }
            if (isFullMap()) {
                System.out.println("Ничья");
                break;
            }
            System.out.println();
        }
    }

}
