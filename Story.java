/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package untitledturkeygame;

/**
 *
 * @author Jon Comisky, Jason Bendickson
 */

public class Story {
    GUI gui;
    Game game;
    Visibility V;
    Node<String> barn = new Node<>("Barn");
    Node<String> turkeyTalk = new Node<>("turkeyTalk");
    Node<String> pigginOut = new Node<>("pigginOut");
    Node<String> seeTheLight = new Node<>("seeTheLight");
    Node<String> theGobbling = new Node<>("theGobbling");
    Node<String> farmerChuck = new Node<>("farmerChuck");
    Node<String> youDied1 = new Node<>("youDied1");
    Node<String> youEscaped = new Node<>("youEscaped");
    Node<String> bringYourFriends = new Node<>("bringYourFriends");
    Node<String> threeLittlePigs = new Node<>("threeLittlePigs");
    Node<String> forTheGreaterGood = new Node<>("forTheGreaterGood");
    Node<String> youDied2 = new Node<>("youDied2");
    Node<String> youDied3 = new Node<>("youDied3");
    Node<String> farmHouse = new Node<>("farmHouse");
    Node<String> farmHouseTurkey = new Node<>("farmHouseTurkey");
    Node<String> farmHousePig = new Node<>("farmHousePig");
    Node<String> farmHouseBoth = new Node<>("farmHouseBoth");
    Node<String> youWin = new Node<>("youWin");
    Node<String> youLose =  new Node<>("youLose");
    
    
    
    //constructor
    public Story(Game game,GUI gui,Visibility V){
        this.game = game;
        this.gui = gui;
        this.V = V;
    }
    
    //this method checks the intended nextPosition
    //defined within the story methods
    public void selectPosition(String nextPosition){
        switch (nextPosition){
            case "turkeyTalk": turkeyTalk(); break;
            case "seeTheLight": seeTheLight(); break;
            case "pigginOut": pigginOut(); break;
            case "theGobbling": theGobbling(); break;
            case "threeLittlePigs": break;
            case "forTheGreaterGood": break;
            case "youDied1": break;
            case "youDied2": break;
            case "youDied3": break;
            case "youWin": break;
            case "youLose": break;
            default: break;
            
        }
    }
    
    //begin story methods
    //these methods change the text of the textarea and the buttons.
    //they also set the nextPosition strings to their correct values to be chosen by the switch statement above.
     public void barn(){
        if (barn.getVisited()){
            gui.gameTextArea.setText("There is a small flock of turkeys to your right, they seem to be upset and discussing something.\n"
                + "A large open door gleams with the morning sunlight in front of you. \n"
                + "To your left, right outside the side barn door, is a pig-pen where there are 3 pigs rolling around in the mud.\n");
        }else{gui.gameTextArea.setText("You awake in a large hay filled barn. \n"
                + "Looking down, you notice you have the feet of a turkey...\n"
                + "There is a small flock of turkeys to your right, they seem to be upset and discussing something.\n"
                + "A large open door gleams with the morning sunlight in front of you. \n"
                + "To your left, right outside the side barn door, is a pig-pen where there are 3 pigs rolling around in the mud.");
        }
        gui.B1.setText("Approach the flock of turkeys, and ask what the commotion is about.");
        game.nextPosition1 = "turkeyTalk";
        gui.B2.setText("Walk through the sun filled door.");
        game.nextPosition2 = "seeTheLight";
        gui.B3.setText("Go see the pigs, they do seem to be having quite a bit of fun...");
        game.nextPosition3 = "pigginOut";
        gui.B4.setText("...");
        game.nextPosition4 = "";
        barn.setVisited(true);
    }
    public void turkeyTalk(){
        gui.gameTextArea.setText("You strut over to the other turkeys, your body feels awkward as you move.\n"
                + "\"Its the Apocalypse!\", you hear one turkey proclaim, who is standing on a hay bale. \n"
                + "She looks like she is about to cry, if turkeys can do that...\n"
                + "The rest of the turkeys seem to be ambivalent to what she just said,\n"
                + "she is, afterall, the most recent turkey to join the flock\n");
        gui.B1.setText("Loudly dispute her claims. Announce to the others that she must have a few feathers loose.");
        game.nextPosition1 = "pigginOut";
        gui.B2.setText("Agree with her and try to convince the others to heed her claim.");
        game.nextPosition2 = "theGobbling";
        gui.B3.setText("Ignore her and the others. You are distracted by the fact that you are a turkey.");
        game.nextPosition3 = "barn";
        gui.B4.setText("\"Why is that turkey talking?\", you ask yourself as you search the ground for bugs.");
        game.nextPosition4 = "youWin";
        turkeyTalk.setVisited(true);
    }
    public void seeTheLight(){
        gui.gameTextArea.setText("You walk into the light, it seems to be the only thing in the world at the moment.\n"
                    + "For some reason you remember that around the time of year that it stays cold during the day,\n"
                    + "that the sun lines up perfectly with the door at sunrise.\n"
                    + "...You also remember that this also means turkeys are about to go missing...");
        gui.B1.setText("Turn around and go back to the flock. They deserve to be warned.");
        game.nextPosition1 = "turkeyTalk";
        gui.B2.setText("Keep going, maybe you can find a way off this farm before its too late.");
        game.nextPosition2 = "thePond";
        gui.B3.setText("Walk slowly into the light, for you have accepted that it could be you.");
        game.nextPosition3 = "thePond";
        gui.B4.setText("You feel drawn back to the pig-pen, maybe I should go talk to them.");
        game.nextPosition4 = "pigginOut";
        seeTheLight.setVisited(true);
    }
    public void pigginOut(){
        if(theGobbling.getVisited()){
            gui.gameTextArea.setText("However, you dont have a plan. So you decide to go ask the pigs.\n"
                    + "You approach the pigs, they are snorting and oinking and rolling in the mud.");
        }else{
            gui.gameTextArea.setText("You approach the pigs, they are snorting and oinking and rolling in the mud.");
        }
        gui.B1.setText("Ask the pigs if you can join them, they seem to be having a blast.");
        game.nextPosition1 = "youDied1";
        gui.B2.setText("Ask the pigs for help.");
        if(theGobbling.getVisited()){
            game.nextPosition2 = "threeLittlePigs";
        }else{
            game.nextPosition2 = "";
        }
        gui.B3.setText("...");
        game.nextPosition3 = "";
        gui.B4.setText("...");
        game.nextPosition4 = "";
        pigginOut.setVisited(true);
    }
    
    public void theGobbling(){
        gui.gameTextArea.setText("You feel a rush of courage come over you as you wade through\n"
                + "to the front of the flock. When you get to the front you take her place on the hay bale.\n"
                + "\"She is right!\", you shout. \"Have none of you noticed that during this time of year\n"
                + "many of us go missing?\", a quiet gobbling starts to eminate from the crowd. \"We can either\n"
                + "sit around and pick our feathers or we can do something about it!\", the gobbling turns into a dull roar.\n"
                + "...You may have just started a revolution...");
        gui.B1.setText("Lead the charge to the farmhouse, though there's no real plan.");
        game.nextPosition1 = "farmHouseTurkey";
        gui.B2.setText("Watch the other turkeys as they charge toward the farmhouse.");
        game.nextPosition2 = "forTheGreaterGood";
        gui.B3.setText("Convince the flock to settle down, tell them you have a plan");
        game.nextPosition3 = "PigginOut";
        gui.B4.setText("...");
        game.nextPosition4 = "";
        theGobbling.setVisited(true);
    }
    
    public void forTheGreaterGood(){
        gui.gameTextArea.setText("You watch as your turkey bretheren make a valiant push to the farmhouse.\n"
                + "You know none will survive. You know Farmer Cole and his family will not survive. \n"
                + "After the wreckage settles,  ");
        gui.B1.setText("");
        game.nextPosition1 = "";
        gui.B2.setText("");
        game.nextPosition2 = "";
        gui.B3.setText("");
        game.nextPosition3 = "";
        gui.B4.setText("");
        game.nextPosition4 = "";
        reset();
        youLose.setVisited(true);
    }
    
    public void youDied1(){
        gui.gameTextArea.setText("They look at you kind of funny and shrug as much as pigs can shrug.\n"
                + "So you fly over the fence and join them. You are having so much fun that you don't notice\n"
                + "the largest pig rolling directly toward you...\n"
                + "...you feel 300 lbs of uncooked bacon smash you into the mud\n"
                + "YOU DIED.");
        gui.B1.setText("...");
        game.nextPosition1 = "barn";
        gui.B2.setText("...");
        game.nextPosition2 = "barn";
        gui.B3.setText("...");
        game.nextPosition3 = "barn";
        gui.B4.setText("...");
        game.nextPosition4 = "barn";
        reset();
        youDied1.setVisited(true);
    }
    //end of story methods
    
    //reset
    //sets all of the visited boolean values to false.
    public void reset(){
        barn.setVisited(Boolean.FALSE);
        turkeyTalk.setVisited(Boolean.FALSE);
        pigginOut.setVisited(Boolean.FALSE);
        seeTheLight.setVisited(Boolean.FALSE);
        theGobbling.setVisited(Boolean.FALSE);
        farmerChuck.setVisited(Boolean.FALSE);
        youDied1.setVisited(Boolean.FALSE);
        youEscaped.setVisited(Boolean.FALSE);
        bringYourFriends.setVisited(Boolean.FALSE);
        threeLittlePigs.setVisited(Boolean.FALSE);
        forTheGreaterGood.setVisited(Boolean.FALSE);
        youDied2.setVisited(Boolean.FALSE);
        youDied3.setVisited(Boolean.FALSE);
        farmHouse.setVisited(Boolean.FALSE);
        farmHouseTurkey.setVisited(Boolean.FALSE);
        farmHousePig.setVisited(Boolean.FALSE);
        farmHouseBoth.setVisited(Boolean.FALSE);
        youWin.setVisited(Boolean.FALSE);
        youLose.setVisited(Boolean.FALSE);
    }
}
