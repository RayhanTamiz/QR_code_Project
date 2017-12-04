package com.company;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;


public class Rayhan {
    static String  binarytodecimal(String x)
    {
        BigInteger in=new BigInteger(x);
        BigInteger pw=new BigInteger("1");
        BigInteger inputbs=new BigInteger("10");
        BigInteger bs=new BigInteger("2");
        BigInteger zerro =new BigInteger("0");
        BigInteger res=new BigInteger("0");
        while(true)
        {
            if(in.compareTo(zerro)==0)
                break;
            BigInteger rem=in.remainder(inputbs);
            in=in.divide(inputbs);
            rem=rem.multiply(pw);
            res=res.add(rem);
            pw=pw.multiply(bs);
        }
        String ans=res.toString();

        return ans;


    }
    static String  Decimaltobinary(String x)
    {
        BigInteger in=new BigInteger(x);
        BigInteger pw=new BigInteger("1");
        BigInteger inputbs=new BigInteger("10");
        BigInteger bs=new BigInteger("2");
        BigInteger zerro =new BigInteger("0");
        BigInteger res=new BigInteger("0");
        while(true)
        {
            if(in.compareTo(zerro)==0)
                break;
            BigInteger rem=in.remainder(bs);
            in=in.divide(bs);
            rem=rem.multiply(pw);
            System.out.println(rem);
            res=res.add(rem);
            pw=pw.multiply(inputbs);
        }
        String ans=res.toString();
        return ans;

    }


    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);

        String x;
        x=sc.next();
        String binary= binarytodecimal(x);
        String Reverse=Decimaltobinary(binary);
        System.out.println("Binary to decimal is : "+binary+ "\nDecimal to binary is  : "+Reverse);


    }

}