public class MadLibs {
    /*
    This program generates a mad libbed story.
    Author: Anton
    Date: 7/14/2024
    */
    public static void main(String[] args){
        String name1 = "Zane";

        String adjective1 = "running";
        String adjective2 = "smoking";
        String adjective3 = "digging";

        String verb1 = "feel";

        String noun1 = "house";
        String noun2 = "pen";
        String noun3 = "apple";
        String noun4 = "plugg";
        String noun5 = "water";
        String noun6 = "tree";

        String name2 = "Andrew";

        int number = 82;

        String place1 = "Mars";

        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}