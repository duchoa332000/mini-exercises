package com.exercise1;

import java.util.Date;
import java.util.List;

public class GSMCallHistoryTest {
    public static void main(String[] args) {
        //defining instance of clas GSM
        GSM gsm = new GSM("Oppo Reno", "Oppo", 500, "Lisa", new Battery("model11", 30, 10), new Display(5, 113));

        //add few calls
        gsm.addingCalls(new Call(new Date(), "0556561515", 120));
        gsm.addingCalls(new Call(new Date(), "0556571385", 33));
        gsm.addingCalls(new Call(new Date(), "0365656131", 51));
        gsm.addingCalls(new Call(new Date(), "0465284972", 12));
        gsm.addingCalls(new Call(new Date(), "0465284972", 250));
        gsm.addingCalls(new Call(new Date(), "0776521656", 150));
        for (Call calls : gsm.getCallHistory()) {
            System.out.printf(" \nDate: " + calls.getDate() + " \nDialed Phone Number: " +
                    calls.getDialedPhoneNumber() + ". Duration: " + calls.getDuration());
        }

        // Assuming that the price per minute is 0.37. calculate and print the total price of the calls in the history.
        double pricePerMinute = 0.37;
        double price;
        price = gsm.calculatesTotalPrice(pricePerMinute);
        System.out.printf("\nTotal price : " + price);

        //Remove the longest call from the history
        int index = longestCall(gsm.getCallHistory());
        gsm.deletingCalls(index);
        System.out.println("\nRemove the longest call: ");

        //calculate the total price again
        price = gsm.calculatesTotalPrice(pricePerMinute);
        System.out.printf("Total price for calls: " + price);

        // Clearing list off calls
        gsm.clearingCalls();
        System.out.println("\nClearing: " + gsm.getCallHistory());
    }

    private static int longestCall(List<Call> call) {
        int result = 0;
        int duration = 0;
        for (int i = 0; i < call.size(); i++) {
            if (call.get(i).getDuration() > duration) {
                duration = call.get(i).getDuration();
                result = i;
            }
        }
        return result;


    }

}

