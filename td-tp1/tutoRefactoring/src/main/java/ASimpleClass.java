import java.time.LocalDate;

public class ASimpleClass {

    public ASimpleClass() {
    }

    /**
     * Additionne firstParameter et secondParameter
     * @param firstParameter - premier paramètre
     * @param secondParameter - second paramètre
     * @return
     */
    public int addInt(int firstParameter, int secondParameter) {
        return firstParameter + secondParameter ;
    }

    public static void main(String[] args) {
        new ASimpleClass().addInt(1,2);

        System.out.println("Hello world");
        if (DateUtil.isDateBetween(LocalDate.now(), LocalDate.of(2024, 01, 01),
                                                    LocalDate.of(2024, 12, 31),true)){
            System.out.println("oui");
        }
        else{
            System.out.println("non");
        }
    }
}


