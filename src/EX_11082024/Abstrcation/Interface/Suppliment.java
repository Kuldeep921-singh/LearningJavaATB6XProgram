package EX_11082024.Abstrcation.Interface;

public interface Suppliment {

    void baseSuppliment();

    default void nessesory(){

        System.out.println("Hard suppliment ");
    }
}
