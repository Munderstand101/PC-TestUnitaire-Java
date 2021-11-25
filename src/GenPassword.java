public class GenPassword {

    private String password;

    public String getPassword(){
        return this.password;
    }

    public String getNewPassword(){
        return getNewPassword(6);
    }

    public String getNewPassword(int n){
        this.password = "azertyu";
        return this.password;
    }
}