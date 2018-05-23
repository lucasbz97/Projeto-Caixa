
public class app {

    public static void main(String[] args) {

        Matricula matricula1 = new Matricula("j", "112670", "4502548054", "45421941-2");
        Matricula matricula2 = new Matricula("d", "112675", "4502548054", "45421941-2");
        Matricula matricula3 = new Matricula("k", "112674", "4502548054", "45421941-2");
        Matricula matricula4 = new Matricula("b", "112671", "4502548054", "45421941-2");
        Matricula matricula5 = new Matricula("f", "112672", "4502548054", "45421941-2");
        Matricula matricula6 = new Matricula("e", "112671", "4502548054", "45421941-2");
        Matricula matricula7 = new Matricula("b", "112672", "4502548054", "45421941-2");
        Matricula matricula8 = new Matricula("a", "112670", "4502548054", "45421941-2");
        Matricula matricula9 = new Matricula("i", "112670", "4502548054", "45421941-2");
        Matricula matricula10 = new Matricula("g", "112670", "4502548054", "45421941-2");
        Matricula matricula11 = new Matricula("c", "112670", "4502548054", "45421941-2");
        Matricula matricula12 = new Matricula("h", "112670", "4502548054", "45421941-2");
        Matricula matricula13 = new Matricula("m", "112670", "4502548054", "45421941-2");

        MatriculasEfetivadas matEfet = new MatriculasEfetivadas(10);
        matEfet.add(matricula1);
        matEfet.add(matricula2);
        matEfet.add(matricula3);
        matEfet.add(matricula4);
        matEfet.add(matricula5);
        matEfet.add(matricula6);
        matEfet.add(matricula7);
        matEfet.add(matricula8);
        matEfet.add(matricula9);
        matEfet.add(matricula10);
        matEfet.remove(3);
        matEfet.add(matricula11);
        matEfet.add(matricula12);
        matEfet.add(matricula13);
    }
}
