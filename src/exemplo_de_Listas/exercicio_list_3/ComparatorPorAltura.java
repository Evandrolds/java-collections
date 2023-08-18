/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo_de_Listas.exercicio_list_3;

import java.util.Comparator;

/**
 *
 * @author Evandro
 */
public class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
       return Double.compare(p1.getAltura(), p2.getAltura());
    }
    
}
