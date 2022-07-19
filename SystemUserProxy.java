public class SystemUserProxy implements Acess {

    private Acess user = new iSystemUser();


    @Override
    public boolean acess(Credential credential) {
        if(!acessExpired(credential)) {
        return true;
    }
    return user.acess(credential);
}

    @Override
    public boolean acessExpired(Credential credential) {
        return user.acessExpired(credential);
    }


}
    