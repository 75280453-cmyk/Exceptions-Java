package POJO;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgruparClientes {
    public static void main(String[] args){

        Map<String, List<Cliente>> clientesPorTipo = listaClientes.stream()
                .collect(Collectors.groupingBy(Cliente cliente -> {
                    int longitud =cliente.getDocumento().length();
                    if (longitud == 8){
                        return "Persona Natural (DNI)";
                    } else if (longitud==11) {
                        return "Persona Juridica (RUC)";
                    }else {
                        return "Otro/Desconocido";
                    }
                }));

    }
}
