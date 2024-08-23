/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetores;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class Vetores 
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        int n = 5;
        int v[] = new int [n];
        for(int i = 0; i < n; i++)
        {
            System.out.print("Informe o numero "+(i+1)+" elemento de "+n+": ");
            v[i] = ler.nextInt();
        }
        System.out.println("\n");
        for(int i = 0; i < n; i++)
        {
            System.out.println("v["+i+"]="+v[i]);
        }
    }
}
