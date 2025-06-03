public interface Authenticable {

    boolean authenticate();

    String otp();

    String passKey();
}
