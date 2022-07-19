public class App {
    public static void main(String[] args) {

        Acess logon = new SystemUserProxy();
        final Credential checkAcesso = new Credential("admin", "2022");
        statusAcess(logon, checkAcesso);
    }
        private static void statusAcess(Acess logon, final Credential credential){
            boolean acess = logon.acess(credential);
            if(acess){
                System.out.println("Acesso ao sistema permitido! Sejam muito bem-vindo");
            }
            else{
                System.out.println("Usuário não existente. Verifique os dados e tente novamente!");
            }
        } 
}
