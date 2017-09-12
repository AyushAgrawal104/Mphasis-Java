// third-party
var greetLib = {
	ename : 'James',

	sayName : function(message, from) {
		console.log(message + ' im ' + this.ename + ": from " + from);
	}
};
// our-code
var p1 = {
	ename : 'Nag'
};
var e1 = {
	ename : 'Emp1'
};

// dyanamic func binding

// way-1
// greetLib.sayName.call(p1,"Hello","BLR")
// greetLib.sayName.call(e1, "Dude", "CHN")

// way-2
/*
 * greetLib.sayName.apply(p1,["Hello","BLR"])
 * greetLib.sayName.apply(e1,["Dude","CHN"])
 */

// way-3
/*
 * var newF = greetLib.sayName.bind(p1); // // click-event newF("Hi",
 * "universe");
 * 
 * var newF2 = greetLib.sayName.bind(e1); newF2('Hello',"Hyderaabad");
 */

var emp = {
	ename : 'Praveen',
	greet : function() {
		console.log("Hi " + this.ename);
	}
}

//emp.greet();
var p1 = emp;
emp = {
	ename : 'James'
}

p1.greet(); //--> Praveen







