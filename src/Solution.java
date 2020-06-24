import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sim[]sim=new Sim[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<sim.length;i++) {
			int id =sc.nextInt();sc.nextLine() ;
			String name =sc.nextLine();
			double balance =sc.nextDouble();sc.nextLine() ;
			double rate =sc.nextDouble();sc.nextLine() ;
			String circle=sc.nextLine() ;
			sim[i]=new Sim(id,name,balance,rate,circle);
		}
		String circle1=sc.nextLine();
		String circle2=sc.nextLine();
		Sim[]result=changecircle(sim, circle1, circle2);
		for(int i=0;i<result.length;i++) {
			if(result[i]!=null) {
				System.out.println(result[i].getId()+" "+result[i].getCircle()+" "+result[i].getBalance()+" "+result[i].getName());
			}
		}
	}
	static Sim[]changecircle(Sim[]sim,String circle1,String circle2){
		Sim[]temp=new Sim[5];
		int j=0;
		for(int i=0;i<sim.length;i++) {
			if(sim[i].getCircle().equalsIgnoreCase(circle1)) {
				temp[j++]=sim[i];
				circle2=sim[i].getCircle();
				
			}
			
		}
		for(int i=0;i<j;i++) {
			for(int k=0;k<j-i-1;k++) {
				if(temp[k].getRate()<temp[k+1].getRate()) {
					Sim swap=temp[k];
					temp[k]=temp[k+1];
					temp[k+1]=swap;
				}
				
				
			}
		}
		return temp;
		
	}
}
