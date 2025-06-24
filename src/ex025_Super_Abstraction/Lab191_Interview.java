package ex025_Super_Abstraction;

public class Lab191_Interview {
}
interface I11{}
interface I12{}
class A1{}
class B1{}
class Test1 extends A1{}
//class Test2 extends A1,B1{} // multiple not allowed
class Test3 implements I11{}
class Test4 implements I11,I12{}
class Test5 extends A1 implements I11,I12{}
//class Test5 implements I11 extends A1{} // not possible first implement then extend
//interface I3 extends A1{} //not possible interface with extend