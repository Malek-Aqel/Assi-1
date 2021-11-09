package com.example.assignment1;

public class goalKepper {

    private String name;
    private String description;
    private int imageID;



    public static final goalKepper[] goalKeppers = {
            new goalKepper("Vector Valdes", "Víctor Valdés Arribas (born 14 January 1982) is a Spanish football coach and former professional player, who played as a goalkeeper. Valdés was considered fiercely competitive and demanding, he demonstrated great mental strength and concentration to be alert during long spells of ball domination, and was superb at one-on-ones.\n" +
                    "\n" +
                    "He spent most of his professional career with Barcelona in La Liga, and is regarded as one of the best goalkeepers in the club's history, having appeared in 535 official games for the club and won 21 major titles, notably six La Liga titles and three UEFA Champions League championships. Valdés also won the Zamora Trophy a record five times. He currently holds the club records as goalkeeper with most appearances in the league and in official competition, breaking Andoni Zubizarreta's records during the 2011–12 season. After leaving Barcelona at the end of his contract in July 2014, he joined Manchester United in January 2015. He played rarely at United, and after a brief loan at Standard Liège, he moved on to Middlesbrough. After being released by Middlesbrough at the end of the 2016–17 season, Valdés retired from professional football.\n" +
                    "\n" +
                    "Valdés made his full international debut in 2010 and earned 20 international caps. He was part of the Spain squads which won the 2010 FIFA World Cup and UEFA Euro 2012, and also finished second at the 2013 FIFA Confederations Cup.", R.drawable.vector),
            new goalKepper("Ter Shtegen", "Marc-André ter Stegen (born 30 April 1992) is a German professional footballer who plays as a goalkeeper for La Liga club Barcelona and the Germany national team. Known for his reflexes, passing, and ball-playing ability, he is considered one of the best goalkeepers in the world.\n" +
                    "\n" +
                    "After four seasons in the Bundesliga with Borussia Mönchengladbach, making 108 league appearances, he joined Barcelona for €12 million in 2014. He won the treble in his first season in Spain, playing for Barcelona in Copa del Rey and UEFA Champions League.\n" +
                    "\n" +
                    "Ter Stegen represented Germany at several youth levels and made his senior international debut in 2012. He was part of the German squads that reached the semi-finals of UEFA Euro 2016 and won the 2017 FIFA Confederations Cup, and was also a member of the German side that took part at the 2018 FIFA World Cup.\n" +
                    "\n" +
                    "On 19 May 2014, Ter Stegen was announced as the new goalkeeper of Spanish club Barcelona, with Chilean goalkeeper Claudio Bravo, after the departures of Víctor Valdés and José Manuel Pinto, effective during the summer transfer window. On 22 May 2014, he signed a five-year contract that would keep him at the club until June 2019. The transfer fee was €12 million (£9.7 million), and the buy-out clause was set to €80 million (£63.6 million). After the move, Ter Stegen said joining the club was the right move and that he aimed to settle at the club.\n" +
                    "\n" +
                    "Ter Stegen sufferred an injury prior to the first league match of the season. Due to this injury, Barcelona manager Luis Enrique made Bravo the starting league goalkeeper, where he would go on to win the Zamora Trophy. Ter Stegen, ended up not playing at all in Barca's victorious league campaign Ter Stegen, however, was made the first-choice goalkeeper in both the Copa del Rey matches and in the UEFA Champions League. He made his debut in the latter tournament on 17 September, keeping a clean sheet in a 1–0 home win over APOEL. He helped Barcelona win the final of the domestic cup, Copa Del Rey, in his first season, a 3–1 victory against Athletic Bilbao on 30 May 2015. A week later, he played in the Champions League Final at the Olympiastadion in Berlin, a 3–1 win over Juventus. He won the \"Best Save\" award for his spectacular \"goal-line\" save against Bayern Munich, in the second leg of the Champions League semi-final.", R.drawable.ter),
            new goalKepper("Claudio Bravo", "Claudio Andrés Bravo Muñoz (born 13 April 1983) is a Chilean professional footballer who plays as a goalkeeper for La Liga club Real Betis and captains the Chile national team.\n" +
                    "\n" +
                    "He started playing with Colo-Colo and moved to Real Sociedad in 2006, appearing in 237 official games with the latter club. Barcelona signed him for €12 million in 2014, and he won the treble and the Zamora Trophy in his first season. In the summer of 2016, he moved to Manchester City, where he won several titles. After four years in England, he returned to Spain, signing for Real Betis.\n" +
                    "\n" +
                    "Bravo is Chile's joint second-most capped player with 139 total appearances, behind only Alexis Sánchez. He represented the nation in two World Cups, a FIFA Confederations Cup, and six Copa América tournaments. He captained his side to victory at the 2015 and 2016 editions of the latter competition.\n" +
                    "\n" +
                    "Bravo joined FC Barcelona on 25 June 2014, with the four-year deal[15] being made effective on 1 July for a reported €12 million (£9.7 million) fee, the fourth most expensive player ever sold by Real Sociedad after Darko Kovačević, Xabi Alonso and Asier Illarramendi, becoming the second Chilean to ever play for the club after Alexis Sánchez and succeeding Víctor Valdés as the first-choice. After joining, he set a Spanish League record for the club of not conceding from the start of season for 754 minutes, previously held by Pedro María Artola with 560 minutes; the streak was broken when he conceded his first goal of the season from the penalty spot to Cristiano Ronaldo in a 1–3 defeat to Real Madrid at the Santiago Bernabéu.\n" +
                    "\n" +
                    "After playing 37 straight league games, Bravo was rested for the last game of the campaign against Deportivo de La Coruña, with Jordi Masip starting instead. Bravo was named as the goalkeeper in the La Liga Team of the Season as one of six Barcelona players, including three of his defenders. He won the Zamora for the best goals against average in the competition, conceding 19 times for an average of 0.51, 0.47 off the all-time record by Francisco Liaño of Deportivo in 1994.\n" +
                    "\n" +
                    "After Marc-André ter Stegen was preferred for Barcelona's wins in the year's Copa del Rey, UEFA Champions League and UEFA Super Cup, Bravo made his cup debut for the team as they won the 2015 FIFA Club World Cup, keeping clean sheets in their 3–0 wins over Guangzhou Evergrande and River Plate in Japan. Interviewed by Esport3 on the subject of the rotation, he said \"If I were to say that I'm taking it well, I would be lying, but I accept it\".", R.drawable.bravo)
    };




    private goalKepper(String name, String description, int imageID){
        this.name = name;
        this.description = description;
        this.imageID = imageID;
    }
    public String getName(){return name;}
    public String getDescription(){return description;}
    public int getImageID(){return imageID;}

    @Override
    public String toString(){return name;}
}
