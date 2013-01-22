/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VandC;
public class VowelCons {
    private int numVowels = 0, numCons = 0, a;
    private String string;
    
    public VowelCons(){
        
    }
    public VowelCons(String str){
        this.string = str;
        this.countVowelsAndCons();
    }
    public int getNumVowels(){
        return numVowels;
    }
    public int getNumConsonants(){
        return numCons;
    }
    private boolean isVowel(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
    private boolean isConsonant(char c) {
        return ((c >= 'a' && c <= 'z') && !isVowel(c));
    }
    private void countVowelsAndCons(){
        a = string.length();
        for (int i = 0; i < a; i++){
            if (this.isVowel(string.charAt(i))){
                numVowels++;
            }
            else if (this.isConsonant(string.charAt(i))){
                numCons++;
            }
        }
    }    
}
