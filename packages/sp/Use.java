import p1.C1; // C1
import p1.p2.C2; // C2
import p1.p2.p3.C3;// C3
 
class Use{

public static void main(String[] args){

  C1 c1=new C1();
  c1.c1_test1();

  C2 c2=new C2();
  c2.c2_test1();

  C3 c3=new C3();
  c3.c3_test1();



}

}
