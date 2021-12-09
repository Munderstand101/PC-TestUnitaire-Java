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
            if (pass.matches(".*[!@#$%&*()'+,-./:;<=>?\\[\\]^_`{|}].*"))
            {
                charx = true;
                break;
            }
        }

      //  assertTrue("Le mot de passe n'a pas de charactesres speciaux", charx==true);

    }

    @Test
    public void testGetNewPasswordNoSpaceChars () {
        String pass = this.genPw.getNewPassword(8);
        boolean charx = false;
        for (char aChar : pass.toCharArray()) {

            if (pass.matches(".*[\\s\\t\\n].*"))
            {
                charx = true;
                break;
            }
        }
        assertTrue("Le mot de passe ne contien pas d'espaces ni de tabulation ni de retour chariot", charx==false);

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



}