package school.lemon.changerequest.java.introduction.hw1;

public class Task3 {
    public static boolean isBetween(int a, int b, int c) {

        if((a <= b) && (c >= b))
            return true;
        else if((a >= b) && (c <= b))
            return true;
        else
            return false;
    }
}
