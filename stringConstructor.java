 class stringConstructor {
    int id,yop;
    String name;
    long phonenum;
    String collegename;
    
    stringConstructor(long phonenum, String collegename, int yop){
    	this.phonenum=phonenum;
    	this.collegename=collegename;
    	this.yop=yop;
     }
    stringConstructor(int id,String name){
    	this.id=id;
    	this.name=name;
    }
    public static void main(String[] args) {
    	stringConstructor s1=new stringConstructor(987654,"M.I.T.S",2020);
    	stringConstructor s2=new stringConstructor(301,"manikanta");
    	System.out.println(s2.id +" "+ s2.name);
    	System.out.println(s1.phonenum+" "+s1.collegename+" "+s1.yop);
    	
    	
    	
	}
    
    
    
}
