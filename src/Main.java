/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan Rivera Villaseñor 18550367
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hijo hObj = new Hijo();
        hObj.algo();
        hObj.mensaje();
        hObj.otroMensaje();
    }
    
}
class Hijo extends Padre implements Accesorio, AlgoMas{
//No es herencia multiple, hereda de una, marca las interfaces que se le agregan
    @Override
    public void mensaje() {
        System.out.println("Hola");
    }

    @Override
    public void otroMensaje() {
        System.out.println("Que tal");
    }
    
}
class Padre{
    public void algo(){
        System.out.println("Mensaje de la clase base");
    }
}

interface Accesorio{
    public void mensaje();
}
interface AlgoMas{
    public void otroMensaje();
}