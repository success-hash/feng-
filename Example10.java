public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("请输入数字A:");
double numberA=scan.nextDouble();
System.out.print("请输入运算符（+、-、*、/）:");
char op=scan.next().charAt(0);
System.out.print("请输入数字B:");
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