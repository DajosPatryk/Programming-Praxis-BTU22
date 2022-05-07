public class Subtraktion {
    public static int subtrahiere(int a, int b) {
        assert b >= 0 : "Die zweite Zahl ist Negativ"; 
        int count = b;
        int result = a;
        while (count != 0) {
            result--;
            count--;
        }
        return result;
    }

    public static int schleife2(int a, int b) {
        int result = a;
        for (int i = 0; i < b; i++) {
            result--;
        }
        return result;
    }

    public static int schleife3(int a, int b) {
        int count = b;
        int result = a;
        do {
            result--;
            count--;
        } while (count != 0);
        return result;
    }

    public static int rekursiv(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return -1 + rekursiv(a, b - 1);
        }
    }
}
