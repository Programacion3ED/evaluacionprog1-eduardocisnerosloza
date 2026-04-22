public class UsuarioSeguroAvanzado {

    private String username;
    private String password;
    private int intentosFallidos;
    private boolean bloqueado;
    private int maxIntentos;
    private boolean accesoExitoso;

    public UsuarioSeguroAvanzado(String username, String password, int maxIntentos){
        this.username=username;
        this.password=password;
        this.maxIntentos=maxIntentos;
    }





}
