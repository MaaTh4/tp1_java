package pacote1;

import pacote2.ClasseB;

public class ClasseA {
    public void metodoA() {
        System.out.println("Método A");
        ClasseB classeB = new ClasseB();
        classeB.metodoB();
    }
}