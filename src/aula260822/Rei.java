/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula260822;

/**
 *
 * @author 1-2021221706
 */
public class Rei extends Personagem{

    public void Rei(){
        comportamentoArma = new Espada();
    }
    @Override
    public void display() {
        System.out.println("Rei Aqui!");
    }

    
}
