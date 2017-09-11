/**
 * 
 */
/*
 * // strings var name = "Nicholas"; var selection = "a"; // numbers var count =
 * 25; var cost = 1.51; // boolean var found = true; // null var object = null; //
 * undefined var flag = undefined; var ref; // assigned undefined automatically
 * 
 * //console.log(typeof "Nicholas"); // "string" //console.log(typeof 10); //
 * "number" //console.log(typeof 5.1); // "number" //console.log(typeof false); //
 * "boolean" //console.log(typeof undefined); // "undefined"
 * //console.log(typeof null); var emp=null; var emp1; console.log(emp1 ===
 * null);
 * 
 * var name="Abc";
 * 
 * console.log("5"==5); console.log("5"===5);
 * 
 * 
 * var object1 = new Object(); console.log(typeof object1); var obj;
 * console.log(typeof obj); obj=object1;
 * 
 * console.log(typeof obj);
 * 
 * var emp=new Object(); emp.empId=10; emp.empName='Praveen'; emp.salary=76334;
 * 
 * console.log(emp); console.log("EmpId : "+emp.empId); console.log("Emp Name :
 * "+emp.empName); console.log("Emp Salary : "+emp.salary);
 * 
 * 
 * var emp={ empId:'1024', empName:'Praveen Reddy S', salary:99733 }
 * 
 * console.log("Employee: "+emp); console.log("Id: "+emp.empId);
 * console.log("Name: "+emp.empName); console.log("Salary: "+emp.salary);
 * 
 */

/*
 * var person=new Object(); person.name="Nag"; person['full-name']="Naga N";
 * person['my_age']=54;
 * 
 * console.log('Name: '+person['name']);
 * 
 * console.log('Name: '+person['full-name']); console.log(person.my_age);
 */

/*
 * var person=new Object(); person.name="Nag"; person.age=32;
 * 
 * person.doWork=function(){ console.log('Teching .JS'); };
 */
/*
 * var student=new Object();
 * 
 * student.stdName="James"; student.getName=function(){
 * 
 * student.stdName="Praveen"; }
 * 
 * 
 * student.getName(); console.log(student.stdName);
 */

/*
 * var person={ name:'Ria', age:32, doWork:function(){ console.log('Teaching .JS
 * to '+this.name); } };
 * 
 * console.log(person);
 */

/*
 * var p=new Object(); var p1=p; console.log(p1);
 */

/*
 * var p=new Object(); p.doWork=function(){ console.log('teachng .JS'); }
 * 
 * console.log(dowork());
 */

/*
 * var arr=new Array(); arr.push("item1"); arr.push("item2"); arr[2]="item3";
 * console.log(arr);
 */
// or
/*
 * var arr=["item1","item2","item3"];
 * 
 * console.log(typeof arr);
 * 
 * 
 * var test=function(){ } console.log(typeof test);
 */

// 4. Function
// var add=new Function("n1","n2","var result=n1+n2;return result;");
// console.log(add(100,200));
// or
/*
 * function add(n1,n2){ var result=n1+n2; return result; }
 * 
 * 
 * 
 * 
 * add.prop1=12; add.prop2=13;
 * 
 * console.log(typeof add);
 */

/*
 * var v = 12; var name='Praveen'; var city='HYD';
 * 
 * function f1() {
 * 
 * function f2() { console.log("--- "+city); }
 * 
 * f2(); // f2-context ==> f1-context
 * 
 * var v = 13;
 * 
 * var city='CHN';
 * 
 * return f2; }
 * 
 * 
 * 
 * var f2Ref=f1();
 */
// f1-context ===> global-contextÏ
// f2Ref();
// f2-context ==> f1-context
// 1. function declaration
/*
 * console.log(add(12,13));
 * 
 * function add(n1,n2){ return n1+n2; }
 * 
 * console.log(add(12,13));
 */

// 2. function expression
// console.log(add(12,13));
/*
 * var add=function(n1,n2){ return n1+n2; };
 * 
 * console.log(add(12,13));
 */

login();

function login() {

	var func = null;
	var type = "admin";

	if (type === "admin") {
		func = function() {
			console.log('getting admin records..');
		}
	} else {
		func = function() {
			console.log('getting guest records..');
		}
	}

	func();
	
}

/*
 * function f1(){ console.log('no arg func'); } var f1=new Function();
 * 
 * 
 * 
 * function f1(arg1){ console.log('one arg func'); } var f1=new Function();
 * 
 * f1(12);
 */
