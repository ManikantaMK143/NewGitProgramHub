
 class Test_2 extends Test_1 {
	 int a;
	 int b;
	 Test_2(int a, int b, int x, int y){
		 super(x,y);
		 this.a=a;
		 this.b=b;
		 
		 
	 }
	 public static void main(String[] args) {
		Test_2 T1 =new Test_2(1,2,3,4);
		System.out.println(T1.x);
		System.out.println(T1.y);
		System.out.println(T1.a);
		System.out.println(T1.b);
		
	}

}
