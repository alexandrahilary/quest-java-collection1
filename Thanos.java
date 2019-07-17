import java.util.*;

public class Thanos {

    public static void main(String[] args) {
        Hero blackWidow = new Hero("Black Widow",34);
        Hero aptainAmerica = new Hero("Captain America",100);
        Hero vision = new Hero("Vision",3);
        Hero ironMan = new Hero("Iron Man",48);
        Hero scarletWitch = new Hero("Scarlet Witch",29);
        Hero thor = new Hero("Thor",1500);
        Hero spiderMan = new Hero("Spider-Man",18);
        Hero hulk = new Hero("Hulk",49);
        Hero doctorStrange = new Hero("Doctor Strange",42);


        ArrayList<Hero> heroes = new ArrayList<>();

        heroes.add(blackWidow);
        heroes.add(aptainAmerica);
        heroes.add(vision);
        heroes.add(ironMan);
        heroes.add(scarletWitch);
        heroes.add(thor);
        heroes.add(spiderMan);
        heroes.add(hulk);
        heroes.add(doctorStrange);

        thor.setAge(1501);

        Collections.shuffle(heroes);

        List<Hero> heroes2 = heroes.subList(0,heroes.size()/2);

        for(Hero hero : heroes2){
            System.out.println(hero.getName());
        }


    }
}