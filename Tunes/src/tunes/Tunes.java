
package tunes;

/**
 * AP Computer Science
 * @author change to your name or loose 5 points
 */
public class Tunes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    CDCollection music = new CDCollection ();
    
    music.addCD ("By the Way", "Red Hot Chili Peppers", 14.95, 10);
    music.addCD ("Come On Over", "Shania Twain", 14.95, 16);
    music.addCD ("Soundtrack", "The Producers", 17.95, 33);
    music.addCD ("Play", "Jennifer Lopez", 13.90, 11);
    
    System.out.println (music);
    
    music.addCD ("Double Live", "Garth Brooks", 19.99, 26);
    music.addCD ("Greatest Hits", "Stone Temple Pilots", 15.95, 13);
    
    System.out.println (music);
    }
}
