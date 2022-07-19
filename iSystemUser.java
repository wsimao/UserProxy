import java.util.Random;

public class iSystemUser implements Acess {

    @Override
    public boolean acess(Credential credential) {
        return new SystemCredential(credential).check();
    }

    @Override
    public boolean acessExpired(Credential credential) {
        //Implementando prazo pra expirar sessão
        final Random random = new Random();
        final int nextInt = random.nextInt(2);
        return nextInt == 0;
    }


}
