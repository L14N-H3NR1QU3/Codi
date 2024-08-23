/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetores2;

/**
 *
 * @author l.silva
 */
public class Vetores2 {

    public static void main(String[] args) {
        int n = 10;
        int vetor[] = new int [n];
        for(int i = 0; i < n; i++)
        {
            vetor[i] = (int)(Math.random()*10);
        }
        int sm = 0;
        for(int i = 0; i < n; i++)
        {
            sm += vetor[i];
        }
        for(int i = 0; i < n; i++)
        {
            System.out.println("-------------------");
            System.out.println("Vetor["+i+"] - "+vetor[i]);
            System.out.println("Soma = "+sm);
        }
    }
}
