package tests;

import junit.framework.TestCase;
import monopoly.GameMaster;
import monopoly.Player;
import monopoly.TradeDeal;

public class TradeDealTest extends TestCase {
    
    @Override
    public void setUp() {
        GameMaster gameMaster = GameMaster.instance();
        gameMaster.reset();
        gameMaster.setNumberOfPlayers(2);
        gameMaster.getPlayer(0).setName("Buyer");
        gameMaster.getPlayer(1).setName("Seller");
    }

    public void testMakeMessage() {
        TradeDeal deal = new TradeDeal();
        Player buyer = GameMaster.instance().getPlayer(0);
        Player seller = GameMaster.instance().getPlayer(1);
        
        deal.setBuyer(buyer);
        deal.setSeller(seller);
        deal.setAmount(200);
        deal.setPropertyName("Blue 1");

        String message = "Buyer wishes to purchase Blue 1 from Seller" +
                " for 200.  Seller, do you wish to trade your property?";
        assertEquals(message, deal.makeMessage());
    }

}
