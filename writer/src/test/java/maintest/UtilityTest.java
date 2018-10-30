package maintest;

import util.Utility;

public class UtilityTest {
    
    private static final String DOT = ".";
    
    private static final String BACK_SLASH = "\\";
    
    public static void main(String[] s) {
        System.out.println(Utility.getTimeStamp());
        System.out.println(Utility.getDateTimeStamp());
        passwordEncoder();
        testStringSplitting();
    }
    
    private static final void testStringSplitting() {
        String input = "ST.current.CDD.LO.BCIS.KYC.TEST.PI.IR.NL";
        String[] output = input.split(BACK_SLASH + DOT);
        System.out.println(output);
    }
    
    private static final void passwordEncoder() {
        String camelFileName = "BATCHPRIVKYC-AU-ITG_TEST-0f6c6e-20180724";
        System.out.println(" Country suffix  " + camelFileName.split("-")[1]);
    }
}
