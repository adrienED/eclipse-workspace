

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class test {
   public static void main(String[] args) throws IOException {
      InputStream is = null;
      DataInputStream dis = null;
      FileOutputStream fos = null;
      DataOutputStream dos = null;
      int[] i = {100,300,600,200,250};
   
      int somme=0;
      
      int max=0;
      int min=0;
      int nb=0;
      
      try {
         // create file output stream
         fos = new FileOutputStream("test");
           
         // create data output stream
         dos = new DataOutputStream(fos);
           
         // for each int in int buffer
         for(int j:i) {
         
            // write int to data output stream
            dos.writeInt(j);
         }
           
         // force data to the underlying file output stream
         dos.flush();
         
         // create file input stream
         is = new FileInputStream("test");
         
         // create new data input stream
         dis = new DataInputStream(is);
         
         // available stream to be read
         while(dis.available()>0) {
         
            // read four bytes from data input, return int
            int n = dis.readInt();
            
           
			if (nb == 0) {
				max = n;
				min = n;
				somme = n;
			}
			else {
				if (max<n) max = n;
				if (min>n) max = n;
				somme+=n;
			}
			n++;

            // print int
			System.out.println("max="+max);
			System.out.println("min="+min);
			System.out.println("moyenne="+(double)somme/n);
         }
         
      } catch(Exception e) {
         // if any error occurs
         e.printStackTrace();
      } finally {
         // releases all system resources from the streams
         if(is!=null)
            is.close();
         if(dis!=null)
            dis.close();
         if(fos!=null)
            fos.close();
         if(dos!=null)
            dos.close();
      }
   }
}