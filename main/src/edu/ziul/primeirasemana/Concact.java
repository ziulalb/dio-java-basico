package edu.ziul.primeirasemana;
public class Concact {
    public static void main(String[] args) {
        String firstName = "Luiz";
        String lastName = "Botadas";

        String fullName = fullName(firstName, lastName);

        System.out.println(fullName);
    }
    public static String fullName (String firstName, String lastName){
        return "Result: " + firstName.concat(" ").concat(lastName);
    }
}