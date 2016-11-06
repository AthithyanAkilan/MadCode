
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author athithyan
 */
public class StringToFile {
     public static boolean writeFile(String textBox)
    {
        // TODO code application logic here
        boolean bool = false;
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("/home/athithyan/NetBeansProjects/Geek/HackthonIELTS/testPro/test.c"));
            writer.write(textBox);
        } catch (IOException e) {
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
            }
        }
        try {
            writer = new BufferedWriter(new FileWriter("/home/athithyan/NetBeansProjects/Geek/HackthonIELTS/testPro/test.cpp"));
            writer.write(textBox);

        } catch (IOException e) {
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
            }
        }
        try {
            writer = new BufferedWriter(new FileWriter("/home/athithyan/NetBeansProjects/Geek/HackthonIELTS/testPro/test.java"));
            writer.write(textBox);

        } catch (IOException e) {
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
            }
        }
        try {
            writer = new BufferedWriter(new FileWriter("/home/athithyan/NetBeansProjects/Geek/HackthonIELTS/testPro/test.rb"));
            writer.write(textBox);

        } catch (IOException e) {
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
            }
        }
        try {
            writer = new BufferedWriter(new FileWriter("/home/athithyan/NetBeansProjects/Geek/HackthonIELTS/testPro/test.py"));
            writer.write(textBox);
            bool = true;

        } catch (IOException e) {
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
            }
        }
     return bool;
    }
    
}
