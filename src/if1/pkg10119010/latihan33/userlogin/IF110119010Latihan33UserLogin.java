/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini berisi program untuk mengecek status login
 */
public class IF110119010Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    
    private static String usName;
    private static String passWord;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Username = ");
        usName = scanner.next();
        System.out.print("Masukkan Password = ");
        passWord = scanner.next();
        
        User user = new User();
        user.pengecekkanLogin(usName, passWord);
    }
    
}
