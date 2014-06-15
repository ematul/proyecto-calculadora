/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

/**
 *
 * @author Lòpez
 */
public class Basicas extends AbstractOperador {

    @Override
    public float operar(float op1, float op2) {
        
        float resultado = 0;
        if(Operador == '+')
        {
            resultado = op1 + op2;
        }
        if(Operador == '-')
        {
            resultado = op1 - op2;
        }
        if(Operador == '*')
        {
            resultado = op1 * op2;
        }        
        return resultado; //To change body of generated methods, choose Tools | Templates.
    }
    
}
