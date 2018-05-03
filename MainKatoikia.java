import java.io.*;

public class MainKatoikia {

	public static void main(String [] args) throws IllegalArgumentException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Megethos pinaka: ");
		int N=Integer.parseInt(br.readLine());
		int a=(int)(N*0.4);
		int a1=(int)(N*0.3);
		
		for(int i=0;i<a;i++) {
			System.out.println("Domatio");
			Exoxikikatikia[] d=new Domatio [a];
			System.out.print("Typoste Poli:");
			String poli=br.readLine();
			System.out.print("Hmeres:");
			int days=Integer.parseInt(br.readLine());
			System.out.print("Timi $/per day:");
			int price=Integer.parseInt(br.readLine());
			System.out.println("Typos domatiou:");
			int type=Integer.parseInt(br.readLine());
			d[i]=new Domatio(poli,days,price,type);
			System.out.print(d[i].toString());
			d[i].calcEnoikio();
			System.out.println("\n");
		}
		for(int i=0;i<a1;i++) {
			System.out.println("Bungalow");
			Exoxikikatikia[] d=new Bungalow [a1];
			System.out.print("Typoste Poli:");
			String poli=br.readLine();
			System.out.print("Hmeres:");
			int days=Integer.parseInt(br.readLine());
			System.out.print("Timi $/per week:");
			int price=Integer.parseInt(br.readLine());
			System.out.println("Typos Bungalow:");
			int type=Integer.parseInt(br.readLine());
			try {
			d[i]=new Bungalow(poli,days,price,type);
			}catch(IllegalArgumentException el) {
				System.out.println(el.getMessage());
			}
			System.out.print(d[i].toString());
			d[i].calcEnoikio();
			System.out.println("\n");
			
		}
		for(int i=0;i<a1;i++) {
			System.out.println("Villa");
			Exoxikikatikia[] d=new Villa [a1];
			System.out.print("Typoste Poli:");
			String poli=br.readLine();
			System.out.print("Hmeres:");
			int days=Integer.parseInt(br.readLine());
			System.out.print("Timi $/per month:");
			int price=Integer.parseInt(br.readLine());
			System.out.println("Typos Villa:");
			int type=Integer.parseInt(br.readLine());
			d[i]=new Villa(poli,days,price,type);
			System.out.print(d[i].toString());
			d[i].calcEnoikio();
			System.out.println("\n");
		}

	}
}
