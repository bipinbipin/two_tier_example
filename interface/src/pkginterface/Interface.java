/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkginterface;

//import java.lang.*;

/**
 *
 * @author bipin
 */
public class Interface implements CharSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Interface ifc = new Interface();
        
        System.out.println(reverseString("this is a long piece of text that will be reversed"));
        System.out.println(reverseStringUsingStringBuilder("this is a long piece of text that will be reversed"));
    }

    public static String reverseString(String s) {
        
        char[] c = new char[s.length()];
        
        //reversed = Character.toString(s.charAt(s.length()-1));
        //System.out.println(s.length());
        for(int i=0; i < s.length(); i++) {
            
            c[i] = s.charAt(s.length()-(i+1));
            //System.out.println(s.charAt(s.length()-(i+1)));
        }
        
        String reversed = new String(c);
        
        return reversed;
    }
    
    public static String reverseStringUsingStringBuilder(String s) {
        StringBuilder strbld = new StringBuilder(s);
        
        return strbld.reverse().toString();
    }
    @Override
    public int length() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char charAt(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
