package TestScript;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import groovy.transform.Field;
import io.appium.java_client.android.AndroidDriver;

public class test extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		String line;
		//ProcessBuilder pb = new ProcessBuilder("adb devices");
		//Process pc = Runtime.getRuntime().exec("adb devices");
		Process pc1 = Runtime.getRuntime().exec("adb shell getprop ro.build.version.release");
		BufferedReader input = new BufferedReader(new InputStreamReader(pc1.getInputStream()));
		while((line=input.readLine()) !=null) {
			System.out.println(line);
		}
		System.out.println("Finish");
		//String deviceOs = AndroidDriver<WebElement>.
		

	}
	
	
	

}