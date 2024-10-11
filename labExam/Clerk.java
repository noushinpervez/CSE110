package labExam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Clerk extends Person {
	String jobType; // Permanent/Contractual/Hourly
	double salary;
	
	public void addNew() {
		super.addNew();
		System.out.println("Job Type: ");
		jobType = input.next();
		System.out.println("Salary: ");
		salary = input.nextDouble();
		insert();
	}

	@Override
	public void insert() {
		try {
			BufferedOutputStream boc = new BufferedOutputStream(new FileOutputStream("tbl_clerk.bin", true));
			byte n[] = name.getBytes();
			boc.write(n);
			byte e[] = email.getBytes();
			boc.write(e);
			boc.write(phone);
			byte jT[] = jobType.getBytes();
			boc.write(jT);
			boc.write((int) salary);
			boc.flush();
			boc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void showAll() {
		try {
			BufferedInputStream bic = new BufferedInputStream(new FileInputStream("tbl_clerk.bin"));
			System.out.println("\nName\t\tEmail\t\tPhone\t\tJob Type\t\tSalary\n---------------------------------------------");
			while(bic.available() != 0) {
				char name = (char)bic.read();
				char email = (char)bic.read();
				phone = bic.read();
				char jobType = (char)bic.read();
				salary = bic.read();
				System.out.println(name+"\t\t"+email+"\t\t"+phone+"\t\t"+jobType+"\t\t"+salary);
			}
			bic.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}