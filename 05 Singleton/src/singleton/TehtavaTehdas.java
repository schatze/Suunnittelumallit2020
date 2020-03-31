/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Osku
 */
public class TehtavaTehdas {
    private static TehtavaTehdas instannsi = new TehtavaTehdas( );

   private TehtavaTehdas() {
   
   }

   public static TehtavaTehdas getInstance( ) {
      return instannsi;
   }

   public static ITehtava haeTehtava( String tehtavaTyyppi ) {
      switch (tehtavaTyyppi) {
          case "vaikea":
              return new VaikeaTehtava();
          
          case "helppo":
              return new HelppoTehtava();
          
          default:
              return null;
      }
   }
}
