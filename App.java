public class App {
    public static void main(String[] args) {
        iSystemUser user = new SystemUserProxy("Wallison", "wsimão");

        user.exibirInfo();
        System.out.println("");
        user.exibirInfo();

    }    
}
