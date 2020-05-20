package e31190416.elysha;
import java.util.Stack;
// import library stack

/**
 *
 * @author Elysha Fitriana
 */
public class E31190416ELYSHA {
    public static void main(String[] args) {
      Stack kotor = new Stack();
      //deklarasi objek Stack kotor
      Stack bersih = new Stack();
      //deklarasi objek Stack kotor
      
      for (int i=1; i<=5; i++) { // perulangan for
          kotor.push("sepatu" + i); //proses memasukkan data pada stack
      }
        System.out.println("SEBELUM DI CUCI" + "\nJumlah sepatu kotor :" + kotor.size() +"\nJumlah sepatu kotor :" +bersih.size() + "\ntumpukan sepatu bersih :");
        //menampilkan jumlah sepatu kotor
        
      for(int i=1; i<=5; i++) { //perulangan for
          System.out.println(kotor.peek());
          bersih.push(kotor.pop()); // proses pengeluaran data pada stack
      }
      System.out.println("SETELAH DI CUCI" + "\nJumlah sepatu kotor :" + kotor.size() +"\nJumlah sepatu bersih :" +bersih.size() + "\ntumpukan sepatu bersih :");
      //menampilkan jumlah sepatu bersih dan sepatu yang telah di cuci
      
      for (int i=4; i>=0; i--){
          System.out.println(bersih.elementAt(i));
      }
    }
    
}
