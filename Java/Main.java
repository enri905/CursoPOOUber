class Main {
    public static void main (string []
    args) {

System.out.println
("Inicializando...");
System.out.println("Car....");
Car car = new Car ("AMQ123", new 
Account("Andres Loiza", "ADN1235", "andresl@hotmail.com", "12365"));
car.passenger = 4;
car.printDatacar();

System.out.println("Uberx....");
UberX uberx = new UberX ("MKL185", new Account ("Maria Loyola", "JKL12365", 
"marial@hotmail.com", "125478"), "Toyota", "Corolla");

System.out.println("UberPool");
UberPool UberPool = new UberPool ("JGL345", new Account ("Mario Ernesto", "MFT90567", 
"mario17@hotmail.com", "503479"), "Toyota", "CAMRRY");

System.out.println("UberBlack");
UberBlack UberBlack = new UberBlack ("TPD897", new Account ("Adonay Martinez", "LPD32478", 
"adonay25@hotmail.com", "874632"), "Toyota", "HILUX");

System.out.println("UberVan");
UberVan UberVan = new UberVan ("WTR798", new Account ("David Campos", "JRT57863", 
"campos21@hotmail.com", "546789"), "Toyota", "Corolla");

}