/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcao;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class Funcao {

    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);
        boolean inicio = true;
        while(inicio)
        {
            System.out.print("Digite um valor (Digite  -1 para sair):");
            int val = ler.nextInt();
            if(val == -1)
            {
                inicio = false;
            }
            tabuada(val);
        }
    }
    public static void tabuada(int val)
    {
        int res[] = new int [10];
        for(int i = 0; i < 10; i++)
        {
            res[i] = val * (i+1);
            System.out.println(val+" * "+(i+1)+" = "+res[i]);
        }            
    }
}
