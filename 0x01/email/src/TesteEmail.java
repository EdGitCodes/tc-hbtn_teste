import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteEmail {

        static Pessoa pessoa;
        @Test
        public static void testar_email_com_arroba() {
            assertTrue(pessoa.emailValid("email_teste@dominio.com.br"));
        }

        @Test
        public static void testar_email_sem_arroba() {
            assertFalse(pessoa.emailValid("email_testedominio.com.br"));
        }

        @Test
        public static void testar_email_mais_50_caracteres() {
            assertEquals(false, pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br"));
        }

}
