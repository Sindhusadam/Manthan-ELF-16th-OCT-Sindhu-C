class  Person{
 constructor(name,age)
 {
     this.name;
     this.age;
 }



getName(){
    return this.name
}
}

const p1 = new Person("elle",11)
const p2 = new Person("alaia",11)
console.log(p1.name)
let pName = p2.getName()
console.log(pName)

console.log("-------------------------")


class Teacher extends Person{
constructor (name,age,subject){
super(name,age)
this.subject = subject;
}
getSubject(){
    return this.subject
}
}
const t1 = new Teacher("austin",23,"english")
const sub = t1.getSubject();
console.log(t1)