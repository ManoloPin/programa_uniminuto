package ascii;

import CARACTERES.*;
import interfas.*;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class Ascii {

    public static void main(String[] args) {
        try {
            interfaz Interfaz = new interfaz();
            Interfaz.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        Scanner tec = new Scanner(System.in);
//        System.out.println("instrucciones: \n"
//                + "1. si se busca en numero ASCII los primeros 10 numeros se ingresa un (0) = (cero) antes del numero\n"
//                + "2. solo ingresar una obcion ya sea Binario, ASCII, Ó simbolo");
//        System.out.println("");
//
//        System.out.println("ingrese binario, numero ASCII ó simbolo a buscar");
//        String binario = tec.next();
//        imprimibles im = new imprimibles();
//        CONTROL ct = new CONTROL();
//
//        ct.control(binario);
//        im.imprimibles(binario);

        /*

        if (let == "00100010") {
        letasc = letasc + '"';
        }
        if (let == "00100011") {
        letasc = letasc + '#';
        }
        if (let == "00100100") {
        letasc = letasc + '$';
        }
        if (let == "00100101") {
        letasc = letasc + '%';
        }
        if (let == "00100110") {
        letasc = letasc + '&';
        }
        if (let == "00100111") {/////////////////////////////////////////////////////////////////////////////////////////////////////////
        letasc = letasc + ''';
        }
        if (let == "00101000") {
        letasc = letasc + '(';
        }
        if (let == "00101001") {
        letasc = letasc + ')';
        }
        if (let == "00101010") {
        letasc = letasc + '*';
        }
        if (let == "00101011") {
        letasc = letasc + '+';
        }
        if (let == "00101100") {
        letasc = letasc + ',';
        }
        if (let == "00101101") {
        letasc = letasc + '-';
        }
        if (let == "00101110") {
        letasc = letasc + '.';
        }
        if (let == "00101111") {
        letasc = letasc + '/';
        }
        if (let == "00111010") {
        letasc = letasc + ':';
        }
        if (let == "00111011") {
        letasc = letasc + ';';
        }
        if (let == "00111100") {
        letasc = letasc + '<';
        }
        if (let == "00111101") {
        letasc = letasc + '=';
        }
        if (let == "00111110") {
        letasc = letasc + '>';
        }
        if (let == "00111111") {
        letasc = letasc + '?';
        }
        if (let == "01000000") {
        letasc = letasc + '@';
        }
        if (let == "01011011") {
        letasc = letasc + '[';
        }
        if (let == "01011100") { ////////////////////////////////////////////////////////////////////////////////////
        letasc = letasc + '\';
        }
        if (let == "01011101") {
        letasc = letasc + ']';
        }
        if (let == "01011110") {
        letasc = letasc + '^';
        }
        if (let == "01011111") {
        letasc = letasc + '_';
        }
        if (let == "01100000") {
        letasc = letasc + '`';
        }
        if (let == "01111011") {
        letasc = letasc + '{';
        }
        if (let == "01111100") {
        letasc = letasc + '|';
        }
        if (let == "01111101") {
        letasc = letasc + '}';
        }
        if (let == "01111110") {
        letasc = letasc + '~';
        }
        if (let == "10000000") {
        letasc = letasc + '€';
        }
        if (let == "10100001") {
        letasc = letasc + '¡';
        }
        if (let == "10100010") {
        letasc = letasc + '¢';
        }
        if (let == "10100011") {
        letasc = letasc + '£';
        }
        if (let == "10100100") {
        letasc = letasc + '¤';
        }
        if (let == "10100101") {
        letasc = letasc + '¥';
        }
        if (let == "10100110") {
        letasc = letasc + '¦';
        }
        if (let == "10100111") {
        letasc = letasc + '§';
        }
        if (let == "10100111") {
        letasc = letasc + '¨';
        }
        if (let == "10101001") {
        letasc = letasc + '©';
        }
        if (let == "10101010") {
        letasc = letasc + 'ª';
        }
        if (let == "10101011") {
        letasc = letasc + '«';
        }
        if (let == "10101100") {
        letasc = letasc + '¬';
        }
        if (let == "10101101") {
        letasc = letasc + '­';
        }
        if (let == "10101110") {
        letasc = letasc + '®';
        }
        if (let == "10101111") {
        letasc = letasc + '¯';
        }
        if (let == "10110000") {
        letasc = letasc + '°';
        }
        if (let == "10110001") {
        letasc = letasc + '±';
        }
        if (let == "10110010") {
        letasc = letasc + '²';
        }
        if (let == "10110011") {
        letasc = letasc + '³';
        }
        if (let == "10110100") {
        letasc = letasc + '´';
        }
        if (let == "10110101") {
        letasc = letasc + 'µ';
        }
        if (let == "10110110") {
        letasc = letasc + '¶';
        }
        if (let == "10110111") {
        letasc = letasc + '·';
        }
        if (let == "10111000") {
        letasc = letasc + '¸';
        }
        if (let == "10111001") {
        letasc = letasc + '¹';
        }
        if (let == "10111010") {
        letasc = letasc + 'º';
        }
        if (let == "10111011") {
        letasc = letasc + '»';
        }
        if (let == "10111100") {
        letasc = letasc + '¼';
        }
        if (let == "10111101") {
        letasc = letasc + '½';
        }
        if (let == "10111110") {
        letasc = letasc + '¾';
        }
        if (let == "10111111") {
        letasc = letasc + '¿';
        }
        if (let == "11000000") {
        letasc = letasc + 'À';
        }
        if (let == "11000001") {
        letasc = letasc + 'Á';
        }
        if (let == "11000010") {
        letasc = letasc + 'Â';
        }
        if (let == "11000011") {
        letasc = letasc + 'Ã';
        }
        if (let == "11000100") {
        letasc = letasc + 'Ä';
        }
        if (let == "11000101") {
        letasc = letasc + 'Å';
        }
        if (let == "11000110") {
        letasc = letasc + 'Æ';
        }
        if (let == "11000111") {
        letasc = letasc + 'Ç';
        }
        if (let == "11001000") {
        letasc = letasc + 'È';
        }
        if (let == "11001001") {
        letasc = letasc + 'É';
        }
        if (let == "11001010") {
        letasc = letasc + 'Ê';
        }
        if (let == "11001011") {
        letasc = letasc + 'Ë';
        }
        if (let == "11001100") {
        letasc = letasc + 'Ì';
        }
        if (let == "11001101") {
        letasc = letasc + 'Í';
        }
        if (let == "11001110") {
        letasc = letasc + 'Î';
        }
        if (let == "11001111") {
        letasc = letasc + 'Ï';
        }
        if (let == "11010000") {
        letasc = letasc + 'Ð';
        }
        if (let == "11010001") {
        letasc = letasc + 'Ñ';
        }
        if (let == "11010010") {
        letasc = letasc + 'Ò';
        }
        if (let == "11010011") {
        letasc = letasc + 'Ó';
        }
        if (let == "11010100") {
        letasc = letasc + 'Ô';
        }
        if (let == "11010101") {
        letasc = letasc + 'Õ';
        }
        if (let == "11010110") {
        letasc = letasc + 'Ö';
        }
        if (let == "11010111") {
        letasc = letasc + '×';
        }
        if (let == "11011000") {
        letasc = letasc + 'Ø';
        }
        if (let == "11011001") {
        letasc = letasc + 'Ù';
        }
        if (let == "11011010") {
        letasc = letasc + 'Ú';
        }
        if (let == "11011011") {
        letasc = letasc + 'Û';
        }
        if (let == "11011100") {
        letasc = letasc + 'Ü';
        }
        if (let == "11011101") {
        letasc = letasc + 'Ý';
        }
        if (let == "11011110") {
        letasc = letasc + 'Þ';
        }
        if (let == "11011111") {
        letasc = letasc + 'ß';
        }
        if (let == "11100000") {
        letasc = letasc + 'à';
        }
        if (let == "11100001") {
        letasc = letasc + 'á';
        }
        if (let == "11100010") {
        letasc = letasc + 'â';
        }
        if (let == "11100011") {
        letasc = letasc + 'ã';
        }
        if (let == "11100100") {
        letasc = letasc + 'ä';
        }
        if (let == "11100101") {
        letasc = letasc + 'å';
        }
        if (let == "11100110") {
        letasc = letasc + 'æ';
        }
        if (let == "11100111") {
        letasc = letasc + 'ç';
        }
        if (let == "11101000") {
        letasc = letasc + 'è';
        }
        if (let == "11101001") {
        letasc = letasc + 'é';
        }
        if (let == "11101010") {
        letasc = letasc + 'ê';
        }
        if (let == "11101011") {
        letasc = letasc + 'ë';
        }
        if (let == "11101100") {
        letasc = letasc + 'ì';
        }
        if (let == "11101101") {
        letasc = letasc + 'í';
        }
        if (let == "11101110") {
        letasc = letasc + 'î';
        }
        if (let == "11101111") {
        letasc = letasc + 'ï';
        }
        if (let == "11110000") {
        letasc = letasc + 'ð';
        }
        if (let == "11110001") {
        letasc = letasc + 'ñ';
        }
        if (let == "11110010") {
        letasc = letasc + 'ò';
        }
        if (let == "11110011") {
        letasc = letasc + 'ó';
        }
        if (let == "11110100") {
        letasc = letasc + 'ô';
        }
        if (let == "11110101") {
        letasc = letasc + 'õ';
        }
        if (let == "11110110") {
        letasc = letasc + 'ö';
        }
        if (let == "11110111") {
        letasc = letasc + '÷';
        }
        if (let == "11111000") {
        letasc = letasc + 'ø';
        }
        if (let == "11111001") {
        letasc = letasc + 'ù';
        }
        if (let == "11111010") {
        letasc = letasc + 'ú';
        }
        if (let == "11111011") {
        letasc = letasc + 'û';
        }
        if (let == "11111100") {
        letasc = letasc + 'û';
        }
        if (let == "11111101") {
        letasc = letasc + 'ý';
        }
        if (let == "11111110") {
        letasc = letasc + 'þ';
        }
        if (let == "11111111") {
        letasc = letasc + 'ÿ';
        }*/
    }

}
