public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("����������A:");
double numberA=scan.nextDouble();
System.out.print("�������������+��-��*��/��:");
char op=scan.next().charAt(0);
System.out.print("����������B:");
double numberB=scan.nextDouble();
double result=0;
switch(op){
case '+':
result=numberA+numberB;
case '-':
result=numberA-numberB;
case '*':
result=numberA*numberB;
case '/':
result=numberA/numberB;
break;
}