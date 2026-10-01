package lesson3;

public class classlight {
    public static void main(String[] args) {
        int lightspeed = 186000;
        long days = 1000;
        long seconds;
        long distance;

        seconds = days *24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.print("за " + days );
        System.out.print("днеи проидет около");
        System.out.println(distance + "миль. ");

    }




}
