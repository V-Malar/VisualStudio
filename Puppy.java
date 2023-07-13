// PUPPY VACCINATION
// *****************
import java.util.*;
public class Puppy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int no, days;
		boolean num = true;
		while (num)
		{
		System.out.println("\t\t\tPET'S VACCINATION");
		System.out.println("\t\t\t*****************");
		System.out.println("\t\tSELECT ONE OPTION");
		System.out.println("\t\t1. Labrador Retriever");
		System.out.println("\t\t2. Golden Retriever");
		System.out.println("\t\t3. German Sheperd");
		System.out.println("\t\t4. Poodle");
		System.out.print("\n\tEnter Breed Number:");
		no = sc.nextInt();
		switch (no)
		{
		case 1:
			System.out.print("\n\tEnter days:");
			days = sc.nextInt();
			System.out.println("\n\t\t\tVACCINATION");
			System.out.println("\t\t\t***********");
			if (days <= 21)
			{
				System.out.println("\n DHPP - 1st Vaccination.");
				num = false;
				break;
			}
			else if (days <= 90)
			{
				System.out.println("\n DHPP and LEPTO - 2nd Vaccination.");
				num = false;
				break;
			}
			else
			{
				System.out.println("\n Age is greater than 1.");
				System.out.println("\n Rabbies and 3rd booster of DHPP Vaccination");
				num = false;
				break;
			}
		case 2:
			System.out.print("\n Enter days:");
			days = sc.nextInt();
			System.out.println("\n\t\t\tVACCINATION");
			System.out.println("\t\t\t***********");
			if (days <= 21)
			{
				System.out.println("\n DHPP*, Bordetella - 1st Vaccination.");
				num = false;
				break;
			}
			else if (days <= 90)
			{
				System.out.println("\n DHPP, Bordetella, Leptospirosis  - 2nd Vaccination.");
				num = false;
				break;
			}
			else
			{
				System.out.println("\n Age is greater than 1.");
				System.out.println("\n DHPP, Leptospirosis, Canine Influenza**, Lyme Disease.");
				num = false;
				break;
			}
		case 3:
			System.out.print("\n Enter days:");
			days = sc.nextInt();
			System.out.println("\n\t\t\tVACCINATION");
			System.out.println("\t\t\t***********");
			if (days <= 21)
			{
				System.out.println("\n DHPP*, Bordetella.");
				num = false;
				break;
			}
			else if (days <= 90)
			{
				System.out.println("\n DHPP, Bordetella, Leptospirosis.");
				num = false;
				break;
			}
			else
			{
				System.out.println("\n Age is greater than 1.");
				System.out.println("\n DHPP, Leptospirosis, Canine Influenza**, Lyme Disease.");
				num = false;
				break;
			}
		case 4:
			System.out.print("\n Enter days:");
			days = sc.nextInt();
			System.out.println("\n\t\t\tVACCINATION");
			System.out.println("\t\t\t***********");
			if (days <= 21)
			{
				System.out.println("\n Distemper, parvovirus.");
				num = false;
				break;
			}
			else if (days <= 90)
			{
				System.out.println("\n DHPP(vaccines for distemper, adenovirus[hepatitis], parainfluenza, and parvovirus)");
				num = false;
				break;
			}
			else
			{
				System.out.println("\n Age is greater than 1.");
				System.out.println("\n DHPP, rabies");
				num = false;
				break;
			}
			default:
				System.out.println("\n Enter selected breed only.");
				num = true;
		}
		}
		
		}
	}
