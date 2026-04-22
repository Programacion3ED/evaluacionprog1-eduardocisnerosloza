public class UsuarioSeguroAvanzado {

    // Atributos privados correctamente definidos [cite: 23-29, 83]
    private String username;
    private String password;
    private int intentosFallidos;
    private boolean bloqueado;
    private int maxIntentos;
    private boolean accesoExitoso;

    // Constructor corregido
    public UsuarioSeguroAvanzado(String username, String password, int maxIntentos) {
        this.username = username;
        this.password = password;

        // Se inicializan los estados según las reglas [cite: 35, 36, 37]
        this.intentosFallidos = 0;
        this.bloqueado = false;
        this.accesoExitoso = false;

        // Validación de intentos en una sola línea [cite: 38]
        this.maxIntentos = (maxIntentos <= 0) ? 3 : maxIntentos;
    }

    // Métodos accesorios (están perfectos) [cite: 41-45]
    public String getUsername() { return username; }
    public int getIntentosFallidos() { return intentosFallidos; }
    public boolean isBloqueado() { return bloqueado; }
    public int getMaxIntentos() { return maxIntentos; }
    public boolean isAccesoExitoso() { return accesoExitoso; }

    // Inicio del método de negocio corregido
    public boolean autenticar(String passwordIngresada) {
        // 1. Si está bloqueado, rechazar de inmediato [cite: 50]
        if (this.isBloqueado()) {
            return false;
        }

        // Aquí seguiría tu lógica de comparación...
        return false; // Temporal para que compile
    }

    public boolean autenticar(String passwordIngresada) {
        // Si el usuario ya está bloqueado, no puede intentar entrar [cite: 50]
        if (this.bloqueado) {
            return false; [cite: 50]
        }

        // Comparamos la contraseña usando .equals() porque son Strings
        if (this.password.equals(passwordIngresada)) {
            this.intentosFallidos = 0; // Reinicia el contador si acierta [cite: 52]
            this.accesoExitoso = true; // Marca que entró al menos una vez [cite: 53]
            return true; [cite: 54]
        } else {
            this.intentosFallidos++; // Incrementa intentos si falla [cite: 56]

            // Si llega o supera el máximo, se bloquea la cuenta [cite: 57]
            if (this.intentosFallidos >= this.maxIntentos) {
                this.bloqueado = true; [cite: 57]
            }
            return false; [cite: 58]
        }
    }
}
