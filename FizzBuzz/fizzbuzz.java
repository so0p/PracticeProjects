public class fizzbuzz{
	public static void fb(){
		for (int i =1; i<101; i++){
			if (i%3==0&i%5==0){
				System.out.println("FizzBuzz");
			}
			else if(i%3==0|i%5==0){
				if(i%3==0){
				System.out.println("Fizz");
				}
				else{
					System.out.println("Buzz");
				}
			}
			else{
				System.out.println(i);
			}
			
		}
	}
	
	public static void main(String[] args){
		fb();
	}
}