/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package excepciones;

/**
 *
 * @author llara11
 */
public class NoCeroException extends Exception{

    public NoCeroException(String message) {
        super("No Se Acepta Valor En Cero");
    }

    public NoCeroException() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
