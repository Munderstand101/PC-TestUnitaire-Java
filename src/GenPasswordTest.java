import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GenPasswordTest {

    private GenPassword genPw;
    private String pass;

    @Before
    public void setUp() {
        this.genPw = new GenPassword();
        this.pass = this.genPw.getPassword();
    }

    @Test
    public void testGenPasswordNotNull() {
        assertNotNull("L'objet GenPassword n'a pas été correctement créé.", this.genPw);
    }

    @Test
    public void testGetNewPasswordTailleMini() {
        String pass = this.genPw.getNewPassword(8);
        assertTrue("Le mot de passe n'a pas ete 6 caracteres minimum", pass.length() >= 6);
    }

    @Test
    public void testGetNewPasswordTailleMaxi() {
        String pass = this.genPw.getNewPassword(8);
        assertTrue("Le mot de passe n'a pas ete 20 caracteres maximum", pass.length() <= 20);
    }

    @Test
    public void testGetNewPasswordMaj() {
        String pass = this.genPw.getNewPassword(8);
        boolean maj = false;
        //solution 1
        for (char aChar : pass.toCharArray()) {
            if (Character.isUpperCase(aChar)) {
                maj = true;
                break;
            }
        }
        //solution 2
        for (int i = 0; i< pass.length(); i++){
            if (Character.isUpperCase(pass.charAt(i))){
                maj = true;
                break;
            }
        }
        assertTrue("Le mot de passe n'a pas de majuscules", maj==true);
       // assertTrue("Pas de maj", maj == true);
    }

    @Test
    public void testGetNewPasswordMin () {
        String pass = this.genPw.getNewPassword(8);
        boolean min = false;

        for (char aChar : pass.toCharArray()) {
            if (Character.isLowerCase(aChar)) {
                min = true;
                break;
            }
        }

        assertTrue("Le mot de passe n'a pas de minuscules", min==true);
      //  assertTrue("Pas de min", min == true);
    }

    @Test
    public void testGetNewPasswordDigit () {
        String pass = this.genPw.getNewPassword(8);
        boolean digit = false;

        //
        for (char aChar : pass.toCharArray()) {
            if (Character.isDigit(aChar))
            {
                digit = true;
                break;
            }
        }

        assertTrue("Le mot de passe n'a pas de nombre", digit==true);

    }

    @Test
    public void testGetNewPasswordNoSpecialChars () {
        String pass = this.genPw.getNewPassword(8);
        boolean charx = false;

        for (char aChar : pass.toCharArray()) {
            if (pass.matches(".*[!@#$%&*()'+,\\-./:;<=>?\\[\\]^_`{|}].*"))
            {
                charx = true;
                break;
            }
        }

        assertTrue("Le mot de passe n'a pas de charactesres speciaux", charx==true);

    }

    @Test
    public void testGetNewPasswordNoSpaceChars () {
        String pass = this.genPw.getNewPassword(8);
        assertFalse("Le mot de passe ne contien pas d'espaces ni de tabulation ni de retour chariot", pass.matches(".*[\\s\\t\\n].*"));
    }

    @Test
    public void testGetNewPasswordNoQuoteChars () {
        String pass = this.genPw.getNewPassword(8);
        boolean charx = false;

        for (char aChar : pass.toCharArray()) {

            if (pass.matches(".*['`\"].*"))
            {
                charx = true;
                break;
            }
        }
        assertTrue("Le mot de passe ne contien pas de quote anglaise '' ou d'apostrophe '", charx==false);

    }

    @Test
    public void testGetNewPasswordTailleX() {
        String pass = this.genPw.getNewPassword(8);
        assertTrue("Le mot de passe n'a pas 8 caracteres", pass.length() == 8);
    }

//Helyoo
    @Test
    public void testGetNewPasswordXcaracteresdifferents(){
        String pass = this.genPw.getNewPassword(8);

        String uniqueLetters ="";

        for(char aChar:pass.toCharArray()){
            if(!uniqueLetters.contains(String.valueOf(aChar))){
                uniqueLetters += String.valueOf(aChar);
            }
        }

        assertTrue("Pas assez de caractères differents", uniqueLetters.length()>(pass.length()-2));

    }

    @Test
    public void testGetNewPassword2CharConsec(){
        this.genPw = new GenPassword();
        pass = this.genPw.getPassword();

        int length = pass.length();
        System.out.println(pass);

        String a = "";
        String b = "";
        System.out.println(a);
        System.out.println(b);
        int res = 0;
        for(int i =0 ; i < length-2 ; i ++){
            a = pass.substring(i,i+1);
            System.out.println(a);
            b = pass.substring(i+1,i+2);
            System.out.println(b);
            System.out.println("----");
            if(a.equals(b)){
                res = 1;
                System.out.println("--------------");

            }
        }
        assertTrue("eee", res==1);

    }
}