 var person = {
     pName: 'Praveen',
     sayName: function () {
             console.log('im ' + person.pName);
     }
 };

var p = person;
person = { pName: 'Ria' };
p.sayName();