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

        for (pass:char c) {
            if (c.isUpperCase()){

            }

        }
        assertTrue("Le mot de passe n'a pas ete 20 caracteres maximum", pass.length()<=20);



        assertTrue("Le getNewPassword n'a pas ete initialiser correctement", pass1=="azertyu");
        assertTrue("Le getNewPassword(n) n'a pas ete initialiser correctement", pass2=="azertyu");
    }
}