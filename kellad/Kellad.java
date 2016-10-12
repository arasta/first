/*
 * Selles failis tuleb igal pool asendada kaldkriipsudest koosnevad read
 * sobiliku javadoc kommentaariga. Seej2rel genereerida javadoc ja
 * kontrollida, et poleks t2itmata j22nud lahtreid.
 */

/**
 * Peameetodit sisaldav silumisklass. Siin pole muud, kui ainult main-meetod. 
 *@author Arnika
 *@version 0.1
*/
public class Kellad { // peameetodit sisaldav silumisklass
   
   /**
    * Peameetod. Siit algab rakenduse täitmine. 
    * @param s käsurealt etteantud tekst
   */
   public static void main (String[] s) {
      Kell k = new KaeKell ("Rolex");
      System.out.println (((KaeKell)k).mark 
         + " " + k.jooksevAeg());
      Mobla m = new Mobla (25612345);
      System.out.println (String.valueOf (m.number)
         + " " + m.jooksevAeg());
   } // main

} // Kellad

/**
* Liides. Kirjeldab oskust aega näidata. 
*/
interface Ajanaitaja { // liides, mis kirjeldab oskust aega n2idata

   /**
    * Võtab seadmest jooksva kellaaja. Erinevad seadmed võivad seda erinevalt vormindada.
    *@return jooksev aeg tekstina
    */
   String jooksevAeg(); // tagastab jooksva kellaaja stringina

} // Ajanaitaja

/**
 * Klass mis kirjeldab kella omadusi. Annab Kellale omaduse aega näidata. 
 * @version 0.7alpha
 */
class Kell implements Ajanaitaja {

   /**
    * Kellaaeg Date-klassi abil. 
    * @return Näitab kuupäeva ja kellaaega.
    */
   public String jooksevAeg() {
      return new java.util.Date().toString();
   } // jooksevAeg

} // Kell

/**
 * Klass Käekell pärib omadusi teiselt klassilt. Annab Käekellale Kella omadused (aja näitamine). 
 */
class KaeKell extends Kell {

   /**
    * Käekella mark. Väljastab, mis marki see käekell on. 
    */
   String mark; // kaekelladel peame meeles ka marki

   /**
    * Konstruktor. Kellale määratakse, mis mark see on. 
    * @param s Kella mark
    */
   KaeKell (String s) {
      mark = s;
   } // konstruktor

} // KaeKell

/**
 * Uue klassi loomine. Luuakse klass Telefon. 
 */
class Telefon {

   /**
    * Määrab ära, et telefoni number on täisarv.
    */
   int number; // telefoninumber

   /**
    * Konstruktor. Omastab telefonile numbri. 
    */
   Telefon (int n) {
      number = n;
   } // konstruktor

} // Telefon

/**
 * Klass Mobla pärib klass Telefoni omadused. Mobla saab Telefoni omaduse nädata aega. 
 */
class Mobla extends Telefon implements Ajanaitaja {

   /**
    * Määrab Moblale sisemise kella. 
    */
   private Kell sisemineKell; // moblasse sisseehitatud kell

   /**
    * Konstruktor. 
    */
   Mobla (int n) {
      super (n);
      sisemineKell = new Kell();
   } // konstruktor

   /**
    *
    */
   public String jooksevAeg() {
      return sisemineKell.jooksevAeg();
   } // jooksevAeg

} // Mobla

// faili l6pp

