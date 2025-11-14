import java.security.PrivateKey;

public class Usuario {
        private String nombre;
        private String apellidos;
        private String codigopostal;
        private String direccion;
        private String email;
        private String contrasena;
        private Usuario(String nom, String ap, String codPos, String dir, String em, String con) {
            nombre = nom;
            apellidos = ap;
            codigopostal = codPos;
            direccion = dir;
            email = em;
            contrasena = con;
        }
        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public String getCodigopostal() {
            return codigopostal;
        }

        public void setCodigopostal(String codigopostal) {
            this.codigopostal = codigopostal;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String nuevoEmail) {
            this.email = email;
            if (!nuevoEmail.contains("@")){
                System.out.println("Error:email invalido falta @");
            }
        }

        public String getContrasena() {
            return contrasena;
        }

        public void setContrasena(String contrasena) {
            this.contrasena = contrasena;
        }
}
