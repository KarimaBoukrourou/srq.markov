
package cfranc.com;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kb996192
 */
public class BoukrourouKarimaTest {
    
    public BoukrourouKarimaTest() {
       
    }

    @Test
    public void testHachcode() {
        String w1;
        String w2;
        Couple couple =new Couple(w1,w2)
        return this.first.hashCode() + this.second.hashCode();      
    }

    @Test
    public void testReadFile() {
        
		Couple c1 = new Couple("Il", "était");
		Couple c2 = new Couple("était", "une");
		Couple c3 = new Couple("une", "fois");
		List<String> list1 = new ArrayList<String>();
		list1.add("une");
		Markov m1 = new Markov();
		m1.couples.put(c1, list1);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("fois");
		m1.couples.put(c2, list2);
		
		assertEquals(2, m1.couples.size());	
	}

	
	@Test
	public void Il_Etait_Une() {
		Couple c1 = new Couple("Il", "était");
		Couple c2 = new Couple("était", "une");
		List<String> list1 = new ArrayList<String>();
		list1.add("une");
		Markov m1 = new Markov();
		m1.couples.put(c1, list1);
		String s = new String(Il_Etait_Une(c1, 3));
		
		assertEquals("Il était une", s);
				
	}		
}
    
    @Test
    public void testhachCodeEclipse() {
         //result=31;
         //result=31*31;
         
                 
    }
    
}
