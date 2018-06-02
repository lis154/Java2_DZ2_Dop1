package com.company;

import java.io.EOFException;
import java.util.EmptyStackException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
	exepttionOnMassive();
    }

    public static void exepttionOnMassive()
    {
        Exception[] mass = new Exception[10];

        try{
            throw new ArithmeticException();
        }
        catch (ArithmeticException c)
        {
            mass[0] = c;
        }

        try{
            throw new EOFException();
        }
        catch (EOFException e)
        {
            mass[1] = e;
        }

        try{
            throw new EmptyStackException();
        }
        catch (EmptyStackException e)
        {
            mass[2] = e;
        }

        try{
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e)
        {
            mass[3] = e;
        }

        try{
            throw new IllegalMonitorStateException();
        }
        catch (IllegalMonitorStateException e)
        {
            mass[4] = e;
        }

        try{
            throw new IllegalStateException();
        }
        catch (IllegalStateException e)
        {
            mass[5] = e;
        }

        try{
            throw new IllegalThreadStateException();
        }
        catch (IllegalThreadStateException e)
        {
            mass[6] = e;
        }

        try{
            throw new IndexOutOfBoundsException();
        }
        catch (IndexOutOfBoundsException e)
        {
            mass[7] = e;
        }

        try{
            throw new NumberFormatException();
        }
        catch (NumberFormatException e)
        {
            mass[8] = e;
        }

        try{
            throw new NoSuchElementException();
        }
        catch (NoSuchElementException  e)
        {
            mass[9] = e;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(mass[i]);
        }
    }
}
