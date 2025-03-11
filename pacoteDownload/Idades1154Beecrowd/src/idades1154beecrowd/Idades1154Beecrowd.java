/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idades1154beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class Idades1154Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int c = 0;
        int soma = 0;
        int num = 0;
        while (num >= 0){
            num = teclado.nextInt();
            if (num < 0){
                break;
            }
            soma += num;
            c++;            
        }
        double media = (double)soma/c;
        System.out.printf("%.2f\n", media);   
        
    }
    
}
