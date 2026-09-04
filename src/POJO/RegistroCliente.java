package POJO;

public class RegistroCliente {
    public static void main(String[] args) {
        // Datos de prueba
        String nombreEntrada = "Inversiones Lopez S.A.C.";
        String docEntrada = "20123456789"; // RUC válido (11 dígitos)
        String saldoTexto = "-150.50";     // Provocará un error de validación de negocio

        Cliente cliente = new Cliente();

        try {
            // Asignación de nombre y documento
            cliente.setNombre(nombreEntrada);
            cliente.setDocumento(docEntrada);

            // Conversión de String a decimal (double)
            double saldoParsed = Double.parseDouble(saldoTexto);

            // Asignación con validación dentro del setter
            cliente.setSaldo(saldoParsed);

            System.out.println("Cliente registrado correctamente:");
            System.out.println(cliente);

        } catch (NumberFormatException e) {
            System.out.println("Error de formato: '" + saldoTexto + "' no es un número decimal válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error de regla de negocio: " + e.getMessage());
        } finally {
            System.out.println("Proceso de actualización de cliente finalizado.");
        }
    }

}
