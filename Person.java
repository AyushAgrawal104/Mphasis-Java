class Person{


final String COUNTRY="INDIA";
int personId;
String personName;
int age;

Person(int personId,String personName,int age){
this.personId=personId;
this.personName=personName;
this.age=age;

}

void display(){
System.out.println("Country: "+COUNTRY);
System.out.println("Person Id: "+personId);
System.out.println("Person Name: "+personName);
System.out.println("Person Age: "+age);
System.out.println("-----------------------------");
}

public static void main(String[] args){

COUNTRY="US";
Person p1=new Person(10,"James",45);
Person p2=new Person(11,"Rudhira",145);
Person p3=new Person(12,"Ozvita",455);
  p1.display();
  p2.display();
  p3.display();

}




}
