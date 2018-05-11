package Askiki2;

public class YpologismosMisthoyYpallilou {
	public static void pritners(Employee w){
		System.out.print(w.toString());
	}

	public static void main(String []args) throws PayTypeException  {
		
		Employee[] e=new Employee[5];
		e[0]=new Misthotos(false,2000,1000,0,"George",8);
		e[1]=new Misthotos(false,3000,1000,0,"Anna",0);
		e[2]=new Misthotos(true,2000,500,200,"Maria",2);
		e[3]=new Oromisthios(100,2.5,"Alekos",1);
		e[4]=new Oromisthios(100,2.5,"Mitsos",9);


		
		for (int i=0;i<e.length;i++) {
			
			if(e[i] instanceof Misthotos) {
				try {
					if (e[i].getPType()<0|| e[i].getPType()>2) {
						throw new PayTypeException("FALSE");
					}
					pritners(e[i]);
					((Misthotos)e[i]).Katharos_Misthotou();
				}catch(PayTypeException e1) {
					System.out.println(e1);
				}catch(BonusExcepion e2) {
					System.out.println(e2.getMessage());
					((Misthotos)e[i]).Katharos_Misthotou_XorisBonus();
				}
				System.out.println("");
			}
			if(e[i] instanceof Oromisthios) {
				try {
					if (e[i].getPType()<0|| e[i].getPType()>2) {
						throw new PayTypeException("FALSE");
					}
					pritners(e[i]);
					((Oromisthios)e[i]).Katharos_Oromisthiou();
				}catch(PayTypeException e1) {
					System.out.println(e1);
				}
			}
		}
		
	}
}
