/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sortings;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author anahernandez
 */
public class Principal {
    public static void main (String[] args) throws IOException
    {
        File logFile = new File("");
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(logFile));
            writer.write("");
        }
        finally
        {
            writer.close();
        }
    }
}
