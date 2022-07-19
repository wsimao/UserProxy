public class SystemCredential {

    private Credential credential;
    private String username;
    private String password;

    public SystemCredential(Credential credential) {
        this.credential = credential;
        this.username = "admin";
        this.password = "2022";
    }

    public boolean check(){
        final boolean usernameAdmin = username.equals(credential.getUsername());
        final boolean passwordAdmin = password.equals(credential.getPassword());

        boolean checados = usernameAdmin && passwordAdmin;
        if(checados) {
        }
        return checados;
    }
}
