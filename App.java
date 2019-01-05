package cn.smileyan.cage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.github.cage.Cage;
import com.github.cage.GCage;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws FileNotFoundException {
    	Cage cage = new GCage();
        OutputStream os = new FileOutputStream("d://captcha.jpg", false);
        try {
			String token = cage.getTokenGenerator().next().substring(0,4);
			System.out.println("token=="+token);
			cage.draw(token, os);
		} catch (IOException e) {
			e.printStackTrace();
		}
        
    }
}
