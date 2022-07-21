package com.exercise1;

public class GMSTest {
    public static void main(String[] args) {
        /**
         *Create an array of few instances of the GSM class.
         */
        GSM[] listOfGSM = {
                new GSM("N97-1243", "Nokia", 300, "Hoa", new Battery("NK-9712Y/12", 20, 5, BatteryType.batteryType.NiCd), new Display(3, 123)),
                new GSM("SAM-J832", "Samsung", 450, "Joe", new Battery("SM-J812/31", 11, 33, BatteryType.batteryType.NiMH), new Display(4, 15)),
                new GSM("IP-14025", "Iphone", 900, "Jack", new Battery("IP-AP142/45", 31, 40, BatteryType.batteryType.Li_Ion), new Display(1, 33)),
                new GSM("OPP-5632", "Oppo", 600, "Rosa", new Battery("OP-RE21/14", 64, 57, BatteryType.batteryType.NiMH), new Display(5, 1))
        };
        for (GSM gsm : listOfGSM) {
            System.out.println(gsm);
            System.out.println("_______________________________________________________");
        }

    }
}
