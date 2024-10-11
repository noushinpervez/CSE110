package labExam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Student extends Person {
	double credits;
	
	public void addNew() {
		super.addNew();
		System.out.print("Credits: ");
		credits = input.nextDouble();
		insert();
	}
	
	@Override
	public void insert() {
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("tbl_student.bin", true));
			dos.writeUTF(name);
			dos.writeUTF(email);
			dos.writeInt(phone);
			dos.writeDouble(credits);
			dos.flush();
			dos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void showAll() {
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream("tbl_student.bin"));
			System.out.println("\nName\t\tCredits\t\tEmail\t\tPhone\n---------------------------------------------");
			while(dis.available() != 0) {
				name = dis.readUTF();
				email = dis.readUTF();
				credits = dis.readDouble();
				phone = dis.readInt();
				System.out.println(name+"\t\t"+credits+"\t\t"+email+"\t\t"+phone);
			}
			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}