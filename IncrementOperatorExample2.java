class IncrementOperatorExample2 {
public static void main(String args[]){
int a=5;
int b=10;
int c;
c= a + b + a++ + b++ + ++a + ++b ;
System.out.println("The value of c is : "+c);
}
}