/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfazGrafica;

/**
 *
 * @author Gerson
 */
public interface Despliegue {
    
    public double mostrarResultado();
    
    public void obtenerOperacion(float opcion1, float opcion2);
    
    public void decomponerCadena(String op);
    
    public String mostrarResultadoBinario();
    
    public String mostrarResultadoHexadecimal();
    
}
