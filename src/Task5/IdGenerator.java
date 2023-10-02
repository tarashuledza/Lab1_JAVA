package Task5;

public class IdGenerator {
    private static Long IdGenerator = 0L;

    public static Long getId(){
        ++IdGenerator;
        return IdGenerator;
    }
}
