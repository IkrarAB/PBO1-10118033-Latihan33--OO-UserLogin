
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk login
 *  
 */

package pbo1.pkg10118033.latihan33;

import java.util.Scanner;

public class PBO110118033Latihan33 {
    private String usName;
    private String passWord;
    
    public static void main(String[] args) {
        User user1 = new User("RizkiAdam", "terbaikselalu");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Username = ");
        String usName = scanner.next();
        System.out.print("Masukkan Password = ");
        String passWord = scanner.next();
        user1.pengecekkanLogin(usName, passWord);
        System.out.println("(Developed By : Ikrar AB)");
    }
}