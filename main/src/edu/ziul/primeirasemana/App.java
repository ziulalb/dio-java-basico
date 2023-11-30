package edu.ziul.primeirasemana;
public class App {
    public static void main(String[] args) {
        String primNome = "Luiz";
        String segNome = "Botadas";

        String nomeCompleto = nomeCompleto(primNome, segNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primNome, String segNome){
        return "Resultado " + primNome.concat(" ").concat(segNome);
    }
}