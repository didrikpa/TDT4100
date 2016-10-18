package oving2;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by didrikpa on 05.06.2016.
 */
public class Person {

    protected String firstName;
    protected String lastName;
    protected String email;
    protected char gender;
    protected Date birthday;
    protected String ssn;
    protected String[] landcodes = {"ad", "ae", "af", "ag", "ai", "al", "am", "ao", "aq", "ar", "as", "at", "au", "aw", "ax", "az", "ba", "bb", "bd", "be", "bf", "bg", "bh", "bi", "bj", "bl", "bm", "bn", "bo", "bq", "br", "bs", "bt", "bv", "bw", "by", "bz", "ca", "cc", "cd", "cf", "cg", "ch", "ci", "ck", "cl", "cm", "cn", "co", "cr", "cu", "cv", "cw", "cx", "cy", "cz", "de", "dj", "dk", "dm", "do", "dz", "ec", "ee", "eg", "eh", "er", "es", "et", "fi", "fj", "fk", "fm", "fo", "fr", "ga", "gb", "gd", "ge", "gf", "gg", "gh", "gi", "gl", "gm", "gn", "gp", "gq", "gr", "gs", "gt", "gu", "gw", "gy", "hk", "hm", "hn", "hr", "ht", "hu", "id", "ie", "il", "im", "in", "io", "iq", "ir", "is", "it", "je", "jm", "jo", "jp", "ke", "kg", "kh", "ki", "km", "kn", "kp", "kr", "kw", "ky", "kz", "la", "lb", "lc", "li", "lk", "lr", "ls", "lt", "lu", "lv", "ly", "ma", "mc", "md", "me", "mf", "mg", "mh", "mk", "ml", "mm", "mn", "mo", "mp", "mq", "mr", "ms", "mt", "mu", "mv", "mw", "mx", "my", "mz", "na", "nc", "ne", "nf", "ng", "ni", "nl", "no", "np", "nr", "nu", "nz", "om", "pa", "pe", "pf", "pg", "ph", "pk", "pl", "pm", "pn", "pr", "ps", "pt", "pw", "py", "qa", "re", "ro", "rs", "ru", "rw", "sa", "sb", "sc", "sd", "se", "sg", "sh", "si", "sj", "sk", "sl", "sm", "sn", "so", "sr", "ss", "st", "sv", "sx", "sy", "sz", "tc", "td", "tf", "tg", "th", "tj", "tk", "tl", "tm", "tn", "to", "tr", "tt", "tv", "tw", "tz", "ua", "ug", "um", "us", "uy", "uz", "va", "vc", "ve", "vg", "vi", "vn", "vu", "wf", "ws", "ye", "yt", "za", "zm", "zw"};

    protected void setName(String name){
        if(isValidName(name)){
            this.firstName = name.split(" ")[0];
            this.lastName = name.split(" ")[1];
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    protected String getName(){
        return this.firstName + " " + this.lastName;
    }

    protected boolean isValidName(String name){
        String[] names = name.split(" ");
        if(names.length == 2){
            if (names[0].matches("[a-zA-Z]+") && names[1].matches("[a-zA-Z]+")){
                if(name.length()>4){
                    return true;
                }
            }
        }
        return false;
    }

    protected void setEmail(String email){
        if (isValidEmail(email)){
            this.email = email;
        }
        else throw new IllegalArgumentException("Not a valid email.");

    }

    protected String getEmail(){
        return this.email;
    }

    protected boolean isValidEmail(String email){
        if(email.split("@").length == 2 && email.split("@")[1].split("\\.").length == 2){
                String emailname = email.split("@")[0];
                String landcode = email.split("@")[1].split("\\.")[1];
                if(isValidEmailName(emailname) && isValidLandcode(landcode)){
                    return true;
                }
        }
        return false;
    }

    protected boolean isValidEmailName(String emailname){
        return (emailname.equals(firstName.toLowerCase() + "." + lastName.toLowerCase()));
    }


    protected boolean isValidLandcode(String landcode){
        return Arrays.asList(landcodes).contains(landcode);

    }

    protected void setGender(char gender){
        if(gender == 'M' || gender == 'F' || gender == '\0'){
            this.gender = gender;
        }
        else throw new IllegalArgumentException("Not a valid gender");

    }

    protected char getGender(){
        return this.gender;
    }

    protected void setBirthday(Date birthday){
        Date today = new Date();
        if (birthday.before(today)){
            this.birthday = birthday;
        }
        else {
            throw new IllegalArgumentException();
        }

    }

    protected Date getBirthday(){
        return this.birthday;
    }



}
