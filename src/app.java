/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matricula matricula = new Matricula("Lucas","112678", "4502548054","45421941-2");
        MatriculasEfetivadas matEfet = new MatriculasEfetivadas(10);
        matEfet.add(matricula, 0);
        matEfet.add(matricula, 1);
        matEfet.add(matricula, 2);
        matEfet.add(matricula, 3);
        matEfet.add(matricula, 4);
        matEfet.add(matricula, 5);
        matEfet.add(matricula, 6);
        matEfet.add(matricula, 7);
        matEfet.add(matricula, 8);
        matEfet.add(matricula, 8);
        matEfet.add(matricula, 9);
        matEfet.add(matricula, 10);
        
        //matEfet.add(matricula, 10);
        //System.out.println(matEfet.size());
        //matEfet.remove(0);
    }
}
