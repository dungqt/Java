package exercise;

import java.io.IOException;
import java.sql.SQLException;
import java.util.StringTokenizer;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo extends Thread{

    public void readInput(){
        try {
            int x = System.in.read();
            System.out.println("x la : "+ (char)x);
        }
        catch (IOException i ){
            i.printStackTrace();
        }

    }

    public static void main(String[] args) {

        new Demo().readInput();

    }

}
