/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;
import excepciones.*;

/**
 *
 * @author llara11
 */
public class Manillas {
    private String material;
    private String dije;
    private String tipo;
    private long valor;

    public Manillas(String material, String dije, String tipo, long valor) throws NoCeroException, NoNegativoException {
        if(valor==0){
            throw new NoCeroException();
        }
        if (valor<0){
            throw  new NoNegativoException();
        }
        this.material = material;
        this.dije = dije;
        this.tipo = tipo;
        this.valor = valor;
    }

    public Manillas(String material, String dije, String tipo) {
        this.material = material;
        this.dije = dije;
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDije() {
        return dije;
    }

    public void setDije(String dije) {
        this.dije = dije;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) throws NoCeroException {
        if(valor==0){
            throw new NoCeroException();
        }
        this.valor = valor;
    }

    public long Valor_Peso() throws NoCeroException{
        long aux;
        aux=this.getValor()*3100;
        this.setValor(aux);
        return aux;
    }
    
    public String Mostrar(){
        String aux;
        aux= "Material : "+ this.getMaterial()+"\n"
                + "Dije : "+this.getDije()+"\n"
                + "Tipo : "+this.getTipo()+"\n"
                + "Valor Total En Pesos : "+this.getValor()+"\n\n";
        return aux;
    }
    
    
    
}
