/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfazGrafica;

import calculadora.Resultado;

/**
 *
 * @author Gerson
 */
public class Calculador implements Despliegue{
    Resultado resultado = new  Resultado();
    
    @Override
    public float mostrarResultado() {
        //float r = resultado.getResultado();
        //return r;
        return 0;
    }

    @Override
    public void obtenerOperacion(float opcion1, float opcion2) {
        
    }

    @Override
    public void decomponerCadena(String op) {
        char c = op.charAt(0);
        if(c == 'S'){
            int op1 = op.charAt(4);
            resultado.setOperador('s');
            resultado.setOperando(op1);
        }
        if(c == 'C'){
           int op1 = op.charAt(4);
            resultado.setOperador('c');
            resultado.setOperando(op1);
        }
        if(c == 'T'){
            int op1 = op.charAt(4);
            resultado.setOperador('t');
            resultado.setOperando(op1);
        }
        if(c != 'S' && c != 'C' && c != 'T')
        {
            int op1 = c;
            char oper = op.charAt(1);
            int op2 = op.charAt(2);
            
            resultado.setOperando(1);
            resultado.setOperador(oper);
            resultado.setOperando(op2);
        }
        
    }

    @Override
    public String mostrarResultadoBinario() {
        return "";
    }

    @Override
    public String mostrarResultadoHexadecimal() {
        return "";
    }
    
}
