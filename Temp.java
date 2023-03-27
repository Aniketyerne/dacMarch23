/*OUTPUT:_

F:\CPOS\Assignment\Aniket Yerne\Assignment1>javac Temp.java

F:\CPOS\Assignment\Aniket Yerne\Assignment1>java Temp
Tempreture in °Celcius is 62.0°C after converting to °ferenhite is 94.0°F
Tempreture in °Ferenhite is 62.0°F after converting to °Celcius is 16.666666°C
*/
class Temp{
public static void main(String aregs[])
{
float a=62.00F;
float f=((9/5)*a)+32;
float d=((a-32)*5)/9;
System.out.println("Tempreture in °Celcius is "+a+"°C"+" after converting to °ferenhite is "+ f+"°F");
System.out.println("Tempreture in °Ferenhite is "+a+"°F"+" after converting to °Celcius is "+ d+"°C");
}


}
