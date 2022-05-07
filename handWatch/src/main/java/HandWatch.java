public class HandWatch {
    String state = "Normal";
    String innerState = "Time";
    int min=0,h=0,d=1,mon=1,y=2001;
    public String checkInput(char input){
        switch(state){
            case "Normal":
                if (input == 'c')
                    state = "Update";
                else if(input == 'b')
                    state = "Chime_Alarm_Set";
                else if (input == 'a')
                    if(innerState == "Time")
                        innerState = "Date";
                    else
                        innerState = "Time";
            case "Update":
                if (input == 'd')
                    state = "Normal";
                else if (input == 'a')
                    if(innerState == "min"){
                        innerState = "hour";
                        min++;
                    }
                    else if (innerState == "hour")
                    {   innerState = "day";
                    h++;
                    }
                    else if (innerState == "day")
                    {
                        innerState = "month";
                        d++;
                    }
                    else if(innerState == "month")
                    {
                        innerState = "year";
                        mon++;
                    }
                    else if(innerState == "year"){
                        state = "Normal";
                        y++;
                    }
            case "Chime_Alarm_Set":
                if (input == 'd')
                    state = "Normal";
                else if (input == 'a')
                    if(innerState == "Alarm")
                        innerState = "Chime";
        }
        return "Outer state is "+state+" and inner state is "+ innerState;
    }

    public String DisplayDate() {
        //print Y+"-"+M+"-"+D
        return y + " - " + mon + " - "+ d;
    }
    public String DisplayTIME() {
        //print h+":"+m
       return h + " : "+ min;
    }
}
