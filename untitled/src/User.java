
public abstract class User implements Authenticable {

    private String email;

    private String password;

    @Override
    public String otp() {
        return "";
    }

    @Override
    public String passKey() {
        return "";
    }
    @Override
    public boolean authenticate(){
      return false;
  }

    //if you want to only read then use getter while if you want to update without reading use setter
    private String getEmail() {
        return email;
//this is a getter where we are unable to update but we can read hence the reason it is private
    }

    //curly braces are used to show a block of code
    public void setEmail(String email) {
        this.email = email;
        // this 'this.email' is making reference to the line 4 code
    }

    public void setPassword(String password){
        this.password = password;

    }
    abstarct String getPermission();
}
