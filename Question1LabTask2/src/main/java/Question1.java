

public class Question1 {

    int num;
    int arr[];
    public void initnum(int number){
        num = number;
    }
    public void initarr(int a[]){
        arr=a;
    }
    public String checkEvenOrOdd(){
        if(num%2 == 0 )
            return "Number is Even";
        else
            return "Number is Odd";
    }
    public String FindMaxAndMin() {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
            if (max < arr[i])
                max = arr[i];
        }
        return "Max is " + max + " and Min is " + min;
    }
}

