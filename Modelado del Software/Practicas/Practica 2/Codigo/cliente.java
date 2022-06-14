public class Cliente
{
    public static void main(String argv[])
    {
        Unidad matias = new profesor("Matias");
        Unidad isabel = new profesor("Isabel");
        Unidad carol = new jefe_departamento("Carol", null);
        Unidad javier = new jefe_departamento("Javier", "A trabajar");

        System.out.println(matias.imparte());              // Matias ->

        carol.establecerMando();
        System.out.println(matias.imparte());               // Matias -> Carol

        isabel.establecerMando(matias);
        System.out.println(isabel.establecerMando());       // isabel ->  Matias ->  Carol
    }


    // La clase asignatura representa la clase abstracta manejadora de la cadena de responsabilidad.
    // El servicio delegado en la cadena es la solicitud de un traductor al profesor.

    public abstract class Unidad
    {
        // En el constructor, ademas de un nombre para la asignatura, se inicializa la referencia
        // que implementa la cadena de responsabilidad (_profesor) : en principio no hay sucesor

        public Unidad(String nombre)
        {
            _mando = null;
            _nombre = nombre;
        }

        public String toString() { return _nombre; }

        // Cambia el mando de una unidad (modifica cadena de responsabilidad)

        public void establecerMando(Unidad mando) { _mando = mando; }

        // Comportamiento por defecto de la cadena: delegar en el mando directo o, si se
        // alcanza el final de la cadena, utilizar una resolución por defecto (sin orden)

        public String orden()
        {
            return (_mando != null ? _mando.imparte() : "(Sin imparte)");
        }

        private Unidad _mando;
        private String _nombre;


    }
    // La clase jefe_departamento modifica ligeramente el comportamiento por defecto de la cadena de 
    // responsabilidad: si el jefe_departamento tiene un imparte específica, utiliza ésta para resolver
    // el servicio. Si no tiene una orden específica (_imparte==null), emplea el comportamiento
    // convencional de las unidades

    public class jefe_departamento extends Unidad
    {
        // inicializa la parte de unidad e iniliciliza el estado propio del jefe_departamento (_imparte)

        public jefe_departamento(String nombre, String imparte)
        {
            super(nombre);
            _imparte = imparte;
        }

    // Refinamiento del servicio que utiliza la cadena de responsabilidad, resolviendo
    // localmente si tiene órdenes especificas o comportándose convencionalmente en
    // caso contrario

    public String orden() { return (_imparte != null ? _imparte : super.imparte()); }

    public String toString() { return ("Jefe_departamento " + super.toString()); }

    private String _orden;
    }


    public class profesor extends Unidad
    {
        // El contructor sólo tiene que inicializar la parte correspondiente a la superclase

        public profesor(String nombre)
        {
            super(nombre);
        }

        public String toString() { return ("Profesor " + super.toString()); }
    }
}