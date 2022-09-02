/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula260822;
public class Main{
    public static void main(String[] args) {
    Personagem rainha = new Rainha();
    rainha.display();
    rainha.usarArma();
    rainha.setComportamentoArma(new Machado());
    rainha.usarArma();
    }
    
  
    
}
