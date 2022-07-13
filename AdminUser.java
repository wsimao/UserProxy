public class AdminUser implements iSystemUser {

    private String firstName;
    private String userName;

    public AdminUser(String firstName, String userName) {
        this.firstName = firstName;
        this.userName = userName;
        loadingInfoUser(firstName, userName);
}

    @Override
    public void exibirInfo() {
        System.out.println("Primeiro Nome: " +firstName);
        System.out.println("Nome de usuário: " +userName);
        
    }

    private void loadingInfoUser(String firstName, String userName){
        System.out.println("Carregando "+firstName+ " aguarde...");
        
    }
}

