package maintest;

public class SmeStringRecordTest {
    
    static String inputRecord =  "FR, CID123, true, CID456, CDD, , , APROTYPE, NL, , , , , BR, Stevens Juridisch Advies, Stevens, Advies, , , , , , , , , 111120, , , , , , , , , , SLIM, ISB, , , , , LO, FTOF, , , , , , , FR, INFOGREF, 123456, SARL, false, Paris, , , 12345, FR, , , , , , , , , true, true, true, false, 2, false, false, , true, true, true, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , false, , CLEAN, false, false, , , , , , , TR_NEWCUST, , , , , 08, INDUND, , , , , , , , Avenue des Champs-Élysées, 26, 1000AB, Paris, FR, Avenue des Champs-Élysées, 26, 1000AB, Paris, FR, Avenue des Champs-Élysées, 26, 1000AB, Paris, FR, , , , , , true, true, true, false, false, true, true, true, 2020-02-12, false, false, true, false, true, true, false, true, true, false, true, true, false, true, true, true, 1, LR001, CID123, Dirk Arnaut Floris Willem Jan, StevensLR001, 1996-11-03, , NL, CLEAN, CLEAN, , , , , , , DID, ABC1234, 2015-11-03, 2019-11-03, Paris, FR, , , , , , , , , , , , , FTOF, Bataviastraat, 12, 1095EV, Amsterdam, NL, , , , , , , , , , , , , , , , , , , , , , , , , , true, true, true, true, 2, MP001, CID123, Willem, StevensMP001, 1996-11-03, NL, CLEAN, CLEAN, , , , , , , , , , , , , , , , , , , , , , , , , , Bataviastraat, 12, 1095EV, Amsterdam, NL, , , , , , , , , , , , , , , , , , , , , , , , , , CEO, true, true, , , MP002, CID123, Dirk, StevensMP002, 1996-11-03, NL, CLEAN, CLEAN, , , , , , , , , , , , , , , , , , , , , , , , , , Bataviastraat, 12, 1095EV, Amsterdam, NL, , , , , , , , , , , , , , , , , , , , , , , , , , CFO, true, true, , , 2, UBO001, CID123, Floris, StevensUBO001, 1996-11-03, NL, CLEAN, CLEAN, , , , , , , , , , , , , , , , , , , , , , , , , , Bataviastraat, 12, 1095EV, Amsterdam, NL, , , , , , , , , , , , , , , , , , , , , , , , , , , NL, Amsterdam, 30, true, true, , , , , SAL, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , UBO002, CID123, Dirk, StevensUBO002, 1996-11-03, NL, CLEAN, CLEAN, , , , , , , , , , , , , , , , , , , , , , , , , , Bataviastraat, 12, 1095EV, Amsterdam, NL, , , , , , , , , , , , , , , , , , , , , , , , , , , NL, Amsterdam, 30, true, true, , , , , SAL, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , 1, CID456, Stevens INC, Stevens, Trading, , , , , , , , , 100, Amsterdam, NL, NL, KVK, 123456, SAS, false, Amsterdam, true, true, true, true, CLEAN, , , , , , ";

    public static void main(String[] args) {

        String[] subRecords = inputRecord.split(",");
        
        System.out.println("Length of the record is - " + subRecords.length);
    }

}
