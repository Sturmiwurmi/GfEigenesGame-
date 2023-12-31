import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Erdgeschoss4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Erdgeschoss4 extends World
{
    private static int zellenGroesse = 50;
    /**
     * Constructor for objects of class Erdgeschoss4.
     * 
     */
    public Erdgeschoss4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(21, 16, zellenGroesse);
        setBackground("images/Schuleboden.png");
        setPaintOrder(String.class, Rover.class, Marke.class, Gestein.class, Huegel.class);
        Greenfoot.setSpeed(35);
        
        
        
        prepare();
         this.addObject(new Gulli(), 10, 7);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TreppeEzu410 treppe400zu410 = new TreppeEzu410();
        addObject(treppe400zu410,20,14);
        Foyer foyer = new Foyer();
        addObject(foyer,17,12);
        Foyer foyer2 = new Foyer();
        addObject(foyer2,16,12);
        Foyer foyer3 = new Foyer();
        addObject(foyer3,17,11);
        Foyer foyer4 = new Foyer();
        addObject(foyer4,16,11);
        Foyer foyer5 = new Foyer();
        addObject(foyer5,15,12);
        Foyer foyer6 = new Foyer();
        addObject(foyer6,15,11);
        Foyer foyer7 = new Foyer();
        addObject(foyer7,17,10);
        Foyer foyer8 = new Foyer();
        addObject(foyer8,16,10);
        Foyer foyer9 = new Foyer();
        addObject(foyer9,15,10);
        Foyer foyer10 = new Foyer();
        addObject(foyer10,17,9);
        Foyer foyer11 = new Foyer();
        addObject(foyer11,16,9);
        Foyer foyer12 = new Foyer();
        addObject(foyer12,15,9);
        Foyer foyer13 = new Foyer();
        addObject(foyer13,17,8);
        Foyer foyer14 = new Foyer();
        addObject(foyer14,16,8);
        Foyer foyer15 = new Foyer();
        addObject(foyer15,15,8);
        Foyer foyer16 = new Foyer();
        addObject(foyer16,14,8);
        Foyer foyer17 = new Foyer();
        addObject(foyer17,14,9);
        Foyer foyer18 = new Foyer();
        addObject(foyer18,14,10);
        Foyer foyer19 = new Foyer();
        addObject(foyer19,14,11);
        Foyer foyer20 = new Foyer();
        addObject(foyer20,14,12);
        Foyer foyer21 = new Foyer();
        addObject(foyer21,13,12);
        Foyer foyer22 = new Foyer();
        addObject(foyer22,13,11);
        Foyer foyer23 = new Foyer();
        addObject(foyer23,17,7);
        Foyer foyer24 = new Foyer();
        addObject(foyer24,16,7);
        Foyer foyer25 = new Foyer();
        addObject(foyer25,17,6);
        Foyer foyer26 = new Foyer();
        addObject(foyer26,16,6);
        Foyer foyer27 = new Foyer();
        addObject(foyer27,15,7);
        Foyer foyer28 = new Foyer();
        addObject(foyer28,18,5);
        removeObject(foyer28);

        addObject(foyer28,17,5);
        Foyer foyer29 = new Foyer();
        addObject(foyer29,16,5);
        Foyer foyer30 = new Foyer();
        addObject(foyer30,15,6);
        Foyer foyer31 = new Foyer();
        addObject(foyer31,15,5);
        Foyer foyer32 = new Foyer();
        addObject(foyer32,14,5);
        Foyer foyer33 = new Foyer();
        addObject(foyer33,14,6);
        Foyer foyer34 = new Foyer();
        addObject(foyer34,14,7);
        Foyer foyer35 = new Foyer();
        addObject(foyer35,13,10);
        Foyer foyer36 = new Foyer();
        addObject(foyer36,13,9);
        Foyer foyer37 = new Foyer();
        addObject(foyer37,13,8);
        foyer34.setLocation(14,7);
        Foyer foyer38 = new Foyer();
        addObject(foyer38,14,7);
        Foyer foyer39 = new Foyer();
        addObject(foyer39,13,7);
        Foyer foyer40 = new Foyer();
        addObject(foyer40,13,6);
        Foyer foyer41 = new Foyer();
        addObject(foyer41,13,5);
        Foyer foyer42 = new Foyer();
        addObject(foyer42,12,12);
        Foyer foyer43 = new Foyer();
        addObject(foyer43,11,12);
        Foyer foyer44 = new Foyer();
        addObject(foyer44,10,12);
        Foyer foyer45 = new Foyer();
        addObject(foyer45,9,12);
        Foyer foyer46 = new Foyer();
        addObject(foyer46,8,12);
        Foyer foyer47 = new Foyer();
        addObject(foyer47,7,12);
        Foyer foyer48 = new Foyer();
        addObject(foyer48,6,12);
        Foyer foyer49 = new Foyer();
        addObject(foyer49,5,12);
        Foyer foyer50 = new Foyer();
        addObject(foyer50,4,12);
        Foyer foyer51 = new Foyer();
        addObject(foyer51,3,12);
        Foyer foyer52 = new Foyer();
        addObject(foyer52,3,11);
        Foyer foyer53 = new Foyer();
        addObject(foyer53,4,11);
        Foyer foyer54 = new Foyer();
        addObject(foyer54,5,11);
        Foyer foyer55 = new Foyer();
        addObject(foyer55,6,11);
        Foyer foyer56 = new Foyer();
        addObject(foyer56,7,11);
        Foyer foyer57 = new Foyer();
        addObject(foyer57,8,11);
        Foyer foyer58 = new Foyer();
        addObject(foyer58,9,11);
        Foyer foyer59 = new Foyer();
        addObject(foyer59,10,11);
        Foyer foyer60 = new Foyer();
        addObject(foyer60,12,11);
        Foyer foyer61 = new Foyer();
        addObject(foyer61,11,11);
        Foyer foyer62 = new Foyer();
        addObject(foyer62,12,10);
        Foyer foyer63 = new Foyer();
        addObject(foyer63,12,9);
        Foyer foyer64 = new Foyer();
        addObject(foyer64,12,8);
        Foyer foyer65 = new Foyer();
        addObject(foyer65,12,7);
        Foyer foyer66 = new Foyer();
        addObject(foyer66,12,6);
        Foyer foyer67 = new Foyer();
        addObject(foyer67,12,5);
        Foyer foyer68 = new Foyer();
        addObject(foyer68,11,5);
        Foyer foyer69 = new Foyer();
        addObject(foyer69,11,6);
        Foyer foyer70 = new Foyer();
        addObject(foyer70,11,7);
        Foyer foyer71 = new Foyer();
        addObject(foyer71,11,8);
        Foyer foyer72 = new Foyer();
        addObject(foyer72,11,9);
        Foyer foyer73 = new Foyer();
        addObject(foyer73,11,10);
        Foyer foyer74 = new Foyer();
        addObject(foyer74,10,10);
        Foyer foyer75 = new Foyer();
        addObject(foyer75,9,10);
        Foyer foyer76 = new Foyer();
        addObject(foyer76,10,9);
        Foyer foyer77 = new Foyer();
        addObject(foyer77,8,10);
        Foyer foyer78 = new Foyer();
        addObject(foyer78,9,9);
        Foyer foyer79 = new Foyer();
        addObject(foyer79,10,8);
        Foyer foyer80 = new Foyer();
        addObject(foyer80,10,7);
        Foyer foyer81 = new Foyer();
        addObject(foyer81,10,6);
        Foyer foyer82 = new Foyer();
        addObject(foyer82,10,5);
        Foyer foyer83 = new Foyer();
        addObject(foyer83,9,8);
        Foyer foyer84 = new Foyer();
        addObject(foyer84,9,5);
        Foyer foyer85 = new Foyer();
        addObject(foyer85,9,6);
        Foyer foyer86 = new Foyer();
        addObject(foyer86,9,7);
        Foyer foyer87 = new Foyer();
        addObject(foyer87,8,9);
        Foyer foyer88 = new Foyer();
        addObject(foyer88,7,10);
        Foyer foyer89 = new Foyer();
        addObject(foyer89,6,10);
        Foyer foyer90 = new Foyer();
        addObject(foyer90,6,9);
        Foyer foyer91 = new Foyer();
        addObject(foyer91,7,9);
        Foyer foyer92 = new Foyer();
        addObject(foyer92,8,8);
        Foyer foyer93 = new Foyer();
        addObject(foyer93,7,8);
        Foyer foyer94 = new Foyer();
        addObject(foyer94,6,8);
        Foyer foyer95 = new Foyer();
        addObject(foyer95,5,10);
        Foyer foyer96 = new Foyer();
        addObject(foyer96,5,9);
        Foyer foyer97 = new Foyer();
        addObject(foyer97,5,8);
        Foyer foyer98 = new Foyer();
        addObject(foyer98,5,7);
        Foyer foyer99 = new Foyer();
        addObject(foyer99,6,7);
        Foyer foyer100 = new Foyer();
        addObject(foyer100,7,7);
        Foyer foyer101 = new Foyer();
        addObject(foyer101,8,7);
        Foyer foyer102 = new Foyer();
        addObject(foyer102,8,6);
        Foyer foyer103 = new Foyer();
        addObject(foyer103,8,5);
        Foyer foyer104 = new Foyer();
        addObject(foyer104,7,5);
        Foyer foyer105 = new Foyer();
        addObject(foyer105,7,6);
        Foyer foyer106 = new Foyer();
        addObject(foyer106,6,6);
        Foyer foyer107 = new Foyer();
        addObject(foyer107,6,5);
        Foyer foyer108 = new Foyer();
        addObject(foyer108,5,5);
        Foyer foyer109 = new Foyer();
        addObject(foyer109,5,6);
        Foyer foyer110 = new Foyer();
        addObject(foyer110,4,10);
        Foyer foyer111 = new Foyer();
        addObject(foyer111,3,10);
        Foyer foyer112 = new Foyer();
        addObject(foyer112,4,9);
        Foyer foyer113 = new Foyer();
        addObject(foyer113,3,9);
        Foyer foyer114 = new Foyer();
        addObject(foyer114,4,8);
        Foyer foyer115 = new Foyer();
        addObject(foyer115,4,7);
        Foyer foyer116 = new Foyer();
        addObject(foyer116,4,6);
        Foyer foyer117 = new Foyer();
        addObject(foyer117,4,5);
        Foyer foyer118 = new Foyer();
        addObject(foyer118,3,5);
        Foyer foyer119 = new Foyer();
        addObject(foyer119,3,6);
        Foyer foyer120 = new Foyer();
        addObject(foyer120,3,7);
        foyer120.setLocation(3,7);
        Foyer foyer121 = new Foyer();
        addObject(foyer121,3,7);
        Foyer foyer122 = new Foyer();
        addObject(foyer122,3,8);
        Foyer foyer123 = new Foyer();
        addObject(foyer123,17,4);
        Foyer foyer124 = new Foyer();
        addObject(foyer124,16,4);
        Foyer foyer125 = new Foyer();
        addObject(foyer125,15,4);
        Foyer foyer126 = new Foyer();
        addObject(foyer126,14,4);
        Foyer foyer127 = new Foyer();
        addObject(foyer127,13,4);
        Foyer foyer128 = new Foyer();
        addObject(foyer128,12,4);
        Foyer foyer129 = new Foyer();
        addObject(foyer129,11,4);
        Foyer foyer130 = new Foyer();
        addObject(foyer130,10,4);
        Foyer foyer131 = new Foyer();
        addObject(foyer131,9,4);
        Foyer foyer132 = new Foyer();
        addObject(foyer132,8,4);
        Foyer foyer133 = new Foyer();
        addObject(foyer133,7,4);
        Foyer foyer134 = new Foyer();
        addObject(foyer134,6,4);
        Foyer foyer135 = new Foyer();
        addObject(foyer135,5,4);
        Foyer foyer136 = new Foyer();
        addObject(foyer136,4,4);
        Foyer foyer137 = new Foyer();
        addObject(foyer137,3,4);
        foyer2.setLocation(16,12);
        Gel�nder gel�nder = new Gel�nder();
        addObject(gel�nder,16,12);
        foyer5.setLocation(15,12);
        Gel�nder gel�nder2 = new Gel�nder();
        addObject(gel�nder2,15,12);
        foyer20.setLocation(14,12);
        Gel�nder gel�nder3 = new Gel�nder();
        addObject(gel�nder3,14,12);
        foyer21.setLocation(13,12);
        Gel�nder gel�nder4 = new Gel�nder();
        addObject(gel�nder4,13,12);
        foyer42.setLocation(12,12);
        Gel�nder gel�nder5 = new Gel�nder();
        addObject(gel�nder5,12,12);
        foyer43.setLocation(11,12);
        Gel�nder gel�nder6 = new Gel�nder();
        addObject(gel�nder6,11,12);
        foyer46.setLocation(8,12);
        Gel�nder gel�nder7 = new Gel�nder();
        addObject(gel�nder7,8,12);
        foyer47.setLocation(7,12);
        Gel�nder gel�nder8 = new Gel�nder();
        addObject(gel�nder8,7,12);
        foyer48.setLocation(6,12);
        Gel�nder gel�nder9 = new Gel�nder();
        addObject(gel�nder9,6,12);
        foyer49.setLocation(5,12);
        Gel�nder gel�nder10 = new Gel�nder();
        addObject(gel�nder10,5,12);
        foyer50.setLocation(4,12);
        Gel�nder gel�nder11 = new Gel�nder();
        addObject(gel�nder11,4,12);
        foyer52.setLocation(3,11);
        Gel�nder1 gel�nder1 = new Gel�nder1();
        addObject(gel�nder1,3,11);
        foyer111.setLocation(3,10);
        Gel�nder1 gel�nder12 = new Gel�nder1();
        addObject(gel�nder12,3,10);
        foyer113.setLocation(3,9);
        Gel�nder1 gel�nder13 = new Gel�nder1();
        addObject(gel�nder13,3,9);
        foyer122.setLocation(3,8);
        Gel�nder1 gel�nder14 = new Gel�nder1();
        addObject(gel�nder14,3,8);
        foyer119.setLocation(3,6);
        Gel�nder1 gel�nder15 = new Gel�nder1();
        addObject(gel�nder15,3,6);
        removeObject(foyer51);
        foyer129.setLocation(11,4);
        Gel�nder gel�nder16 = new Gel�nder();
        addObject(gel�nder16,11,4);
        foyer128.setLocation(12,4);
        Gel�nder gel�nder17 = new Gel�nder();
        addObject(gel�nder17,12,4);
        foyer127.setLocation(13,4);
        Gel�nder gel�nder18 = new Gel�nder();
        addObject(gel�nder18,13,4);
        foyer126.setLocation(14,4);
        Gel�nder gel�nder19 = new Gel�nder();
        addObject(gel�nder19,14,4);
        foyer125.setLocation(15,4);
        Gel�nder gel�nder20 = new Gel�nder();
        addObject(gel�nder20,15,4);
        foyer124.setLocation(16,4);
        Gel�nder gel�nder21 = new Gel�nder();
        addObject(gel�nder21,16,4);
        foyer130.setLocation(10,4);
        Gel�nder gel�nder22 = new Gel�nder();
        addObject(gel�nder22,10,4);
        foyer131.setLocation(9,4);
        Gel�nder gel�nder23 = new Gel�nder();
        addObject(gel�nder23,9,4);
        foyer133.setLocation(7,4);
        Gel�nder gel�nder24 = new Gel�nder();
        addObject(gel�nder24,7,4);
        foyer132.setLocation(8,4);
        Gel�nder gel�nder25 = new Gel�nder();
        addObject(gel�nder25,8,4);
        foyer134.setLocation(6,4);
        Gel�nder gel�nder26 = new Gel�nder();
        addObject(gel�nder26,6,4);
        foyer135.setLocation(5,4);
        Gel�nder gel�nder27 = new Gel�nder();
        addObject(gel�nder27,5,4);
        foyer136.setLocation(4,4);
        Gel�nder gel�nder28 = new Gel�nder();
        addObject(gel�nder28,4,4);
        foyer118.setLocation(3,5);
        Gel�nder1 gel�nder110 = new Gel�nder1();
        addObject(gel�nder110,3,5);
        FoyerWand foyerWand = new FoyerWand();
        addObject(foyerWand,18,12);
        FoyerWand foyerWand2 = new FoyerWand();
        addObject(foyerWand2,18,11);
        FoyerWand foyerWand3 = new FoyerWand();
        addObject(foyerWand3,18,10);
        FoyerWand foyerWand4 = new FoyerWand();
        addObject(foyerWand4,18,9);
        FoyerWand foyerWand5 = new FoyerWand();
        addObject(foyerWand5,18,8);
        FoyerWand foyerWand6 = new FoyerWand();
        addObject(foyerWand6,18,7);
        FoyerWand foyerWand7 = new FoyerWand();
        addObject(foyerWand7,18,6);
        FoyerWand foyerWand8 = new FoyerWand();
        addObject(foyerWand8,18,5);
        FoyerWand foyerWand9 = new FoyerWand();
        addObject(foyerWand9,18,4);
        foyerWand.setLocation(18,12);
        foyer.setLocation(17,12);
        FoyerWand foyerWand10 = new FoyerWand();
        addObject(foyerWand10,17,12);
        foyer3.setLocation(17,11);
        FoyerWand foyerWand11 = new FoyerWand();
        addObject(foyerWand11,17,11);
        foyer7.setLocation(17,10);
        FoyerWand foyerWand12 = new FoyerWand();
        addObject(foyerWand12,17,10);
        foyer10.setLocation(17,9);
        FoyerWand foyerWand13 = new FoyerWand();
        addObject(foyerWand13,17,9);
        foyer13.setLocation(17,8);
        FoyerWand foyerWand14 = new FoyerWand();
        addObject(foyerWand14,17,8);
        foyer23.setLocation(17,7);
        FoyerWand foyerWand15 = new FoyerWand();
        addObject(foyerWand15,17,7);
        foyer25.setLocation(17,6);
        FoyerWand foyerWand16 = new FoyerWand();
        addObject(foyerWand16,17,6);
        foyer28.setLocation(17,5);
        FoyerWand foyerWand17 = new FoyerWand();
        addObject(foyerWand17,17,5);
        foyer123.setLocation(17,4);
        FoyerWand foyerWand18 = new FoyerWand();
        addObject(foyerWand18,17,4);
        removeObject(foyerWand9);
        removeObject(foyerWand8);
        removeObject(foyerWand7);
        removeObject(foyerWand6);
        removeObject(foyerWand5);
        removeObject(foyerWand4);
        removeObject(foyerWand3);
        removeObject(foyerWand2);
        removeObject(foyerWand);
        foyer53.setLocation(4,11);
        M�lleimer m�lleimer = new M�lleimer();
        addObject(m�lleimer,4,11);
        Gel�nderWand gel�nderWand = new Gel�nderWand();
        addObject(gel�nderWand,0,3);
        Gel�nderWand gel�nderWand2 = new Gel�nderWand();
        addObject(gel�nderWand2,1,3);
        removeObject(foyer137);
        removeObject(gel�nder25);
        removeObject(gel�nder23);
        removeObject(gel�nder22);
        Dummy1 dummy1 = new Dummy1();
        addObject(dummy1,0,2);
        Dummy1 dummy12 = new Dummy1();
        addObject(dummy12,0,1);
        Dummy1 dummy13 = new Dummy1();
        addObject(dummy13,0,0);
        Dummy1 dummy14 = new Dummy1();
        addObject(dummy14,0,4);
        Dummy1 dummy15 = new Dummy1();
        addObject(dummy15,0,5);
        Dummy1 dummy16 = new Dummy1();
        addObject(dummy16,0,6);
        TreppeEzu310 treppeEzu310 = new TreppeEzu310();
        addObject(treppeEzu310,20,1);
    }
}
