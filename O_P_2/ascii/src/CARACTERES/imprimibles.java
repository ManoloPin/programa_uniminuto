package CARACTERES;

import javax.swing.JTextField;

/**
 *
 * @author manuel
 */
public class imprimibles {

    public String imprimibles(String binario) {
        String imprimible= new String();
        // CARACTERES ASCII IMPRIMIBLES ;
        if ("00100000".equals(binario)|| "32".equals(binario)|| "ESPACIO".equals(binario)) {
            System.out.println("Binario   = 00100000");
            System.out.println("Decimal   = 32");
            System.out.println("ASCII     = ESPACIO");
        }
        if ("00100001".equals(binario)|| "33".equals(binario)|| "!".equals(binario)) {
            System.out.println("Binario   = 00100001");
            System.out.println("Decimal   = 33");
            System.out.println("ASCII     = !");
        }
        if ("00100010".equals(binario)|| "34".equals(binario)|| "\"".equals(binario)) {
            System.out.println("Binario   = 00100010");
            System.out.println("Decimal   = 34");
            System.out.println("ASCII     = \" "); // uso \ para que no se generen dos (") comillas
        }
        if ("00100011".equals(binario)|| "35".equals(binario)|| "#".equals(binario)) {
            System.out.println("Binario   = 00100011");
            System.out.println("Decimal   = 35");
            System.out.println("ASCII     = #");
        }
        if ("00100100".equals(binario)|| "36".equals(binario)|| "$".equals(binario)) {
            System.out.println("Binario   = 00100100");
            System.out.println("Decimal   = 36");
            System.out.println("ASCII     = $");
        }
        if ("00100101".equals(binario)|| "37".equals(binario)|| "%".equals(binario)) {
            System.out.println("Binario   = 00100101");
            System.out.println("Decimal   = 37");
            System.out.println("ASCII     = %");
        }
        if ("00100110".equals(binario)|| "38".equals(binario)|| "&".equals(binario)) {
            System.out.println("Binario   = 00100110");
            System.out.println("Decimal   = 38");
            System.out.println("ASCII     = &");
        }
        if ("00100111".equals(binario)|| "39".equals(binario)|| "'".equals(binario)) {
            System.out.println("Binario   = 00100111");
            System.out.println("Decimal   = 39");
            System.out.println("ASCII     = ' ");
        }
        if ("00101000".equals(binario)|| "40".equals(binario)|| "(".equals(binario)) {
            System.out.println("Binario   = 00101000");
            System.out.println("Decimal   = 40");
            System.out.println("ASCII     = ( ");
        }
        if ("00101001".equals(binario)|| "41".equals(binario)|| ")".equals(binario)) {
            System.out.println("Binario   = 00101001");
            System.out.println("Decimal   = 41");
            System.out.println("ASCII     = ) ");
        }
        if ("00101010".equals(binario)|| "42".equals(binario)|| "*".equals(binario)) {
            System.out.println("Binario   = 00101010");
            System.out.println("Decimal   = 42");
            System.out.println("ASCII     = * ");
        }
        if ("00101011".equals(binario)|| "43".equals(binario)|| "+".equals(binario)) {
            System.out.println("Binario   = 00101011");
            System.out.println("Decimal   = 43");
            System.out.println("ASCII     = + ");
        }
        if ("00101100".equals(binario)|| "44".equals(binario)|| ",".equals(binario)) {
            System.out.println("Binario   = 00101100");
            System.out.println("Decimal   = 44");
            System.out.println("ASCII     = , ");
        }
        if ("00101101".equals(binario)|| "45".equals(binario)|| "-".equals(binario)) {
            System.out.println("Binario   = 00101101");
            System.out.println("Decimal   = 45");
            System.out.println("ASCII     = - ");
        }
        if ("00101110".equals(binario)|| "46".equals(binario)|| ".".equals(binario)) {
            System.out.println("Binario   = 00101110");
            System.out.println("Decimal   = 46");
            System.out.println("ASCII     = . ");
        }
        if ("00101111".equals(binario)|| "47".equals(binario)|| "/".equals(binario)) {
            System.out.println("Binario   = 00101111");
            System.out.println("Decimal   = 47");
            System.out.println("ASCII     = / ");
        }
        if ("00110000".equals(binario)|| "48".equals(binario)|| "0".equals(binario)) {
            System.out.println("Binario   = 00110000\n"
                              +"Decimal   = 48\n"
                              +"ASCII     = 0 ");
        }
        if ("00110001".equals(binario)|| "49".equals(binario)|| "1".equals(binario)) {
            System.out.println("Binario   = 00110001\n"
                              +"Decimal   = 49\n"
                              +"ASCII     = 1 ");
        }
        if ("00110010".equals(binario)|| "50".equals(binario)|| "2".equals(binario)) {
            System.out.println("Binario   = 00110010\n"
                              +"Decimal   = 50\n"
                              +"ASCII     = 2 ");
        }
        if ("00110011".equals(binario)|| "51".equals(binario)|| "3".equals(binario)) {
            System.out.println("Binario   = 00110011\n"
                              +"Decimal   = 51\n"
                              +"ASCII     = 3 ");
        }
        if ("00110100".equals(binario)|| "52".equals(binario)|| "4".equals(binario)) {
            System.out.println("Binario   = 00110100\n"
                              +"Decimal   = 52\n"
                              +"ASCII     = 4 ");
        }
        if ("00110101".equals(binario)|| "53".equals(binario)|| "5".equals(binario)) {
            System.out.println("Binario   = 00110101\n"
                              +"Decimal   = 53\n"
                              +"ASCII     = 5 ");
        }
        if ("00110110".equals(binario)|| "54".equals(binario)|| "6".equals(binario)) {
            System.out.println("Binario   = 00110110\n"
                              +"Decimal   = 54\n"
                              +"ASCII     = 6 ");
        }
        if ("00110111".equals(binario)|| "55".equals(binario)|| "7".equals(binario)) {
            imprimible =("Binario   = 00110111\n"
                              +"Decimal   = 55\n"
                              +"ASCII     = 7 ");
        }
        if ("00111000".equals(binario)|| "56".equals(binario)|| "8".equals(binario)) {
            imprimible =("Binario   = 00111000\n"
                              +"Decimal   = 56\n"
                              +"ASCII     = 8 ");
        }
        if ("00111001".equals(binario)|| "57".equals(binario)|| "9".equals(binario)) {
            imprimible =("Binario   = 00111001\n"
                              +"Decimal   = 57\n"
                              +"ASCII     = 9 ");
        }
        if ("00111010".equals(binario)|| "59".equals(binario)|| ":".equals(binario)) {
            imprimible =("Binario   = 00111010\n"
                              +"Decimal   = 58\n"
                              +"ASCII     = : ");
        }
        if ("00111011".equals(binario)|| "60".equals(binario)|| ";".equals(binario)) {
            imprimible =("Binario   = 00111011\n"
                             + "Decimal   = 59\n"
                             + "ASCII     = ; ");
        }
        if ("00111100".equals(binario)|| "61".equals(binario)|| "<".equals(binario)) {
            imprimible =("Binario   = 00111100\n"
                             + "Decimal   = 60\n"
                             + "ASCII     = < ");
        }
        if ("00111101".equals(binario)|| "62".equals(binario)|| "=".equals(binario)) {
            imprimible =("Binario   = 00111101\n"
                             + "Decimal   = 61\n"
                             + "ASCII     = = ");
        }
        if ("00111110".equals(binario) || "62".equals(binario)|| ">".equals(binario)) {
            imprimible =("Binario   = 00111110\n"
                             + "Decimal   = 62\n"
                             + "ASCII     = > ");
        }
        if ("00111111".equals(binario) || "63".equals(binario)|| "?".equals(binario)) {
            imprimible =("Binario   = 00111111\n"
                             + "Decimal   = 63\n"
                             + "ASCII     = ? ");
        }//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if ("01000000".equals(binario) || "64".equals(binario)|| "@".equals(binario)) {
            imprimible =("Binario   = 01000000\n"
                             + "Decimal   = 64\n"
                             + "ASCII     = @ ");
        }
        if ("01000001".equals(binario) || "65".equals(binario)|| "A".equals(binario)) {
            imprimible =("Binario   = 01000001\n"
                             + "Decimal   = 65\n"
                             + "ASCII     = A ");
        }
        if ("01000010".equals(binario) || "66".equals(binario)|| "B".equals(binario)) {
            imprimible =("Binario   = 01000010\n"
                             + "Decimal   = 66\n"
                             + "ASCII     = B ");
        }
        if ("01000011".equals(binario) || "67".equals(binario)|| "C".equals(binario)) {
            imprimible =("Binario   = 01000011\n"
                             + "Decimal   = 67\n"
                             + "ASCII     = C ");
        }
        if ("01000100".equals(binario) || "68".equals(binario)|| "D".equals(binario)) {
            imprimible =("Binario   = 01000100\n"
                             + "Decimal   = 68\n"
                             + "ASCII     = D ");
        }
        if ("01000101".equals(binario) || "69".equals(binario)|| "E".equals(binario)) {
            imprimible =("Binario   = 01000100\n"
                             + "Decimal   = 69\n"
                             + "ASCII     = E ");
        }
        if ("01000110".equals(binario) || "70".equals(binario)|| "F".equals(binario)) {
            imprimible =("Binario   = 01000110\n"
                             + "Decimal   = 70\n"
                             + "ASCII     = F ");
        }
        if ("01000111".equals(binario) || "71".equals(binario)|| "G".equals(binario)) {
            imprimible =("Binario   = 01000111\n"
                             + "Decimal   = 71\n"
                             + "ASCII     = G ");
        }
        if ("01001000".equals(binario) || "72".equals(binario)|| "H".equals(binario)) {
            imprimible =("Binario   = 01001000\n"
                             + "Decimal   = 72\n"
                             + "ASCII     = H ");
        }
        if ("01001001".equals(binario) || "73".equals(binario)|| "I".equals(binario)) {
            imprimible =("Binario   = 01001001\n"
                             + "Decimal   = 73\n"
                             + "ASCII     = I ");
        }
        if ("01001010".equals(binario) || "74".equals(binario)|| "J".equals(binario)) {
            imprimible =("Binario   = 01001010\n"
                             + "Decimal   = 74\n"
                             + "ASCII     = J ");
        }
        if ("01001011".equals(binario) || "75".equals(binario)|| "K".equals(binario)) {
            imprimible =("Binario   = 01001011\n"
                             + "Decimal   = 75\n"
                             + "ASCII     = K ");
        }
        if ("01001100".equals(binario) || "76".equals(binario)|| "L".equals(binario)) {
            System.out.println("Binario   = 01001100\n"
                             + "Decimal   = 76\n"
                             + "ASCII     = L ");
        }
        if ("01001101".equals(binario) || "77".equals(binario)|| "M".equals(binario)) {
            imprimible =("Binario   = 01001101\n"
                             + "Decimal   = 77\n"
                             + "ASCII     = M ");
        }
        if ("01001110".equals(binario) || "78".equals(binario)|| "N".equals(binario)) {
            imprimible =("Binario   = 01001110\n"
                             + "Decimal   = 78\n"
                             + "ASCII     = N ");
        }
        if ("01001111".equals(binario) || "79".equals(binario)|| "O".equals(binario)) {
            imprimible =("Binario   = 01001111\n"
                             + "Decimal   = 79\n"
                             + "ASCII     = O ");
        }
        if ("01010000".equals(binario) || "80".equals(binario)|| "P".equals(binario)) {
            imprimible =("Binario   = 01010000\n"
                             + "Decimal   = 80\n"
                             + "ASCII     = P ");
        }
        if ("01010001".equals(binario) || "81".equals(binario)|| "Q".equals(binario)) {
            imprimible =("Binario   = 01010001\n"
                             + "Decimal   = 81\n"
                             + "ASCII     = Q ");
        }
        if ("01010010".equals(binario) || "82".equals(binario)|| "R".equals(binario)) {
            imprimible =("Binario   = 01010010\n"
                             + "Decimal   = 82\n"
                             + "ASCII     = R ");
        }
        if ("01010011".equals(binario) || "83".equals(binario)|| "S".equals(binario)) {
            imprimible =("Binario   = 01010011\n"
                             + "Decimal   = 83\n"
                             + "ASCII     = S ");
        }
        if ("01010100".equals(binario) || "84".equals(binario)|| "T".equals(binario)) {
            imprimible =("Binario   = 01010100\n"
                             + "Decimal   = 84\n"
                             + "ASCII     = T ");
        }
        if ("01010101".equals(binario) || "85".equals(binario)|| "U".equals(binario)) {
            imprimible =("Binario   = 01010101\n"
                             + "Decimal   = 85\n"
                             + "ASCII     = 5 ");
        }
        if ("01010110".equals(binario) || "86".equals(binario)|| "V".equals(binario)) {
            imprimible =("Binario   = 01010110\n"
                             + "Decimal   = 86\n"
                             + "ASCII     = V ");
        }
        if ("01010111".equals(binario) || "87".equals(binario)|| "W".equals(binario)) {
            imprimible =("Binario   = 01010111\n"
                             + "Decimal   = 87\n"
                             + "ASCII     = W ");
        }
        if ("01011000".equals(binario) || "88".equals(binario)|| "X".equals(binario)) {
            imprimible =("Binario   = 01011000\n"
                             + "Decimal   = 88\n"
                             + "ASCII     = X ");
        }
        if ("01011001".equals(binario) || "89".equals(binario)|| "Y".equals(binario)) {
            imprimible =("Binario   = 01011001\n"
                             + "Decimal   = 89\n"
                             + "ASCII     = Y ");
        }
        if ("01011010".equals(binario) || "90".equals(binario)|| "Z".equals(binario)) {
            imprimible =("Binario   = 01011010\n"
                             + "Decimal   = 90\n"
                             + "ASCII     = Z ");
        }
        if ("01011011".equals(binario) || "91".equals(binario)|| "[".equals(binario)) {
            imprimible =("Binario   = 01011011\n"
                             + "Decimal   = 91\n"
                             + "ASCII     = [ ");
        }
        if ("01011100".equals(binario) || "92".equals(binario)|| "\\".equals(binario)) {
            imprimible =("Binario   = 01011100\n"
                             + "Decimal   = 92\n"
                             + "ASCII     = \\ ");// doble  \ para que no qenere error
        }
        if ("01011101".equals(binario) || "93".equals(binario)|| "]".equals(binario)) {
            imprimible =("Binario   = 01011101\n"
                             + "Decimal   = 93\n"
                             + "ASCII     = ] ");
        }
        if ("01011110".equals(binario) || "94".equals(binario)|| "^".equals(binario)) {
            imprimible =("Binario   = 01011110\n"
                             + "Decimal   = 94\n"
                             + "ASCII     = ^ ");
        }
        if ("01011111".equals(binario) || "95".equals(binario)|| "_".equals(binario)) {
            imprimible =("Binario   = 01011111\n"
                             + "Decimal   = 95\n"
                             + "ASCII     = _ ");
        }
        if ("01100000".equals(binario) || "96".equals(binario)|| "`".equals(binario)) {
            imprimible =("Binario   = 01100000\n"
                             + "Decimal   = 96\n"
                             + "ASCII     = ` ");
        }
        if ("01100001".equals(binario) || "97".equals(binario)|| "a".equals(binario)) {
            imprimible =("Binario   = 01100001\n"
                             + "Decimal   = 97\n"
                             + "ASCII     = a ");
        }
        if ("01100010".equals(binario) || "98".equals(binario)|| "b".equals(binario)) {
            imprimible =("Binario   = 01100010\n"
                             + "Decimal   = 98\n"
                             + "ASCII     = b ");
        }
        if ("01100011".equals(binario) || "99".equals(binario)|| "c".equals(binario)) {
            imprimible =("Binario   = 01100011\n"
                             + "Decimal   = 99\n"
                             + "ASCII     = c ");
        }
        if ("01100100".equals(binario) || "100".equals(binario)|| "d".equals(binario)) {
            imprimible =("Binario   = 01100100\n"
                             + "Decimal   = 100\n"
                             + "ASCII     = d ");
        }
        if ("01100101".equals(binario) || "101".equals(binario)|| "e".equals(binario)) {
            imprimible =("Binario   = 01100101\n"
                             + "Decimal   = 101\n"
                             + "ASCII     = e ");
        }
        if ("01100110".equals(binario) || "102".equals(binario)|| "f".equals(binario)) {
            imprimible =("Binario   = 01100110\n"
                             + "Decimal   = 102\n"
                             + "ASCII     = f ");
        }
        if ("01100111".equals(binario) || "103".equals(binario)|| "g".equals(binario)) {
            imprimible =("Binario   = 01100111\n"
                             + "Decimal   = 103\n"
                             + "ASCII     = g ");
        }
        if ("01100111".equals(binario) || "103".equals(binario)|| "g".equals(binario)) {
            imprimible =("Binario   = 01100111\n"
                             + "Decimal   = 103\n"
                             + "ASCII     = g ");
        }
        if ("01101000".equals(binario) || "104".equals(binario)|| "h".equals(binario)) {
            imprimible =("Binario   = 01101000\n"
                             + "Decimal   = 104\n"
                             + "ASCII     = h ");
        }
        if ("01101001".equals(binario) || "105".equals(binario)|| "i".equals(binario)) {
            imprimible =("Binario   = 01101001\n"
                             + "Decimal   = 105\n"
                             + "ASCII     = i ");
        }
        if ("01101010".equals(binario) || "106".equals(binario)|| "j".equals(binario)) {
            imprimible =("Binario   = 01101010\n"
                             + "Decimal   = 106\n"
                             + "ASCII     = j ");
        }
        if ("01101011".equals(binario) || "107".equals(binario)|| "k".equals(binario)) {
            imprimible =("Binario   = 01101011\n"
                             + "Decimal   = 107\n"
                             + "ASCII     = k ");
        }
        if ("01101100".equals(binario) || "108".equals(binario)|| "l".equals(binario)) {
            imprimible =("Binario   = 01101100\n"
                             + "Decimal   = 108\n"
                             + "ASCII     = l ");
        }
        if ("01101101".equals(binario) || "109".equals(binario)|| "m".equals(binario)) {
            imprimible =("Binario   = 01101101\n"
                             + "Decimal   = 109\n"
                             + "ASCII     = m ");
        }
        if ("01101110".equals(binario) || "110".equals(binario)|| "n".equals(binario)) {
            imprimible =("Binario   = 01101110\n"
                             + "Decimal   = 110\n"
                             + "ASCII     = n ");
        }
        if ("01101111".equals(binario) || "111".equals(binario)|| "o".equals(binario)) {
            imprimible =("Binario   = 01101111\n"
                             + "Decimal   = 111\n"
                             + "ASCII     = o ");
        }
        if ("01110000".equals(binario) || "112".equals(binario)|| "p".equals(binario)) {
            imprimible =("Binario   = 01110000\n"
                             + "Decimal   = 112\n"
                             + "ASCII     = p ");
        }
        if ("01110001".equals(binario) || "113".equals(binario)|| "q".equals(binario)) {
            imprimible =("Binario   = 01110001\n"
                             + "Decimal   = 113\n"
                             + "ASCII     = q ");
        }
        if ("01110010".equals(binario) || "114".equals(binario)|| "r".equals(binario)) {
            imprimible =("Binario   = 01110010\n"
                             + "Decimal   = 114\n"
                             + "ASCII     = r ");
        }
        if ("01110011".equals(binario) || "115".equals(binario)|| "s".equals(binario)) {
            imprimible =("Binario   = 01110011\n"
                             + "Decimal   = 115\n"
                             + "ASCII     = s ");
        }
        if ("01110100".equals(binario) || "116".equals(binario)|| "t".equals(binario)) {
            imprimible =("Binario   = 01110100\n"
                             + "Decimal   = 116\n"
                             + "ASCII     = t ");
        }
        if ("01110101".equals(binario) || "117".equals(binario)|| "u".equals(binario)) {
            imprimible =("Binario   = 01110101\n"
                             + "Decimal   = 117\n"
                             + "ASCII     = u ");
        }
        if ("01110110".equals(binario) || "118".equals(binario)|| "v".equals(binario)) {
            imprimible =("Binario   = 01110110\n"
                             + "Decimal   = 118\n"
                             + "ASCII     = v ");
        }
        if ("01110111".equals(binario) || "119".equals(binario)|| "w".equals(binario)) {
            imprimible =("Binario   = 01110111\n"
                             + "Decimal   = 119\n"
                             + "ASCII     = w ");
        }
        if ("01111000".equals(binario) || "120".equals(binario)|| "x".equals(binario)) {
           imprimible =("Binario   = 01111000\n"
                             + "Decimal   = 120\n"
                             + "ASCII     = x ");
        }
        if ("01111001".equals(binario) || "121".equals(binario)|| "y".equals(binario)) {
            imprimible =("Binario   = 01111001\n"
                             + "Decimal   = 121\n"
                             + "ASCII     = y ");
        }
        if ("01111010".equals(binario) || "122".equals(binario)|| "z".equals(binario)) {
            imprimible =("Binario   = 01111010\n"
                             + "Decimal   = 122\n"
                             + "ASCII     = z ");
        }
        if ("01111011".equals(binario) || "123".equals(binario)|| "{".equals(binario)) {
            imprimible =("Binario   = 01111011\n"
                             + "Decimal   = 123\n"
                             + "ASCII     = { ");
        }
        if ("01111100".equals(binario) || "124".equals(binario)|| "|".equals(binario)) {
            imprimible =("Binario   = 01111100\n"
                             + "Decimal   = 124\n"
                             + "ASCII     = | ");
        }
        if ("01111101".equals(binario) || "125".equals(binario)|| "}".equals(binario)) {
            imprimible =      ("Binario   = 01111101\n"
                             + "Decimal   = 125\n"
                             + "ASCII     = } ");
        }
        if ("01111110".equals(binario) || "126".equals(binario)|| "~".equals(binario)) {
            imprimible =      ("Binario   = 01111110\n"
                             + "Decimal   = 126\n"
                             + "ASCII     = ~ ");
        }
        return imprimible;
    }
}