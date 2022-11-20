package Generico;


    public class Personaa {
        private String nombre;
        private int edad;
        private String sexo ;
        private String direccion;

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public String getSexo() {
            return sexo;
        }

        public String getDireccion() {
            return direccion;
        }

        public Personaa (String nombre, int edad, String sexo, String direccion){
            this.nombre=nombre;
            this.edad=edad;
            this.sexo=sexo;
            this.direccion=direccion;

        }
        @Override
        public  String toString(){
            return "Nombre" + nombre+ "\nEdad:"+edad
                    +"\nSexo:"+sexo+"\nDireccion"+direccion;
        }

    }


