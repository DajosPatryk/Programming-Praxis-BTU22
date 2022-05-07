public class TicTacToeSolver {
    public static void main(String[] args) {
        char[][] win = new char[3][3];
        win[0][0] = 'o';
        win[0][1] = 'o';
        win[0][2] = 'o';
        win[1][0] = 'o';
        win[1][1] = 'x';
        win[1][2] = 'x';
        win[2][0] = 'x';
        win[2][1] = 'o';
        win[2][2] = 'o';

        char[][] loss = new char[3][3];
        loss[0][0] = 'o';
        loss[0][1] = 'x';
        loss[0][2] = 'o';
        loss[1][0] = 'o';
        loss[1][1] = 'x';
        loss[1][2] = 'x';
        loss[2][0] = 'x';
        loss[2][1] = 'o';
        loss[2][2] = 'o';

        System.out.println(hatGewonnen(win));
        System.out.println(hatGewonnen(loss));
    }

    public static boolean hatGewonnen(char[][] list) {

        //Row Check
        for (int i = 0; i < 3; i++) {
            char current = 'o';
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    current = list[i][j];
                } else if (list[i][j] != current) {
                    break;
                } else if (j == 2 && list[i][j] == current) {
                    return true;
                }
            }
        }
        //Column Check
        for (int i = 0; i < 3; i++) {
            char current = 'o';
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    current = list[j][i];
                } else if (list[j][i] != current) {
                    break;
                } else if (j == 2 && list[j][i] == current) {
                    return true;
                }
            }
        }
        
        if((list[0][0] == list[1][1]) && (list[1][1] == list[2][2])){
            return true;
        }
        else if ((list[0][2] == list[1][1]) && (list[1][1] == list[2][0])) {
            return true;
        }
        
        return false;
    }
}
