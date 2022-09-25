package PooJava1.corrida;

public class Value {
    Persona persona;

    Type type;

    public Value(Persona persona, Type type) {
        this.persona = persona;
        this.type = type;

        System.out.println("Total: " + setValue());
    }

    private Double setValue() {
        switch (this.type) {
            case PEQUENO:
                if (persona.getAge() < 18) {
                    return 1300.0;
                } else {
                    return 1500.0;
                }
            case MEDIO:
                if (persona.getAge() < 18) {
                    return 2000.0;
                } else {
                    return 2300.0;
                }
            case AVANCADO:
                return 2800.0;
        }
        return null;
    }


}
