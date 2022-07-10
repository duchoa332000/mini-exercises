package com.exercise2;

/**
 * Define class Worker derived from Human with new property WeekSalary and WorkHoursPerDay and method MoneyPerHour()
 * that returns money earned by hour by the worker.
 */
public class Worker extends Human {

    private double weekSalary;
    private double workHoursPerDay;

    // number of working day in one week
    private static final int WORKING_DAY_PER_WEEK = 5;
    // number of working hour in one day
    private static final int WORKING_HOUR_PER_DAY = 8;

    /**
     * Constructor
     *
     * @param firstName
     * @param lastName
     * @param weekSalary
     * @param workHoursPerDay
     */
    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.weekSalary = weekSalary;
        this.workHoursPerDay = workHoursPerDay;
    }

    /**
     * Calculate money per hour
     *
     * @return
     */
    public double calculateMoneyPerHour(double weekSalary) {
        double moneyPerDay = weekSalary / WORKING_DAY_PER_WEEK;
        return moneyPerDay / WORKING_HOUR_PER_DAY;
    }

}
