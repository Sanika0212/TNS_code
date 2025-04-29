package package1;
import java.util.Scanner;


public class Taxcalculation {
	//function to calculate tax
	public void calculatetax(DAY3 person) {
		if(person.getAge()> 65 || person.getGender().equalsIgnoreCase("female")) {
			person.setTax(0);
			System.out.println("Tax not applicable");
		}
		else {
			if(person.getIncome()<= 160000) {
				person.setTax(0);
			}
			else if(person.getIncome()>160000 && person.getIncome()<= 500000) {
				person.setTax((person.getIncome() - 160000) * 10/100);
			}
			else if(person.getIncome()>500000 && person.getIncome()<= 800000) {
				person.setTax((person.getIncome() - 500000) * 20/100 + 34000);
		    }
			else {
				person.setTax((person.getIncome() - 800000 ) * 30/100 + 94000);
			}
			
		
	}

}
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		String name;
		System.out.println("Enter Person name:");
		name=ob.next();
		System.out.println("Enter your age:");
		int age=ob.nextInt();
		System.out.println("Enter gender:");
		String gender=ob.next();
		System.out.println("Enter Income:");
		int income=ob.nextInt();
		
		DAY3 person=new DAY3();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		System.out.println(person);
		Taxcalculation calc=new Taxcalculation();
		calc.calculatetax(person);
		System.out.println("After calculation of tax:");
		System.out.println(person);
		ob.close();
		
	}
}
