package Askiki3;

import java.io.*;

public class YpologismosMisthoyYpallilou {
	public static String  FillName() throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Onoma:");
		String name=br.readLine();
		return name;
	}
	public static int  FillPType() throws IOException,PayTypeException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		boolean ans=true;
		while(ans){
			try {
				System.out.print("Typos\n0-Misthotos\n1-Oromisthios\n");
				int type=Integer.parseInt(br.readLine());
				if (type<0||type>2) {
					throw new PayTypeException("Lathos eisagogi");
				}
				ans=false;
				return type;
			}catch(PayTypeException el) {
				System.out.println(el.getMessage());
				System.out.println("Press again:");
			}

		}
		return 0;
	}
	public static Misthotos createMisthotos() throws IOException, PayTypeException {
		Misthotos m1 = null;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		boolean ans=true;
		while (ans) {
			
			try {				
				System.out.println("+++++++++++");
				System.out.println("Misthotos");
				System.out.print("Akatharistos:");
				double akatharistos=Double.parseDouble(br.readLine());
				System.out.print("Kratiseis:");
				double kratiseis=Double.parseDouble(br.readLine());	
				System.out.print("Diakioute bonus?");
				boolean bonus=Boolean.parseBoolean(br.readLine());
				System.out.print("Bonus:");
				double bonus_paidion=Double.parseDouble(br.readLine());	
				ans=false;
				return new Misthotos(bonus,akatharistos,kratiseis,bonus_paidion,FillName(),FillPType());
			}catch(NumberFormatException e) {
				System.out.println(e.getMessage()+" wrong input, please try again:");
			}
		}
			return m1;
	}
	public static Oromisthios createOromisthios() throws IOException, PayTypeException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Oromisthios m1=null;
		boolean ans=true;

		while(ans) {
			try {
				System.out.print("Ores ergasias:");
				double hours=Double.parseDouble(br.readLine());
				System.out.print("Kostos/h:");
				double price=Double.parseDouble(br.readLine());
				return new Oromisthios(hours,price,FillName(),FillPType());
			}catch(NumberFormatException e) {
				System.out.println(e.getMessage()+" wrong input, please try again:");
			}
		}
			return m1;
	}
	
	public static void pritners(Employee w){
		System.out.print(w.toString());
	}

	public static void main(String []args) throws IOException, PayTypeException  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Size of array:");
		int n=Integer.parseInt(br.readLine());
		Employee[] e=new Employee[n];
		int k1=(int)(n*0.4);
		int k2=(int)(n*0.3);

		for(int i=0;i<1;i++) {
			e[i]=createMisthotos();
			
		}
		for(int i=1;i<2;i++) {
			e[i]=createMisthotos();
			
		}

		
		for (int i=0;i<n;i++) {
			
			if(e[i] instanceof Misthotos) {
				pritners(e[i]);
				try {
					((Misthotos)e[i]).Katharos_Misthotou();
				} catch (BonusException e1) {
					System.out.println(e1.getMessage());
					((Misthotos)e[i]).Katharos_Misthotou_XorisBonus();
				}
			}else if(e[i] instanceof Oromisthios) {
				pritners(e[i]);
				((Oromisthios)e[i]).Katharos_Oromisthiou();
			}
		}
	}
}