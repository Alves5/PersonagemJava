/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula260822;

/**
 *
 * @author 1-2021221706
 */
public class Cavaleiro extends Personagem{

    public void Cavaleiro(){
       comportamentoArma = new Arco();
    }
    
    @Override
    public void display() {
        System.out.println("Cavaleiro aqui!");
    }

   
    
}
