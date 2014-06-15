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
    private Boolean bandera;

    public Resultado() {
        this.respuesta = 0.0f;
        bandera = false;
    }
    
    public float getRespuesta()
    {
        return this.respuesta;
    }        
    
    public void setOperando(float op)
    {
        if(!bandera)
        {
            this.respuesta=op;
            this.bandera = true;
        }
        else
        {
            this.operando=op;
            this.bandera = false;
        }
    }
    
    public void setOperador(char c)
    {
        if(c=='+' || c=='-' || c=='*')
        {
            //Instancia Operación Basica
            //operacion = new OperacionBasica();
            //operacion.setOperando(c);
        }
        else if(c=='/')
        {
            //Instancia Operacion Division
            //operacion = new Division();
            //operacion.setOperando(c);
        }
        else if(c=='c'&& c=='s')
        {
            //Instancia Trigonometricas
            //operacion = new Trigonometricas();
            //operacion.setOperando(c);
        }
        else if(c=='t')
        {
            //instancia operacion Tangente
            //operacion = new Tangente();
            //operacion.setOperando(c);
        }
        else if (c=='=')
        {
            this.respuesta = operacion.operar(this.respuesta, this.operando);
        }
        
    }
    
    

    
    
}
