/*
DATA: 12 Abril 2023

Nome: Levy Meireles Rodrigues dos Santos
RA: 057772
Turma: 5 SI

Nome: Hugo Joel Sosa Geisse
RA: 029230
Turma: 5 SI

Nome: João Vitor Teles Bonardi
RA: 194341
Turma: 1 EC

Nome: Victor Augusto Malaquias Hoffman
RA: 198462
Turma: 1 EC

Nome: Gabryel Meireles Rodrigues dos Santos
RA: 059202
Turma: 5 SI

Nome: Gustavo Santos de araujo
RA: 194578
Turma: 1 EC

Nome: Bruno de Oliveira
RA: 183152
Turma: 3 SI

Nome: Lucas Cardoso Rios
RA: 185793
Turma: 3 SI

Nome: Leonardo Ezequiel Sosa Geisse 
RA: 158467
Turma: 5 SI

Nome: Kayan Guerra 
RA: 056942
Turma: 7 SI
*/

package mascara.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


public class LimitaCaracteres extends PlainDocument{
    public enum TipoEntrada{
        NUMEROS,NUMEROS2,LETRAS,NUMEROSELETRAS;
    }
    private int Caracteres;
    private TipoEntrada  Entrada;
    
    public LimitaCaracteres(int Caracteres, TipoEntrada Entrada){
        this.Caracteres=Caracteres;
        this.Entrada=Entrada;
    }
    
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        if(string == null || getLength() == Caracteres){
            return;
        }
        int totalCarac = getLength() + string.length();
        
        String regex = "";
        switch(Entrada){
            case NUMEROS: regex = "[^0-9]*"; break;
            case NUMEROS2: regex = "[^0-6]*"; break;
            case LETRAS: regex = "[^A-Z ]*"; break;
            case NUMEROSELETRAS: regex = "[^A-Z0-9 ]*"; break;
        }
        string = string.replaceAll(regex, "");
        
        if(totalCarac <= Caracteres){
            super.insertString(i,string,as);
        }else{
            String nova = string.substring(0, Caracteres);
            super.insertString(i,string,as);
        }   
    }
}
