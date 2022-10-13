package simplelearn;


public class MemberInnerclass{

private String msg="Hello";
class Inner{
void hello(){
System.out.println(msg);
	}
}

public static void main(String[] args){
MemberInnerclass obj=new MemberInnerclass();
System.out.println(obj.msg);

MemberInnerclass.Inner innerObj=obj.new Inner();
innerObj.hello();
	}
}