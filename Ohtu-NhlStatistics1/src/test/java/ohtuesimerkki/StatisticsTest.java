/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import static ohtuesimerkki.StatisticsTest.stats;
import org.junit.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hyppönen
 */
public class StatisticsTest {
    
    static Statistics stats;
    static Reader readerStub;
    
    public StatisticsTest() {
        this.readerStub = new Reader() {
            
            @Override
            public List<Player> getPlayers() {
                ArrayList<Player> players = new ArrayList<Player>();
                
                players.add(new Player("Semenko", "EDM", 4, 12));
                players.add(new Player("Lemieux", "PIT", 45, 54));
                players.add(new Player("Kurri",   "EDM", 37, 53));
                players.add(new Player("Yzerman", "DET", 42, 56));
                players.add(new Player("Gretzky", "EDM", 35, 89));
                
                return players;
            }
        };
    }
    
    @BeforeClass
    public static void setUpClass() {
        stats = new Statistics( readerStub );
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

//     TODO add test methods here.
//     The methods must be annotated with annotation @Test. For example:
//    
     @Test
     public void etsiKurri() {
        
         Player pelaaja;
         
         pelaaja = stats.search("Kurri");
         
         System.out.println(pelaaja.getName());
         
         assertEquals("Kurri", pelaaja.getName());
     }
}
