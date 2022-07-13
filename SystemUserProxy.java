public class SystemUserProxy implements iSystemUser {

    private AdminUser adminUser;
    private String firstName;
    private String userName;

    public SystemUserProxy(String firstName, String userName) {
        this.firstName = firstName;
        this.userName = userName;
    }

    @Override
    public void exibirInfo() {
        if(adminUser == null) {
            adminUser = new AdminUser(firstName, userName);
        }
        adminUser.exibirInfo();
        
    }
}
    