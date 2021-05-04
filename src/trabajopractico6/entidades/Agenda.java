/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico6.entidades;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class Agenda {
    
    TreeMap<Long,Cliente> lista = new TreeMap<>();
    
    public void agregarCliente(long nro, Cliente cliente){
        if(lista.put(nro, cliente)== null){
            JOptionPane.showMessageDialog(null,"Se agrego correctamente");
        }else{
            JOptionPane.showMessageDialog(null,"No se pudo agregar");
        }
    }
    
    public Cliente buscarCliente(long nro){
        Set<Long> claves = lista.keySet();
        Cliente e = null;
        
        for(Long a:claves){
            if(a == nro)
                e = lista.get(a);
        }
        
        return e;
    }
    
    public List buscarTelefo(String ape){
        Set<Long> claves = lista.keySet();
        List e = new ArrayList();
        
        for(Long a:claves){
            if(lista.get(a).getApellido().equalsIgnoreCase(ape))
                e.add(a);
        }
        
        return e;
    }
    
    public List<Cliente> buscarClientes(String ciudad){
        Set<Long> claves = lista.keySet();
        List<Cliente> e = new ArrayList();
        
        for(Long a:claves){
            if(lista.get(a).getCiudad().equalsIgnoreCase(ciudad))
                e.add(lista.get(a));
        }
        
        return e;
    }
    
    public TreeMap<Long,Cliente> borrarCliente(long dni){
        Set<Long> claves = lista.keySet();
        TreeMap<Long,Cliente> e = new TreeMap<>();
        
        for(Long a:claves){
            if(lista.get(a).getDni() == dni)
                e.put(a, lista.get(a));
        }
        
        return e;
    }
}
