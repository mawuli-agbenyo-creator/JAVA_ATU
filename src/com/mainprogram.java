package com;

import java.util.Scanner;

public class mainprogram {
    public static void main(String[] args) {
        double priceOneShirt;
        double priceAPairofPants;
        double priceOneDress;
        String CustomerName, homePhone;
        int numberofshirts, numberOfPants, numberOfDresses;
        double subTotalShirts, subTotalPants, subTotalDresses;
        double totalOrder;
        short orderMonth, orderDay, orderYear;

        final double discountRate = 0.15;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Eryam Retail Servie");
        System.out.print("Please enter customer's name: ");
        CustomerName = sc.nextLine();
        System.out.print("Please enter customer's home phone number: ");
        homePhone = sc.next();

        //input price details
        System.out.print("\nEnter the price of one shirt: ");
        priceOneShirt = sc.nextDouble();
        System.out.print("Enter price for a pair of pants: ");
        priceAPairofPants = sc.nextDouble();
        System.out.print("Enter the price of one dress: ");
        priceOneDress = sc.nextDouble();
        System.out.print("\nEnter number of shirts bought: ");
        numberofshirts = sc.nextInt();
        System.out.print("Enter number of pants bought: ");
        numberOfPants = sc.nextInt();
        System.out.print("Enter number of dresses bought: ");
        numberOfDresses = sc.nextInt();


        //input calander details
        System.out.println("\nEnter details of transaction data below");
        System.out.println("*********************************************************");
        System.out.print("Enter month number");









    }
}
