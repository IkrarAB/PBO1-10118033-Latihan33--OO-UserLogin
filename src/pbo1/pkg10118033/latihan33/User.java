package pbo1.pkg10118033.latihan33;

public class User {
    final private String username;
    final private String password;
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword){
        if(this.username.equals(parUserName)&& this.password.equals(parPassword)){
            return true;
        }
        return false;
    }
    
    private void hasilLogin(boolean status, String parPassWord){
        if(status){
            System.out.println("\n*****HALLO "+username.toUpperCase()+"*****");
            System.out.println("Selamat Datang di Aplikasi ini");
            
        } else 
            System.out.println("\nOops, Username atau Password anda salah");
    }
    
    public void pengecekkanLogin(String parUserName, String parPassword){
        statusAkun = cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun,parUserName);
    }
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
}
