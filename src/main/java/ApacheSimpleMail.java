import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * Created by malex on 17.02.16.
 */
public class ApacheSimpleMail {

    public void sendTLS()
    {
        try {
            Email email = new SimpleEmail();
            email.setHostName("smtp.gmail.com");
            email.setSmtpPort(587);
            email.setAuthenticator(new DefaultAuthenticator("ykresp@gmail.com", "2687484a"));
            email.setTLS(true);
            email.setFrom("ykresp@gmail.com");
            email.setSubject("Мурка письмо");
            email.setMsg("public class ApacheSimpleMail {\n" +
                    "\n" +
                    "    public void sendTLS()\n" +
                    "    {\n" +
                    "        try {\n" +
                    "            Email email = new SimpleEmail();\n" +
                    "            email.setHostName(\"smtp.gmail.com\");\n" +
                    "            email.setSmtpPort(587);\n" +
                    "            email.setAuthenticator(new DefaultAuthenticator(\"ykresp@gmail.com\", \"2687484a\"));\n" +
                    "            email.setTLS(true);\n" +
                    "            email.setFrom(\"ykresp@gmail.com\");\n" +
                    "            email.setSubject(\"Мурка письмо\");\n" +
                    "            email.setMsg(\"I love you!!! Myr! \");\n" +
                    "            email.addTo(\"anna.kovalek@gmail.com\");\n" +
                    "            email.send();\n" +
                    "        } catch (EmailException ex) {\n" +
                    "            ex.printStackTrace();\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "\n" +
                    "    public static void main(String[] args)\n" +
                    "    {\n" +
                    "        ApacheSimpleMail simpleMail = new ApacheSimpleMail();\n" +
                    "        simpleMail.sendTLS();\n" +
                    "    }\n" +
                    "}" + "\n" +"    <dependencies>\n" +
                    "        <dependency>\n" +
                    "            <groupId>org.apache.commons</groupId>\n" +
                    "            <artifactId>commons-email</artifactId>\n" +
                    "            <version>1.2</version>\n" +
                    "        </dependency>\n" +
                    "\n" +
                    "    </dependencies>"+ "\n" +"https://javatalks.ru/topics/20877" + "\n" +"https://support.google.com/accounts/answer/6010255");
            email.addTo("anna.kovalek@gmail.com");
            email.send();
        } catch (EmailException ex) {
            ex.printStackTrace();
        }
    }


    public static void main(String[] args)
    {
        ApacheSimpleMail simpleMail = new ApacheSimpleMail();
        simpleMail.sendTLS();
    }
}
