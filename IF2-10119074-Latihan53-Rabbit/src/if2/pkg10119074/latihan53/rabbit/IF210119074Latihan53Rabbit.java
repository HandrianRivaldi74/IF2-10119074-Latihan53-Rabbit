/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119074.latihan53.rabbit;

/**
 *
 * @author Acer
 * Nama  : HANDRIAN RIVALDI
 * Kelas : PBOIF2
 * NIM   : 10119074
 * Deskrifsi :
 */
public class IF210119074Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit objRabbit = new Rabbit("Peter", false, "grass", 4, "grey");

        System.out.println("Hello, His name is "+objRabbit.getName());
        System.out.println(objRabbit.getName()+" is Vegetarian? "+objRabbit.isVegetarian());
        System.out.println(objRabbit.getName()+" eats "+objRabbit.getEats());
        System.out.println(objRabbit.getName()+" has "+objRabbit.getNoOfLegs()+" legs");
        System.out.println(objRabbit.getName()+" color is "+objRabbit.getColor());
    }
    
}
