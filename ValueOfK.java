class ValueOfK{
public static void main(String args[]){
int i =36;
int j = 19;
int k;
k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
System.out.println("The value of k is : "+k);
}
}