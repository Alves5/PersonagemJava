/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula260822;

public abstract class Personagem {
    
    ComportamentoArma comportamentoArma;
    
    
    public void Personagem(){};
    public abstract void display();
    
    public void usarArma(){
        comportamentoArma.usarArma();
    };
    public void setComportamentoArma(ComportamentoArma ca){
        this.comportamentoArma = ca;
    }

}
