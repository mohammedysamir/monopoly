package monopoly.gameboards;

import monopoly.GameBoard;
import monopoly.cards.JailCard;
import monopoly.cards.MoneyCard;
import monopoly.cards.MovePlayerCard;
import monopoly.cells.CardCell;
import monopoly.cells.FreeParkingCell;
import monopoly.cells.GoToJailCell;
import monopoly.cells.JailCell;
import monopoly.cells.PropertyCell;
import monopoly.cells.RailRoadCell;
import monopoly.cells.UtilityCell;
import monopoly.enums.CardType;
import monopoly.enums.ColorGroup;

public class GameBoardDefault extends GameBoard {


    int rrBaseRent = 25;
    int rrPrice = 200;

    public GameBoardDefault() {
        super();

        //Initialize property cells
        PropertyCell mediterraneanAvenueCell = initiatePropertyCell(60, ColorGroup.PURPLE, 50, "Mediterranean Avenue", 2);
        PropertyCell balticAvenueCell = initiatePropertyCell(60, ColorGroup.PURPLE, 50, "Baltic Avenue", 4);
        PropertyCell sarahAvenueCell = initiatePropertyCell(60, ColorGroup.PURPLE, 50, "Sarah Avenue", 4);
        PropertyCell orientalAvenueCell = initiatePropertyCell(100, ColorGroup.TEAL, 50, "Oriental Avenue", 6);
        PropertyCell vermontAvenueCell = initiatePropertyCell(100, ColorGroup.TEAL, 50, "Vermont Avenue", 6);
        PropertyCell connecticutAvenueCell = initiatePropertyCell(120, ColorGroup.TEAL, 50, "Connecticut Avenue", 8);
        PropertyCell charlesPlaceCell = initiatePropertyCell(140, ColorGroup.FUCHSIA, 100, "St. Charles Place", 10);
        PropertyCell statesAvenueCell = initiatePropertyCell(140, ColorGroup.FUCHSIA, 100, "States Avenue", 10);
        PropertyCell virginiaAvenueCell = initiatePropertyCell(160, ColorGroup.FUCHSIA, 100, "Virginia Avenue", 12);
        PropertyCell jamesAvenueCell = initiatePropertyCell(180, ColorGroup.MAROON, 100, "St. James Avenue", 14);
        PropertyCell tennesseeAvenueCell = initiatePropertyCell(180, ColorGroup.MAROON, 100, "Tennessee Avenue", 14);
        PropertyCell newYorkAvenueCell = initiatePropertyCell(200, ColorGroup.MAROON, 100, "New York Avenue", 16);
        PropertyCell kentuckyAvenueCell = initiatePropertyCell(220, ColorGroup.RED, 150, "Kentucky Avenue", 18);
        PropertyCell indianaAvenueCell = initiatePropertyCell(220, ColorGroup.RED, 150, "Indiana Avenue", 18);
        PropertyCell illinoisAvenueCell = initiatePropertyCell(240, ColorGroup.RED, 150, "Illinois Avenue", 20);
        PropertyCell atlanticAvenueCell = initiatePropertyCell(260, ColorGroup.ORANGE, 150, "Atlantic Avenue", 22);
        PropertyCell ventnorAvenueCell = initiatePropertyCell(260, ColorGroup.ORANGE, 150, "Ventnor Avenue", 22);
        PropertyCell marvinGardensCell = initiatePropertyCell(280, ColorGroup.ORANGE, 150, "Marvin Gardens", 24);
        PropertyCell pacificAvenueCell = initiatePropertyCell(300, ColorGroup.GREEN, 200, "Pacific Avenue", 26);
        PropertyCell northCarolinaAvenueCell = initiatePropertyCell(300, ColorGroup.GREEN, 200, "North Carolina Avenue", 26);
        PropertyCell pennsylvaniaAvenueCell = initiatePropertyCell(320, ColorGroup.GREEN, 200, "Pennsylvania Avenue", 28);
        PropertyCell parkPlaceCell = initiatePropertyCell(350, ColorGroup.BLUE, 200, "Park Place", 35);
        PropertyCell drightPlaceCell = initiatePropertyCell(350, ColorGroup.BLUE, 200, "Dright Place", 35);
        PropertyCell boardWalkCell = initiatePropertyCell(400, ColorGroup.BLUE, 200, "Boardwalk", 50);

        //initiate card cells
        CardCell communityChestCell1 = initiateCardCell(CardType.CC, "Community Chest 1");
        CardCell chanceCell1 = initiateCardCell(CardType.CHANCE, "Chance 1");
        CardCell communityChestCell2 = initiateCardCell(CardType.CC, "Community Chest 2");
        CardCell chanceCell2 = initiateCardCell(CardType.CHANCE, "Chance 2");
        CardCell communityChestCell3 = initiateCardCell(CardType.CC, "Community Chest 3");
        CardCell chanceCell3 = initiateCardCell(CardType.CHANCE, "Chance 3");

        //initiate railroad cells
        RailRoadCell readingRailRoadCell = initiateRailRoadCell("Reading RailRoad");
        RailRoadCell pennsylvaniaRailRoadCell = initiateRailRoadCell("Pennsylvania RailRoad");
        RailRoadCell b_oRailRoadCell = initiateRailRoadCell("B. & O. RailRoad");
        RailRoadCell shortLineRailRoadCell = initiateRailRoadCell("Short Line");

        //define utility cells
        JailCell jail = new JailCell();
        FreeParkingCell freeParkingCell = new FreeParkingCell();
        GoToJailCell goToJail = new GoToJailCell();
        UtilityCell electricCompanyUtilityCell = new UtilityCell();
        UtilityCell waterWorksUtilityCell = new UtilityCell();
        UtilityCell.setPrice(150);

        electricCompanyUtilityCell.setName("Electric Company");
        waterWorksUtilityCell.setName("Water Works");


        super.addCell(mediterraneanAvenueCell);
        super.addCell(communityChestCell1);
        super.addCell(balticAvenueCell);
        super.addCell(sarahAvenueCell);
        super.addCell(readingRailRoadCell);
        super.addCell(orientalAvenueCell);
        super.addCell(chanceCell1);
        super.addCell(vermontAvenueCell);
        super.addCell(connecticutAvenueCell);
        super.addCell(jail);
        super.addCell(charlesPlaceCell);
        super.addCell(electricCompanyUtilityCell);
        super.addCell(statesAvenueCell);
        super.addCell(virginiaAvenueCell);
        super.addCell(pennsylvaniaRailRoadCell);
        super.addCell(jamesAvenueCell);
        super.addCell(communityChestCell2);
        super.addCell(tennesseeAvenueCell);
        super.addCell(newYorkAvenueCell);
        super.addCell(freeParkingCell);
        super.addCell(kentuckyAvenueCell);
        super.addCell(chanceCell2);
        super.addCell(indianaAvenueCell);
        super.addCell(illinoisAvenueCell);
        super.addCell(b_oRailRoadCell);
        super.addCell(atlanticAvenueCell);
        super.addCell(ventnorAvenueCell);
        super.addCell(waterWorksUtilityCell);
        super.addCell(marvinGardensCell);
        super.addCell(goToJail);
        super.addCell(pacificAvenueCell);
        super.addCell(northCarolinaAvenueCell);
        super.addCell(communityChestCell3);
        super.addCell(pennsylvaniaAvenueCell);
        super.addCell(shortLineRailRoadCell);
        super.addCell(chanceCell3);
        super.addCell(parkPlaceCell);
        super.addCell(drightPlaceCell);
        super.addCell(boardWalkCell);

        super.addCard(new MoneyCard("Win $50", 50, CardType.CC));
        super.addCard(new MoneyCard("Win $20", 20, CardType.CC));
        super.addCard(new MoneyCard("Win $10", 10, CardType.CC));
        super.addCard(new MoneyCard("Lose $100", -100, CardType.CC));
        super.addCard(new MoneyCard("Lose $50", -50, CardType.CC));
        super.addCard(new JailCard(CardType.CC));
        super.addCard(new MovePlayerCard("St. Charles Place", CardType.CC));
        super.addCard(new MovePlayerCard("Boardwalk", CardType.CC));

        super.addCard(new MoneyCard("Win $50", 50, CardType.CHANCE));
        super.addCard(new MoneyCard("Win $20", 20, CardType.CHANCE));
        super.addCard(new MoneyCard("Win $10", 10, CardType.CHANCE));
        super.addCard(new MoneyCard("Lose $100", -100, CardType.CHANCE));
        super.addCard(new MoneyCard("Lose $50", -50, CardType.CHANCE));
        super.addCard(new JailCard(CardType.CHANCE));
        super.addCard(new MovePlayerCard("Illinois Avenue", CardType.CHANCE));

        super.shuffleCards();
    }

    /**
     * Function used to initialize PropertyCell objects with params
     *
     * @param price      : determine cell's price
     * @param color      : determine cell's color
     * @param housePrice : determine cell's house build price
     * @param Name       : determine cell's name
     * @param rentPrice  : determine cell's rent price
     * @return PropertyCell object associated with sent parameters
     */
    public PropertyCell initiatePropertyCell(int price, ColorGroup color, int housePrice, String Name, int rentPrice) {
        PropertyCell propertyCell = new PropertyCell();
        propertyCell.setPrice(price);
        propertyCell.setColorGroup(color);
        propertyCell.setHousePrice(housePrice);
        propertyCell.setName(Name);
        propertyCell.setRent(rentPrice);
        return propertyCell;
    }

    /**
     * Function used to initialize CardCell with params
     *
     * @param cardType : determine card type {CC or Chance}
     * @param cardName : determine card's Name
     * @return CardCell object with specified name and type
     */
    public CardCell initiateCardCell(CardType cardType, String cardName) {
        return new CardCell(cardType, cardName);
    }

    /**
     * Function used to initialize RailRoad cells with Name
     *
     * @param railRoadName: Determine cell's name
     * @return RailRoadCell object with specified name
     */
    public RailRoadCell initiateRailRoadCell(String railRoadName) {
        RailRoadCell railRoadCell = new RailRoadCell();
        railRoadCell.setName(railRoadName);
        railRoadCell.setBaseRent(rrBaseRent);
        railRoadCell.setPrice(rrPrice);
        return railRoadCell;
    }
}
