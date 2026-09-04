public class RegistroNota {
    public static void main(String[] args){
        String [] estudiantes = {"Quispe", "Mamani", "Torres"};
        int posicion = 2; // posicion existen (0,1,2)
        String notaTexto ="21";

        try {
            String estudiante = estudiantes[posicion];
            int nota = Integer.parseInt(notaTexto);
            if (nota < 0 || nota > 20){
                throw new IllegalArgumentException("Nota " + notaTexto + " no está dentro del rango permitido");
            }
            System.out.println("Registrado: " + estudiante + "->" + nota);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: la poscicion " + posicion + " no existe en la lista");
        }catch(NumberFormatException e){
            System.out.println("Error: " + notaTexto + "no es número entero valido. ");
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());

        } finally{
            System.out.println("Proceso de registro finalizado");
        }
    }
}
