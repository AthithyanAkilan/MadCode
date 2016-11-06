/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author athithyan
 */
public class CheckForJCompilation {

    /**
     * @param args the command line arguments
     */
    public static boolean[] check() {
        boolean[] compileStatus = new boolean[5];
        try {
            int k = Laj.runProcess("javac /home/athithyan/NetBeansProjects/Geek/HackthonIELTS/testPro/test.java");
            if (k == 0) {
                compileStatus[0] = true;
            } else {
                compileStatus[0] = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            int k = Laj.runProcess("cc /home/athithyan/NetBeansProjects/Geek/HackthonIELTS/testPro/test.c");
            if (k == 0) {
                compileStatus[1] = true;
            } else {
                compileStatus[1] = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            int k = Laj.runProcess("g++ /home/athithyan/NetBeansProjects/Geek/HackthonIELTS/testPro/test.cpp");
            if (k == 0) {
                compileStatus[2] = true;
            } else {
                compileStatus[2] = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            int k = Laj.runProcess("python /home/athithyan/NetBeansProjects/Geek/HackthonIELTS/testPro/test.py");
            if (k == 0) {
                compileStatus[3] = true;
            } else {
                compileStatus[3] = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
  
        try {
            int k = Laj.runProcess("ruby /home/athithyan/NetBeansProjects/Geek/HackthonIELTS/testPro/test.rb");
            if (k == 0) {
                compileStatus[4] = true;
            } else {
                compileStatus[4] = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(boolean bool:compileStatus)
            System.out.println(bool);
        return compileStatus;
    }

}

