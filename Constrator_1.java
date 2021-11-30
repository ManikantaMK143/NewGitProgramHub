 class Constrator_1 {
	 int a;
	 int b;
	 Constrator_1(int a){
		
		 this.a=a;
		 
		 
	 }
	 Constrator_1(int a, int b){
		 this(a);
		 this.b=b;
		 
	 }
	 public static void main(String[] args) {
		 Constrator_1 C1=new Constrator_1(1);
		 Constrator_1 C2=new Constrator_1(2,4);
		 System.out.println(C1.a);
		 System.out.println(C2.a);
		 
		 
		 
	}
	

}
