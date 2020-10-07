/**Showing identifier "variable" naming conventions.
 * 
 * Notice that when you make a identifier in java you 
 * must proclaim what type of information it holds.
 * The following are demonstrated in this example. 
 *   "int" represents integer values in the range of +- 2.1 billion
 *   "double" may represent a decimal value up to 15 sig figs.
 *   "String" notice the capital 'S', because Strings are actually objects.
 *      (there are many more types of data)
 *      
 *      Create the following methods attackTarget() warpSpeed() toString()
 *      so they work the same as the methods in Spaceship_demo
 *      
 * @author GrayKnight
 * @version 9/9/15
 */
public class Spaceship
{
    // Instance identifiers - are available to all methods in the object.
    // In APCS you will alway use the designation of "private" with 
    //   your instance identifiers.
    private int myNumRedAlerts = 0;
    private int myNumPhotonTorpedos = 5;         //Instance identifiers begin with the word 'my'.
    private double myDistanceFromEarth = 1.5;    //Numbers '$' and '_' are allowed on all identifier names
    private double myRe$ource$ = 584223.76;      // however the first character cannot be a number.
    
    private final int MAX_TORPEDOS = 5;
    private final double TORPEDO_CO$T = 3345.62;//The special characters "$" and "_" symbols are allowed, 
                                                // for identifiers, but no others.
    /**
     * There is a red alert!
     * 
     * @return claxon  a String that shows the alarm sounding. 
     */
    public String soundAlarm()
    {
        myNumRedAlerts = myNumRedAlerts + 1;   // could also use myNumRedAlerts++
        String claxon = "Honk! Honk! Honk!\n"; //claxon would be a local identifier, only available
                                               //within the soundAlarm() method.
        return claxon + "The number of red alerts is now " + myNumRedAlerts;
    }
    
    /**
     * The danger has passed. Cancel all red alerts!
     * 
     * @return myNumRedAlerts  a String that confirms there are no more red alerts. 
     */
    public String standDown(){
        myNumRedAlerts = 0;  //use "num" as a prefix for integer identifiers.
        //when you piece together a String using the + sign it is called concatenation
        String chill = "The number of red alerts is now " + myNumRedAlerts; //chill is a local identifier
        return chill;
    }
    
    /**
     * Zoom back to Earth. Buy more torpedos.
     * 
     * @return myNumRedAlerts  a String that confirms there are no more red alerts. 
     */
    public String resupply()
    {
        myDistanceFromEarth = 0.0;
        myNumPhotonTorpedos = MAX_TORPEDOS;
        myRe$ource$ = myRe$ource$ - TORPEDO_CO$T;
        return "Ready to go Captain.";
    }   
    
    // Create the following methods attackTarget() warpSpeed() toString()
    // so they work the same as the methods in Spaceship_demo
    
}