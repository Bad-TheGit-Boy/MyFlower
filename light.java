// Compute distance light travels using long variables.
/*class Light {
    public static void main(String args[]){
       int lightspeed;
       long days;
       long seconds;
       long distance;
 
       // approximate speed of light in miles per second
       lightspeed = 186000;
 
       days = 1000;  // specify number of days here
       seconds = days * 24 * 60 * 60;  // convert to seconds
       distance = lightspeed * seconds;  // compute distance
 
       System.out.print("In  " + days);
       System.out.print(" days light will travel about ");
       System.out.println(distance  + " miles. ");      
    }
 }*/


 // Compute the area of a circle
class Area {
   public static void main(String args[]){
      float pi, r, a;

      r = 10.8f;      // radius of circle
      pi = 3.1416f;      // pi, approximately
      a = pi * r * r;    // compute area
    
      System.out.println("Area of circle is " + a);
      System.out.printf("%.2f", a);
   }  
}