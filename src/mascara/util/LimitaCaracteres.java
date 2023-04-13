
package mascara.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


public class LimitaCaracteres extends PlainDocument{
    public enum TipoEntrada{
        NUMEROS,LETRAS,NUMEROSELETRAS;
    }
    private int qtdCaracteres;
    private TipoEntrada  tpEntrada;
    
    public LimitaCaracteres(int qtdCaracteres, TipoEntrada tpEntrada){
        this.qtdCaracteres=qtdCaracteres;
        this.tpEntrada=tpEntrada;
    }
    
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        if(string == null || getLength() == qtdCaracteres){
            return;
        }
        int totalCarac = getLength() + string.length();
        
        String regex = "";
        switch(tpEntrada){
            case NUMEROS: regex = "[^0-9]*"; break;
            case LETRAS: regex = "[^A-Z ]*"; break;
            case NUMEROSELETRAS: regex = "[^A-Z0-9 ]*"; break;
        }
        string = string.replaceAll(regex, "");
        
        if(totalCarac <= qtdCaracteres){
            super.insertString(i,string,as);
        }else{
            String nova = string.substring(0, qtdCaracteres);
            super.insertString(i,string,as);
        }   
    }
}
