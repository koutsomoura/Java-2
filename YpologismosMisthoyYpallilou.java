import java.io.*;

public class YpologismosMisthoyYpallilou {
	public static void FillSameAttributies(Employee o) throws IOException {
		boolean choose=false;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Onoma");
		String name=br.readLine();
		o.setEponymia(name);
		System.out.println("Type");
		while (!choose) {
			try {
				int t=Integer.parseInt(br.readLine());
				o.setPType(t);
				choose=true;
			}catch(PayTypeException e1) {
				System.out.println(e1.getMessage());
				System.out.println("3anapliktrologiste:");
				choose=false;


			}
		}

	}
	public static void FillMisthotos(Misthotos o) throws PayTypeException, IOException,NumberFormatException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
				boolean choose=true;
				while(choose){
					try {
						System.out.println("Akatharistos:");
						double akatharistos=Double.parseDouble(br.readLine());
						((Misthotos)o).setAkatharistos(akatharistos);
						System.out.println("Kratiseis");
						double kratiseis=Double.parseDouble(br.readLine());
						((Misthotos)o).setKratiseis(kratiseis);
						System.out.println("Bonus");			
						double bonus=Double.parseDouble(br.readLine());
						((Misthotos)o).setBonusPaidion(bonus);
						choose=false;
					}catch(NumberFormatException e3) {
						System.out.println(e3.getMessage());
						System.out.println("Dwsate lathos eisodo,parakalw 3anaepanalabete");
						choose=true;
					}
				}
				FillSameAttributies(o);
				
	}
	public static void FillOromisthios(Oromisthios o) throws NumberFormatException,IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		boolean choose=true;
		while(choose) {
			try {
				System.out.println("Ores ergasias:");
				double ores=Double.parseDouble(br.readLine());
				o.setOresErgasias(ores);
				System.out.println("Oromisthio:");			
				double m=Double.parseDouble(br.readLine());
				o.setOromisthio(m);
				choose=false;
			}catch(NumberFormatException e4) {
				System.out.println(e4.getMessage());
				System.out.println("Dwsate lathos eisodo,parakalw 3anaepanalabete");
				choose=true;
			}
		}
		FillSameAttributies(o);
		
	}
	

	public static void main(String [] args)throws PayTypeException,IOException {
		Employee[] e= new Employee[4];
		int c=0;
		
		for (;c<2;) {
			Misthotos m=new Misthotos(0,0,0,"",0);
			FillMisthotos(m);
			e[c]=m;
			
			if (e[c] instanceof Misthotos) {
				try {
				System.out.print(((Misthotos)e[c]).toString());
				System.out.print(((Misthotos)e[c]).getPayType());
				
					((Misthotos)e[c]).Katharos_Misthotou();
				}catch (BonusException e2) {
					System.out.println(e2.getMessage());	
				}
				c++;
			}
		for (;c<(c+2);){
			Oromisthios o= new Oromisthios(0,0,"",0);
			FillOromisthios(o);
			e[c]=o;
			if (e[c] instanceof Oromisthios) {
				System.out.print(((Oromisthios)e[c]).toString());
				System.out.print(((Oromisthios)e[c]).getPayType());
				((Oromisthios)e[c]).Katharos_Oromisthiou();
			
			}
			c++;
		}
	}
}
}