/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

/**
 *
 * @author enrique
 */
public interface Operador {
    
    public Double operar(Double op1,Double op2);
    public void setOperador(char Operador);
    
}
