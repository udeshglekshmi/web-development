/*
* Pass fahrenhiet temperature value as command line argument
*/ 
public class Temperature
{
 public static void main (String[] args) 
 {
  double fah;
  fah = Double.parseDouble(args[0]);
  double celcius = (fah - 32)*5/9;
  System.out.printf("Celcius: % 2f",celcius);
  }
}
