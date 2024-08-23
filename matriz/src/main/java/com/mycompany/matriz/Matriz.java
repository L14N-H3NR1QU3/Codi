/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class Matriz {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int n = 2;
        int m = 4;
        String names[][] = new String [n][m];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print("Enter your name: ");
                names[i][j] = ler.next();
            }
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.println("Nome lin["+i+"] col["+j+"]: "+names[i][j]);
            }
        }
    }
}
