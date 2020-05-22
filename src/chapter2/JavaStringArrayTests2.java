package chapter2;

public class JavaStringArrayTests2 {


    {



        String[] describeOla1 = {"strong", "hardworking", "resilient", "intelligent", "beautiful", "kind", "driven"};
         String[] describeOla2 = {"amiable", "energetic", "generous", "honest", "calm", "optimistic", "passionate",
                "resourceful", "versatile"};
        String[] describeOla3 = {"thoughtful", "independent", "determined", "dynamic"};

        //To find out how many words are in each list and save this number as listLength
        int listLength1 = describeOla1.length;
        int listLength2 = describeOla2.length;
        int listLength3 = describeOla3.length;

        //generate 3 random numbers
        int rand1 = (int) (Math.random() * listLength1);
// the words in the string are now being seen as numbers
        //take a random number from that list
        int rand2 = (int) (Math.random() * listLength2);
        int rand3 = (int) (Math.random() * listLength3);

// Now build a phrase

        String phrase = describeOla1[rand1] + " " + describeOla2[rand2] + " " + describeOla3[rand3];
        for (String s: describeOla1)
        {
            System.out.println(s);
        }
        {
            new JavaStringArrayTests2();
        }
    }


}