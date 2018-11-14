import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Question_4 {

	public static void main(String[] args) {
		
		DataInputStream ficin = null;
		DataOutputStream ficpos = null;
		DataOutputStream ficneg = null;
		
		try {
			FileInputStream f1 = new FileInputStream("temp1)");
			FileOutputStream f2 = new FileOutputStream ("temp1.pos");
			FileOutputStream f3 = new FileOutputStream ("temp1.neg");
			
			ficin = new DataInputStream(f1);
			ficpos = new DataOutputStream(f2);
			ficneg = new DataOutputStream(f3);
		}
	}

}
