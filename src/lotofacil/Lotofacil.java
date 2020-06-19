package lotofacil;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSpan;
import com.gargoylesoftware.htmlunit.html.HtmlTable;
import com.gargoylesoftware.htmlunit.html.HtmlTableCell;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Lotofacil {

    public String data;
    public String conc;
    public String result;
    //public String 

    public void Loteria() {
        try {
            //Mensagem inicial
            JOptionPane.showMessageDialog(null, "Aguarde processo em execusão...");

            java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
            java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);

            CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));
            String URL = "http://www.loterias.caixa.gov.br/wps/portal/loterias/landing/lotofacil";
            WebClient webClient = new WebClient(BrowserVersion.CHROME);
            HtmlPage page = webClient.getPage(URL);
            webClient.getOptions().setJavaScriptEnabled(true);
            webClient.waitForBackgroundJavaScript(9000);
            //Faz isso aqui = Lotofácil - Loterias | Caixa 
            System.out.println(page.getTitleText());
            //Pega e exibe o link
            System.out.println(page.getUrl().toString());

            List<HtmlElement> spans = page.getBody().getElementsByAttribute("span", "class", "ng-binding");
            HtmlSpan concurso = (HtmlSpan) spans.get(0);
            //tipo um for
            conc = concurso.getTextContent().replaceAll("\\s+", " ").trim();
            //Exibe concurso apagar
            System.out.println(conc);

            List<Long> resultados = new ArrayList();
            List<HtmlElement> lista = page.getBody().getElementsByAttribute("table", "class", "simple-table lotofacil");
            HtmlTable tabela = (HtmlTable) lista.get(0);
            List<HtmlTableCell> cells = tabela.getBodies().get(0).getElementsByAttribute("td", "ng-repeat", "dezena in resultadoLinha");
            cells.forEach(cell -> resultados.add(Long.parseLong(cell.getTextContent())));
            result = resultados.toString();
            
            //exibe os números
            

            List<HtmlElement> division = page.getBody().getElementsByAttribute("div", "class", "resultado-loteria");
            List<HtmlElement> paragrafos = division.get(0).getElementsByAttribute("p", "class", "ng-binding");
            data = paragrafos.get(0).getTextContent().trim();
            data = "Data do próximo sorteio: ".concat(data.substring((data.length() - 10), data.length()));
            System.out.println(data);
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, E);
        }

    }

    public String pegaData()
    {
        return data;
    }
    
    public String pegaConcurso(){
        return conc;
    }
    
    public String pegaResultado(){
        return result;
    }
    
}
