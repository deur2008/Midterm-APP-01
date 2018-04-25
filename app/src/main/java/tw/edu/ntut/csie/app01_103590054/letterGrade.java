package tw.edu.ntut.csie.app01_103590054;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */

public class letterGrade {
    public String letterGrade(int score)
    {
        String grade = "";
        if(score > 100)                     grade = "X";
        else if(score >= 90 && score <= 100) grade = "A";
        else if(score >= 80 && score <= 89)  grade = "B";
        else if(score >= 70 && score <= 79)  grade = "C";
        else if(score >= 60 && score <= 69)  grade = "D";
        else if(score >= 0 && score <= 59)   grade = "F";
        else if(score < 0)                  grade = "X";
        return grade;
    }
}
