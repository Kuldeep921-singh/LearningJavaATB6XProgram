package EX_11082024.Abstrcation.Interface;

public interface ChemicalRaw {

    void raw_material();

    default  void detined_material(){
        System.out.println("this material is already defined ");
    }
}
