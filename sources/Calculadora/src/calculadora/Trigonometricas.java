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
public class Trigonometricas extends AbstractOperador{



    @Override
    public Double operar(Double op1, Double op2) {
        Double resultado = 0.0;
        if(Operador == 's')
        {
            resultado = Math.sin(op1);
        }
        if(Operador == 'c')
        {
            resultado = Math.cos(op1);
        }
        if(Operador == 't')
        {
            resultado = Math.tan(op1);
        }
        return resultado;
    }
    
    @Override
    public void setOperador(char Operador) {
        this.Operador = Operador;
    }
    
    
    
}
