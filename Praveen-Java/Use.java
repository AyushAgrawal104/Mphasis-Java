class Use{

static public void main(String[] args){

  Product p1=new Product();
  Product p2=new Product();
  Product p3=new Product();

  p1.setData(10,"Pen",32.45);
  p2.setData(11,"Book",59);
  p3.setData(12,"Mouse",576);

  p1.display();
  p2.display();
  p3.display();

}

}