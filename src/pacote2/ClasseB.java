package pacote2;

import pacote3.ClasseC;

public class ClasseB {
    public void metodoB() {
        System.out.println("Método B");
        ClasseC classeC = new ClasseC();
        classeC.metodoC();
    }
}
