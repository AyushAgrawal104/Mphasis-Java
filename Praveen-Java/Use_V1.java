class Use_V1{

static public void main(String[] args){

  Product_V1 p1=new Product_V1();
  Product_V1 p2=new Product_V1();
  Product_V1 p3=new Product_V1();

  p1.setData(10,"Pen",32.45);
  p2.setData(11,"Book",59);
  p3.setData(12,"Mouse",576);

  Product_V1.display(p1);
  Product_V1.display(p2);
  Product_V1.display(p3);



}

}