package person;


public class Main {
    public static void main(String[] args) {
        Person personaNoAttributes = new Person();

        // Exercício 04: Erro defido a quantidade de atribuitos diferente da quantidade de parametros do construtor.
        // Person personaWithAttributes = new Person("Name01", 99);

        Person personaWithAttributes = new Person("Name01", 33, "HHSgdgge");
        Person personaWithAllAttributes = new Person("Name01", 33, "HHSgdgge", 68.5, 1.73);

        // Exercício 06
        switch (personaWithAttributes.calcularIMC()) {
            case -1 -> System.out.println(personaWithAllAttributes.getName() + " Abaixo do peso");
            case 0 -> System.out.println(personaWithAllAttributes.getName() + ": Peso Saudável");
            case 1 -> System.out.println(personaWithAllAttributes.getName() + ": Soprepeso");
        }

        if (personaWithAllAttributes.ehMaiorIdade()) {
            System.out.println("Nome: " + personaWithAllAttributes.getName() + ", é maior de idade");
        } else {
            System.out.println("Nome: " + personaWithAllAttributes.getName() + ", é menor de idade");
        }

        System.out.println(personaWithAllAttributes);
    }
}
