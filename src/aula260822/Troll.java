/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula260822;

/**
 *
 * @author 1-2021221706
 */
public class Troll extends Personagem{
    
    public void Troll(){
        comportamentoArma = new Machado();
    }
    @Override
    public void display() {
        System.out.println("Troll aqui!");
    }

    
}
