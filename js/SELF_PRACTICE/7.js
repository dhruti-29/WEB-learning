let a = { marks: 80 };

let b = a;
let c = { ...a };

b.marks = 90;
c.marks = 100;

console.log(a.marks);
console.log(b.marks);
console.log(c.marks); 