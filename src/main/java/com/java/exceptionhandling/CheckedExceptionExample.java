package com.java.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Compile time error example
// an example of checked exception, which is checked during compile time. If a method throws checked exception then it should be handled using try-catch
// block or declare checked exception using throws keyword
public class CheckedExceptionExample {
// to check : remove throws clause

        public static void main(String args[]) throws IOException {
            FileInputStream fis = null;
            /*This constructor FileInputStream(File filename)
             * throws FileNotFoundException which is a checked
             * exception
             */
            fis = new FileInputStream("B:/myfile.txt");
            int k;

            /* Method read() of FileInputStream class also throws
             * a checked exception: IOException
             */
            while(( k = fis.read() ) != -1)
            {
                System.out.print((char)k);
            }

            /*The method close() closes the file input stream
             * It throws IOException*/
            fis.close();
        }
    }

