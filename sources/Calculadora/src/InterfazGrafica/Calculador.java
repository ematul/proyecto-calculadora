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
    public double mostrarResultado() {
        double r = resultado.getRespuesta();
        return r;
    }

    @Override
    public void obtenerOperacion(float opcion1, float opcion2) {
        
    }

    @Override
    public void decomponerCadena(String op) {
        char c = op.charAt(0);
        char c2 = op.charAt(1);
        if(c == 'S'){
            double op1 = op.charAt(4);
            resultado.setOperando(op1);
            resultado.setOperador('s');
            resultado.setOperador('=');
        }
        else
        if(c == 'C'){
            double op1 = op.charAt(4);
            resultado.setOperador('c');
            resultado.setOperando(op1);
            resultado.setOperador('=');
        }
        else
        if(c == 'T'){
            double op1 = op.charAt(4);
            resultado.setOperador('t');
            resultado.setOperando(op1);
            resultado.setOperador('=');
        }
        else
        if(c != 'S' && c != 'C' && c != 'T' && c2 != '=')
        {
            double op1 = c;
            char oper = op.charAt(1);
            double op2 = op.charAt(2);
            resultado.setOperando(op1);
            resultado.setOperador(oper);
            resultado.setOperando(op2);
            resultado.setOperador('=');
        }
        else
        if(c != 'S' && c != 'C' && c != 'T' && c2 == '='){
           double op1 = c;
           char q = c2;
           resultado.setOperando(op1);
           resultado.setOperador(q);
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
