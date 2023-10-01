package Task5;

public class IdGenerator {
    private static Long orderIdGenerator = 0L;

    public static Long getId(){
        ++orderIdGenerator;
        return orderIdGenerator;
    }
}
