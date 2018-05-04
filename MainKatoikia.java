import java.io.*;

public class MainKatoikia {

	public static Exoxikikatikia[] printBuff(Exoxikikatikia[] d) throws IOException {
		int num=d.length;
		Exoxikikatikia[] k= new Exoxikikatikia[num];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		for (int i=0;i<num;i++) {
		System.out.print("Typoste Poli:");
		String  poli=br.readLine();
		k[i].setPoli(poli);
		System.out.print("Hmeres:");
		int days=Integer.parseInt(br.readLine());
		k[i].setNrOfDays(days);
		System.out.print("Timi $/per day:");
		int price=Integer.parseInt(br.readLine());
		k[i].setTimiHmeras(price);
		System.out.println("Typos domatiou:");
		int type=Integer.parseInt(br.readLine());
		k[i].setType(type);
		}	
		return k;

	}
	

	public static void main(String [] args) throws IllegalArgumentException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Megethos pinaka: ");
		int N=Integer.parseInt(br.readLine());
		int a=(int)(N*0.4);
		int a1=(int)(N*0.3);
		Exoxikikatikia[] d= new Exoxikikatikia[N];
		
		for(int i=0;i<a;i++) {
			System.out.println("Domatio");
			d=new Domatio [a];
			printBuff(d);
			d[i]=new Domatio(d[i].getPerioxi_Poli(),d[i].getNrOfDays(),d[i].getTimiHmeras(),d[i].gettypeID());
			System.out.print(d[i].toString());
			d[i].calcEnoikio();
			System.out.println("\n");
			
		}
		for(int i=0;i<a1;i++) {
			System.out.println("Bungalow");
			d=new Bungalow [a1];
			printBuff(d);
			
			d[i]=new Domatio(d[i].getPerioxi_Poli(),d[i].getNrOfDays(),d[i].getTimiHmeras(),d[i].gettypeID());
			System.out.print(d[i].toString());
			d[i].calcEnoikio();
			System.out.println("\n");
			
		}
			
		for(int i=0;i<a1;i++) {
			System.out.println("Villa");
			d=new Villa [a1];
			printBuff(d);
			
			d[i]=new Domatio(d[i].getPerioxi_Poli(),d[i].getNrOfDays(),d[i].getTimiHmeras(),d[i].gettypeID());
			System.out.print(d[i].toString());
			d[i].calcEnoikio();
			System.out.println("\n");
			
		}

	}
}
