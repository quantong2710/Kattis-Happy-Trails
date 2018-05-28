/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm_happytrails;

import java.util.Scanner;
/**
 *
 * @author tongd
 */
public class ACM_HappyTrails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] angles = new int[100];
        int[] distances = new int[100];
        double result = 0.0;
        Scanner sc = new Scanner(System.in);
        int scanCount;
        scanCount = sc.nextInt();
        for(int i = 0; i < scanCount; i++) {
            angles[i] = sc.nextInt();
            distances[i] = sc.nextInt();
            double ang = angles[i];
            double dist = distances[i];
            double angD = Math.toRadians(ang);
            result += dist * Math.sin(angD);
        }
        result = Math.abs(result);
        System.out.printf("%.2f", result);
        sc.close();
    }
    
}
