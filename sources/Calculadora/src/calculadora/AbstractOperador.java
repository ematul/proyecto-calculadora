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
public abstract class AbstractOperador implements Operador {

    char Operador;

    public void setOperador(char Operador) {
        this.Operador = Operador;
    }
    
    @Override
    public float operar(float op1, float op2) {
        return 0.0f;
    }
    
}
