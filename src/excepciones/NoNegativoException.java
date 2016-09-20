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
public class NoNegativoException extends Exception{

    public NoNegativoException() {
        super("No Se Aceptan Valor Negativo");
    }
    
}
