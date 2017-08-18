class God{

God(){
System.out.println("God Object Created "+this.hashCode());
}

void f1(){

}

void f2(){

}
public static void main(String[] args){

 God g1=new God();
   g1.f1();
   g1.f1(); 
 God g2=new God();
   God g3=new God();
}

}