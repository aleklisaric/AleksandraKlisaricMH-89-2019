package vezbe;

import java.util.Scanner;

public class Main {
	
	//dekl i inic
	public static void prvaVezba()
	{
		//dekl
		int broj;
		
		//inic
		broj=5;
		broj=34;
		broj=59;
		
		//dekli + inic
		double decBr=55.7;
		String tekst = "prvi string";
		
		System.out.println("dec br koji imamo je: " + decBr);
		System.out.println(tekst);
		
	}

	//parni neparni br
	public static void drugaVezba()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesi broj:");
		int broj= scanner.nextInt();
		
		//operator moduo vraca ostatak pri deljenju %
		if(broj % 2 == 0)
		{
			System.out.println("Broj " + broj + " je paran");
		}
		else
		{
			System.out.println("Broj " + broj + " je neparan");
		}
		
	}
	
	//for i while
	public static void trecaVezba()
	{
		System.out.println("Unesi broj:");
		
		Scanner scanner = new Scanner(System.in);
		int broj= scanner.nextInt();
		
		for(int i=0;i<=broj;i++)
		{
			System.out.println(i);
		}
		
		
		int j = 0;
		while(j<= broj)
		{
			System.out.println(j);
			j++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//prvaVezba();
		//drugaVezba();
		trecaVezba();
	}

}
