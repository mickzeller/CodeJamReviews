package main.codingchallenges.google;

public class RobotMoves {

    public static void main(String[] args) {
        String moves = "udlrlrlrlrlrlrlrlrlllrrruuudddrldu";
        boolean isHome = judgeCircle(moves);
        System.out.println("isHome = " + isHome);
    }

    private static boolean judgeCircle(String moves) {

        int x = 0;
        int y = 0;

        for (char move : moves.toCharArray()) {
            if (move == 'l') {
                x--;
            }
            if (move == 'r') {
                x++;
            }
            if (move == 'u') {
                y++;
            }
            if (move == 'd') {
                y--;
            }
        }

        System.out.println("x: " + x + " y: " + y);
        return (x == 0 && y == 0);
    }


}
