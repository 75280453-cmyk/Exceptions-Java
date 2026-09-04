package POJO;

public class Cliente {
    private String nombre;
    private String documento;
    private double saldo;

    public Cliente(){
    }
    public Cliente(String nombre, String documento, double saldo){
        setNombre(nombre);
        setDocumento(documento);
        setSaldo(saldo);
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacio. ");
        }
        this.nombre = nombre;
    }

    public String getDocumento(){
        return documento;
    }
    public void setDocumento(String documento){
        if (documento == null || documento.trim().isEmpty()){
            throw new IllegalArgumentException("El RUC/DNI no puede estar vacio. ");
        }
        String docLimpio = documento.trim() ;
        if(docLimpio.length() != 8 && docLimpio.length() != 11){
            throw new IllegalArgumentException("El documento debe tener 8 dígitos (DNI) U 11 digitos (RUC)");
        }this.documento = docLimpio;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        if (saldo < 0){
            throw new IllegalArgumentException("El saldo asignado (" + saldo + ") no puede ser negativo. ");
        }
        this.saldo = saldo;
    }

    @Override
    public String toString(){
        return "Cliente{" +
                "nombre= '" + nombre + '\'' +
                ", documento= '" + documento + '\'' +
                ", saldo = S/ " + saldo +
                '}';
    }

}
