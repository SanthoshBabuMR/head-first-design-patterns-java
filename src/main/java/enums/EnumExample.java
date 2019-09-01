package enums;

enum INDIAN_STATES {
    ANDHRA_PRADESH("AP"),
    TELENGANA("TE"),
    TAMILNADU("TN"),
    KERALA("KE"),
    KARNATAKA("KA"),
    MADHYA_PRADESH("MP");

    private String code;
    INDIAN_STATES(String code) {
        this.code = code;
    }
    @Override
    public String toString() {
        return this.code;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        INDIAN_STATES[] indian_states = INDIAN_STATES.values();
        for(INDIAN_STATES state: indian_states) {
            String out = String.format("%d: state: %s, state.toString(): %s", state.ordinal()+1, state, state.toString());
            System.out.println(out);
        }
        System.out.println(INDIAN_STATES.KERALA.equals(INDIAN_STATES.valueOf("KERALA")));
        System.out.println(INDIAN_STATES.KERALA.equals(INDIAN_STATES.valueOf("MADHYA_PRADESH")));
        System.out.println(indian_states[0].getDeclaringClass());
        System.out.println(indian_states[1].getClass());
    }
}
