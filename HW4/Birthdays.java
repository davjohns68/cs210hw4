// CS210 Assignment #4 "Birthdays"
// David Johnson
// This program asks for birthdays and prints out interesting information as well
// as comparing two dates

import java.util.*;
import java.text.*;
        
public class Birthdays {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter today's date (month day): ");
        int todayMonth = console.nextInt();
        int todayDate = console.nextInt();
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date year = new Date();
        String todayYear = dateFormat.format(year);
        int todayDayNum = getDayNum(todayMonth, todayDate);
        System.out.println("Today is " + todayMonth + "/" + todayDate + "/" + todayYear + ", day #" + todayDayNum + " of the year.\n");
        System.out.print("Please enter person #1's birthday (month day): ");
        int birthday1Month = console.nextInt();
        int birthday1Date = console.nextInt();
        int birthday1Distance = printBirthdayInfo(birthday1Month, birthday1Date, todayDayNum, todayYear);
        System.out.print("Please enter person #2's birthday (month day): ");
        int birthday2Month = console.nextInt();
        int birthday2Date = console.nextInt();
        int birthday2Distance = printBirthdayInfo(birthday2Month, birthday2Date, todayDayNum, todayYear);
        if (birthday1Distance < birthday2Distance) {
            System.out.println("Person #1's birthday is sooner.");
        } else if (birthday1Distance > birthday2Distance) {
            System.out.println("Person #2's birthday is sooner.");
        } else {
            System.out.println("Wow, you share the same birthday! ^_^");
        }
        System.out.println();
        printFunFact();
    }
    
    public static int printBirthdayInfo(int month, int day, int todayDayNum, String todayYear) {
        // This function gets information from the user and prints some interesting information
        int birthdayDayNum = getDayNum(month, day);
        System.out.println(month + "/" + day +  "/" + todayYear + " falls on day #" + birthdayDayNum + " of 365.");
        int days = 0;
        if (birthdayDayNum < todayDayNum) {
            days = 365 - todayDayNum + birthdayDayNum;
        } else if (birthdayDayNum > todayDayNum) {
            days = birthdayDayNum - todayDayNum;
        }
        if (days > 0) {
            System.out.println("Your next birthday is in " + days + " day(s)");
        } else {
            System.out.println("Happy Birthday! :)");
        }
        System.out.println();
        return days;
    }
    
    public static int getDayNum(int month, int day) {
        // This function computes the absolute day of the year (xxx of 365)
        int dayOfYear = 0;
        for (int i = 1; i < month; i++) {
            dayOfYear += getDaysInMonth(i);
        }
        dayOfYear += day;
        return dayOfYear;
    }
    
    public static int getDaysInMonth(int month) {
        //  This function takes a month as input and returns the number of days in the month
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 28;
        }
    }
    
    
    public static void printFunFact() {
        // This function prints out a random fact of something that happened on 5/19 throughout history
        String[] facts = {
            "639 – Ashina Jiesheshuai and his tribesmen assaulted Emperor Taizong at Jiucheng Palace.",
            "715 – Pope Gregory II is elected.",
            "1051 – Henry I of France is married to Anne of Kiev.",
            "1445 – John II of Castile defeats the Infantes of Aragon at the First Battle of Olmedo.",
            "1499 – Catherine of Aragon is married by proxy to Arthur, Prince of Wales. Catherine is 13 and Arthur is 12.",
            "1535 – French explorer Jacques Cartier sets sail on his second voyage to North America with three ships, 110 men, and Chief Donnacona's two sons (whom Cartier had kidnapped during his first voyage).",
            "1536 – Anne Boleyn, the second wife of Henry VIII of England, is beheaded for adultery, treason, and incest.",
            "1542 – The Prome Kingdom falls to the Taungoo Dynasty in present-day Burma.",
            "1568 – Queen Elizabeth I of England orders the arrest of Mary, Queen of Scots.",
            "1643 – Thirty Years' War: French forces under the duc d'Enghien decisively defeat Spanish forces at the Battle of Rocroi, marking the symbolic end of Spain as a dominant land power.",
            "1649 – An Act of Parliament declaring England a Commonwealth is passed by the Long Parliament. England would be a republic for the next eleven years.",
            "1655 – The Invasion of Jamaica begins during the Anglo-Spanish War.",
            "1743 – Jean-Pierre Christin developed the centigrade temperature scale.",
            "1749 – King George II of Great Britain grants the Ohio Company a charter of land around the forks of the Ohio River.",
            "1776 – American Revolutionary War: A Continental Army garrison surrenders in the Battle of The Cedars.",
            "1802 – Napoleon Bonaparte founds the Legion of Honour.",
            "1828 – U.S. President John Quincy Adams signs the Tariff of 1828 into law, protecting wool manufacturers in the United States.",
            "1845 – Captain Sir John Franklin and his ill-fated Arctic expedition depart from Greenhithe, England.",
            "1848 – Mexican–American War: Mexico ratifies the Treaty of Guadalupe Hidalgo thus ending the war and ceding California, Nevada, Utah and parts of four other modern-day U.S. states to the United States for US$15 million.",
            "1911 – Parks Canada, the world's first national park service, is established as the Dominion Parks Branch under the Department of the Interior.",
            "1917 – The Norwegian football club Rosenborg BK is founded.",
            "1919 – Mustafa Kemal Atatürk lands at Samsun on the Anatolian Black Sea coast, initiating what is later termed the Turkish War of Independence.",
            "1921 – The United States Congress passes the Emergency Quota Act establishing national quotas on immigration.",
            "1922 – The Young Pioneer Organization of the Soviet Union is established.",
            "1934 – Zveno and the Bulgarian Army engineer a coup d'état and install Kimon Georgiev as the new Prime Minister of Bulgaria.",
            "1942 – World War II: In the aftermath of the Battle of the Coral Sea, Task Force 16 heads to Pearl Harbor.",
            "1950 – A barge containing munitions destined for Pakistan explodes in the harbor at South Amboy, New Jersey, devastating the city.",
            "1950 – Egypt announces that the Suez Canal is closed to Israeli ships and commerce.",
            "1959 – The North Vietnamese Army establishes Group 559, whose responsibility is to determine how to maintain supply lines to South Vietnam; the resulting route is the Ho Chi Minh trail.",
            "1961 – Venera program: Venera 1 becomes the first man-made object to fly by another planet by passing Venus (the probe had lost contact with Earth a month earlier and did not send back any data).",
            "1961 – At Silchar Railway Station, Assam, 11 Bengalis die when police open fire on protesters demanding state recognition of Bengali language in the Bengali Language Movement.",
            "1962 – A birthday salute to U.S. President John F. Kennedy takes place at Madison Square Garden, New York City. The highlight is Marilyn Monroe's rendition of \"Happy Birthday\".",
            "1963 – The New York Post Sunday Magazine publishes Dr. Martin Luther King, Jr.'s Letter from Birmingham Jail.",
            "1971 – Mars probe program: Mars 2 is launched by the Soviet Union.",
            "1986 – The Firearm Owners Protection Act is signed into law by U.S. President Ronald Reagan.",
            "1991 – Croatians vote for independence in a referendum.",
            "1997 – The Sierra Gorda biosphere, the most ecologically diverse region in Mexico, is established as a result of grassroots efforts.",
            "2007 – President of Romania Traian Băsescu survives an impeachment referendum and returns to office from suspension.",
            "2010 – The Royal Thai Armed Forces concludes its crackdown on protests by forcing the surrender of United Front for Democracy Against Dictatorship leaders.",
            "2012 – Three gas cylinder bombs explode in front of a vocational school in the Italian city of Brindisi, killing one person and injuring five others.",
            "2012 – A car bomb explodes near a military complex in the Syrian city of Deir ez-Zor, killing nine people.",
            "2015 – The Refugio oil spill deposited 142,800 U.S. gallons (3,400 barrels) of crude oil onto an area in California considered one of the most biologically diverse coastlines of the west coast.",
            "2016 – EgyptAir Flight 804 crashes into the Mediterranean Sea while traveling from Paris to Cairo, killing all on board."
        };
        Random rand = new Random();
        int n = rand.nextInt(facts.length - 1);
        System.out.println("Did you know that on 5/19/" + facts[n]);
    }
}
