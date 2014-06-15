/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

/**
 *
 * @author Equipo
 */
public class Trigonometricas extends AbstractOperador{
     
    public float operar(float op1, float op2) {
        float resultado = 0;
        if(Operador == 's')
        {
            resultado = (float) Math.sin(op1);
        }
        if(Operador == 'c')
        {
            resultado = (float) Math.cos(op1);
        }
        if(Operador == 't')
        {
            resultado = (float) Math.tan(op1);
        }
        return resultado;
     }
}
