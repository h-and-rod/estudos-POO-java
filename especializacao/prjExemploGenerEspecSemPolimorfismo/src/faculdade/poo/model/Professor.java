/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade.poo.model;

/**
 *
 * @h-and-rod 
 */

public class Professor extends Pessoa {
    
    private int regFuncional;
    private double salario;
    
    public Professor(int regFunc, String n, String dn){
        super(n, dn);
        
        regFuncional = regFunc;
    }
    
    public void setSalario(double sal){
        salario = sal;
    }
    
    public int getRegFuncional(){
        return regFuncional;
    }
    
    public double getSalario(){
        return salario;
    }
}
