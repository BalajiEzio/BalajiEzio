package annatations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {
	@DataProvider() // We have to give the dataprovider a name and we have to call it by this name
	// wherever we want
public String[][] Getdata() {
String Data[][] = new String[2][2]; // We have to declare data provider as string of arrays
Data[0][0] = "9629848589"; // Email 1
Data[0][1] = "qwerty";  // pass 1
Data[1][0] = "8778172853"; // email 2
Data[1][1] = "9092047883"; //Pass 2
return Data; // We have to return the data type as string of Arrays
}
}
