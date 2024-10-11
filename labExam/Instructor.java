package labExam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Instructor extends Person {
	String department;
	boolean isVisitingInstructor;
	
	public void addNew() {
		super.addNew();
		System.out.println("Department: ");
		department = input.next();
		System.out.println("Is Visiting Instructor?: ");
		isVisitingInstructor = input.nextBoolean();
		insert();
	}

	@Override
	public void insert() {
		try {
			DataOutputStream doi = new DataOutputStream(new FileOutputStream("tbl_instructor.bin", true));
			doi.writeUTF(name);
			doi.writeUTF(email);
			doi.writeInt(phone);
			doi.writeUTF(department);
			doi.writeBoolean(isVisitingInstructor);
			doi.flush();
			doi.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void showAll() {
		try {
			DataInputStream dii = new DataInputStream(new FileInputStream("tbl_instructor.bin"));
			System.out.println("\nName\t\tEmail\t\tPhone\t\tDepartment\t\tIs Visiting Instrctor?\n---------------------------------------------");
			while(dii.available() > 0) {
				name = dii.readUTF();
				email = dii.readUTF();
				phone = dii.readInt();
				department = dii.readUTF();
				isVisitingInstructor = dii.readBoolean();
				System.out.println(name+"\t\t"+email+"\t\t"+phone+"\t\t"+department+"\t\t"+isVisitingInstructor);
			}
			dii.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}