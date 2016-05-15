
import javax.swing.JOptionPane;


public class Principal {
    
    public static void main (String[] args)
    {
       Estudiantes es= new Estudiantes();
       
       es.setCarrera("ciencias");
       es.setCodigo(12345);
       es.setDireccion("avenida brasil");
       es.setEdad(21);
       es.setIdentificacion("45673");
       es.setNombre("Oswaldo");
       
       JOptionPane.showMessageDialog(null,"carrera: "+es.getCarrera()+"\ncodigo: "+es.getCodigo()
               +"\ndireccion: "+es.getDireccion()+"\nedad: "+es.getEdad()+"\nidentificacion: "+es.getIdentificacion()
                       +"\nnombre: "+es.getNombre());
       
    }
            
            
    
}
