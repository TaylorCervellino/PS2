package base;

public class MyInteger {
//int data field called iValue stores the int value in this object
	private int iValue; 
	
	//a Myinteger object is created by this constructor for the ivalue
	public MyInteger(int iValue){
		this.iValue = iValue;
	}
	//getter that returns iValue
	public int getiValue(){
		return iValue;
	}
	//method that returns true if value is an even number
	public boolean isEven(){
		if (this.getiValue() % 2 == 0){
			return true; 
		}
		else{
			return false;
	}	
}
	//method that returns true if value is an odd number
	public boolean isOdd(){
		if (this.getiValue() % 2 !=0){
			return true;
		}
		else {
			return false;
		}
	}
	//method that returns true if iValue is a prime number
	public boolean isPrime(){
		for (int i =2; i < this.getiValue(); i++){
			if (this.getiValue() % i == 0) {
				return false;
				
			}
		}
		return true;
	}
	//static method that returns true if value is an even number
	public static boolean isEven (int iValue){
		if (iValue % 2 == 0){
			return true;
		}
		else {
			return false;
		}
	}
	//static method that returns true if value is an odd number
	public static boolean isOdd(int iValue){
		if (iValue % 2 != 0){
			return true;
		}
		else {
			return false;
		}
		
	}
	//static method that returns true if value is a prime number
	public static boolean isEven(MyInteger iValue){
		return iValue.isEven();
			
	}
	//static method that returns true if value is an odd number
	public static boolean isOdd(MyInteger iValue){
		return iValue.isOdd();
		
	}
	//static method that returns true if value is a prime number
	public static boolean isPrime(MyInteger iValue){
		return iValue.isPrime();
	}
	//method that returns true if the object value is equal to the specified value
	public boolean equals(int i) {
		if (i == getiValue()){
			return true;
		}
		return false;
	}
	//method that returns true if the object value is equal to the specified value
	public static boolean equals(MyInteger i){
		return i.equals(i.getiValue());
	}
}