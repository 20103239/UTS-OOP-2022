
package uts;

/**
 *
 * @author Ni Putu Kristina Dewi 20103239
 */
import java.util.Scanner;

public class UTS {
    
    public String[] daftar;
  
      
    public String [] getDaftar(){
        String[] returnDaftar ={};
        if (this.daftar != null){
            if(this.daftar.length > 0){
               returnDaftar =this.daftar;
            }
        } 
        return returnDaftar;
    }
    
    public String addDaftar (UTS daftar , String value){
        String array[] = new String [daftar.getDaftar().length + 1];
        int i; 
        for (i = 0; i < daftar.getDaftar().length; i++){
            array[i] = this.daftar[i];
        }
        array[i] = value;
        
        this.daftar = new String[array.length];
        for (i = 0; i < array.length; i++){
            this.daftar[i] = array[i];
        }
        return value;
        
    }
    static void aksi (UTS daftar){
        Scanner input = new Scanner (System.in);
        System.out.println("#### Daftar Pengunjung Kebun Binatang ####");
        System.out.println("1. Tampilkan Pengunjung");
        System.out.println("2. Isi Data Pengunjung");
        System.out.println("3. Keluar");
        System.out.println("##########################################");
        
        System.out.print("Pilihan menu :");
        System.out.print("");
        
        int menu  = input.nextInt ();
        
        if (menu == 1){
            if (daftar.getDaftar().length > 0){
                for (int a = 0; a<daftar.getDaftar().length;a++)
                    System.out.println(a+1 +"."+daftar.getDaftar()[a]);
                    System.out.println("");
                    System.out.println (" Total Jumlah Pengunjung :"+daftar.getDaftar().length+" pengunjung");
                    
            }else{
                    System.out.println("");
                    System.out.println("#### Daftar Pengunjung Kebun Binatang ####");
                    System.out.println("Belum ada data pengunjung");
                }          
               
       }else if (menu == 2){
            System.out.println("");
            System.out.println("Isi Data Pengunjung Kebun Binatang");
            System.out.print("Nama Pengunjung : ");
               Scanner scan = new Scanner(System.in);
               String nama = scan.nextLine();
               daftar.addDaftar(daftar,nama);
               System.out.println("");
            System.out.println("Data telah ter record");
               
        }else{
            System.out.println("");
            System.out.println("Menu tidak ditemukan"); 
        }
        System.out.println("");
        System.out.print("Enter untuk melanjutkan...");      
    }
    
    public static void main(String[] args){
        UTS daftar = new UTS ();
        aksi (daftar);
        Scanner scanner = new Scanner (System.in);
        String readString = scanner.nextLine ();
        while (readString!=null){
            if (readString.isEmpty()){
                aksi (daftar);
            }
            
            if (scanner.hasNextLine()){
                readString = scanner.nextLine();
            }else {
                readString = null;
            }
        }
    }
}
        
        
        
        
   
