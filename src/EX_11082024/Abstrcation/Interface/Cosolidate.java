package EX_11082024.Abstrcation.Interface;

 public  class Cosolidate  implements  Suppliment,ChemicalRaw{

     @Override
     public void raw_material() {
         System.out.println("Raw material added here");
     }

     @Override
     public void baseSuppliment() {

         System.out.println("Base Matertial added here ");

     }

     void Merging (){

         raw_material();
         baseSuppliment();
         detined_material();
         nessesory();
     }
 }
