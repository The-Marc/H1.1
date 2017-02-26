public class Recursion{
    
  //double guess = x / 2;
    
  public static double squareRoot(double x, double guess, double error){
    double acceptedError = 0.25;
    error = x - guess * guess;
    if (error <= acceptedError)
      return guess;
    else {
      double newGuess = 0.5 * ((guess + x) / guess);
      return squareRoot(x, newGuess, error);
    }
  }
  
  
  public static void main(String[] args){
        System.out.println(squareRoot(9, 4.5));
  
  }
    

}