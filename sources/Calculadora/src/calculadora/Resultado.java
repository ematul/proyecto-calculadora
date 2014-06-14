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
public class Resultado {
    
    private float respuesta;
    private float operando;
    private Operador operacion;

    public Resultado() {
        this.respuesta = 0.0f;
    }
    
    public void setOperando(float op)
    {
        this.respuesta=op;
    }
    
    public void setOperador(char c)
    {
        if(c=='+' || c=='-' || c=='*')
        {
            //Instancia Operación Basica
        }
        else if(c=='/')
        {
            //Instancia Operacion Division
        }
        else if(c=='c'&& c=='s')
        {
            //Instancia Trigonometricas
        }
        else if(c=='t')
        {
            //instancia operacion Tangente
        }
        else if (c=='=')
        {
            this.respuesta = operacion.operar(this.respuesta, this.operando);
        }
        
    }
    
    

    
    
}
