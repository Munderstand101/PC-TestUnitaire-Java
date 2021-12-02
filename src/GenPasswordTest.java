import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenPasswordTest {

    private GenPassword genPw;

    @Before
    public void setUp(){
        this.genPw = new GenPassword();
    }

    @Test
    public void testGenPasswordNotNull(){
        assertNotNull("L'objet GenPassword n'a pas été correctement créé.", this.genPw);
    }

    @Test
    public void testGetNewPassword(){
        String pass1 = this.genPw.getNewPassword();
        String pass2 = this.genPw.getNewPassword(8);
        String pass = this.genPw.getPassword();


        assertTrue("Le mot de passe n'a pas ete 6 caracteres minimum", pass.length()>=6);
        assertTrue("Le mot de passe n'a pas ete 20 caracteres maximum", pass.length()<=20);

        Boolean maj = false;
        Boolean min = false;
        Boolean nb = false;

        for (char st: pass.toCharArray()) {
            if (Character.isUpperCase(st)){
                maj=true;
            }
            else {
                min=true;
            }
            if (Character.isDigit(st))
            {
                nb = true;
            }

        }




        assertTrue("Le mot de passe n'a pas de majuscules", maj==true);
        assertTrue("Le mot de passe n'a pas de minuscules", min==true);
        assertTrue("Le mot de passe n'a pas de nombre", nb==true);




        assertTrue("Le getNewPassword n'a pas ete initialiser correctement", pass1=="azertyu");
        assertTrue("Le getNewPassword(n) n'a pas ete initialiser correctement", pass2=="azertyu");
    }
}