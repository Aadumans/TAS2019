/*
 * @(#)Practice.java
 *
 * Copyright  Andris Adumans Riga, Latvia. All rights reserved.
 */

public class Practice {

    public String isItMyBirthday (int month, int day){
        if ( month == 11 && day == 11) return "Yes";
        else if (month == 11 && day ==12) return "Yesterday";
        else if (month == 11 && day == 10) return "Tomorrow";
        else if (day >31 || day <=0) return "Wrong Day";
        else if (month >12 || month <=0) return "Wrong Month";




        else return "No";
    }
}
