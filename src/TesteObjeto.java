

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brian.bzculque
 */
public class TesteObjeto {
    public static void main(String[] args) {
        VetorObjeto vetor = new VetorObjeto(5);
     
        Contato c1 = new Contato("Matgeus", "128937-123", "comedordecasadas12cm@gmail.com");
        Contato c2 = new Contato("Brian", "345645-123", "comedordecasadas18cm@gmail.com");
        Contato c3 = new Contato("Joao", "696785-123", "comedordecasadas14cm@gmail.com");
        
      
        
        try{
            vetor.adiciona(c1);
            vetor.adiciona(c2);
            vetor.adiciona(c3);
        } catch (Exception e) {
        }
        
        System.out.println("Tamanho do vetor: " + vetor.tamanaho());
    
        System.out.println(vetor);
    }
}
