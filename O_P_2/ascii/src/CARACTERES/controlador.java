package CARACTERES;

/**
 *
 * @author manuel
 */
public class controlador {

    public String controlador(String binario) {
        String imprimible = new String();

        // caracteres ASCII de control;
        if ("00000000".equals(binario) || "00".equals(binario) || "NULL".equals(binario)) {
            imprimible = ("Binario   = 00000000\n"
                    + "Decimal   = 00\n"
                    + "ASCII     = NULL\n"
                    + "CONTROL   = CARÁCTER NULO");
        }

        if ("00000001".equals(binario) || "01".equals(binario) || "SOH".equals(binario)) {
            imprimible = ("Binario    = 00000001\n"
                    + "Decimal   = 01\n"
                    + "ASCII     = SOH\n"
                    + "CONTROL   = INICIO ENCABEZADO\n");
        }
        if ("00000010".equals(binario) || "02".equals(binario) || "STX".equals(binario)) {
            imprimible = ("Binario    = 00000010\n"
                    + "Decimal   = 02\n"
                    + "ASCII     = STX\n"
                    + "CONTROL   = INICIO TEXTO");
        }
        if ("00000011".equals(binario) || "03".equals(binario) || "ETX".equals(binario)) {
            imprimible = ("Binario    = 00000011\n"
                    + "Decimal   = 03\n"
                    + "ASCII     = ETX\n"
                    + "CONTROL   = FIN DE TEXTO");
        }
        if ("00000100".equals(binario) || "04".equals(binario) || "EOT".equals(binario)) {
            imprimible = ("Binario    = 00000100\n"
                    + "Decimal   = 04\n"
                    + "ASCII     = EOT\n"
                    + "CONTROL   = FIN TRANSMICIÓ");
        }
        if ("00000101".equals(binario) || "05".equals(binario) || "ENQ".equals(binario)) {
            imprimible = ("Binario    = 00000101\n"
                    + "Decimal   = 5\n"
                    + "ASCII     = ENQ\n"
                    + "CONTROL   = CONSULTA");
        }
        if ("00000110".equals(binario) || "06".equals(binario) || "ACK".equals(binario)) {
            imprimible = ("Binario    = 00000110\n"
                    + "Decimal   = 06\n"
                    + "ASCII     = ACK\n"
                    + "CONTROL   = RECONOCIMIENTO");
        }
        if ("00000111".equals(binario) || "07".equals(binario) || "BEL".equals(binario)) {
            imprimible = ("Binario    = 00000111\n"
                    + "Decimal   = 07\n"
                    + "ASCII     = BEL\n"
                    + "CONTROL   = TIMBRE");
        }
        if ("00001000".equals(binario) || "08".equals(binario) || "BS".equals(binario)) {
            imprimible = ("Binario    = 00001000\n"
                    + "Decimal   = 08\n"
                    + "ASCII     = BS\n"
                    + "CONTROL   = RETROCESO");
        }
        if ("00001001".equals(binario) || "09".equals(binario) || "HT".equals(binario)) {
            imprimible = ("Binario    = 00001001\n"
                    + "Decimal   = 09\n"
                    + "ASCII     = \n"
                    + "CONTROL   = TAB HORIZONTAL");
        }
        if ("00001010".equals(binario) || "10".equals(binario) || "LF".equals(binario)) {
            imprimible = ("Binario    = 00001010\n"
                    + "Decimal   = 10\n"
                    + "ASCII     = LF\n"
                    + "CONTROL   = NUEVA LÍNEA");
        }
        if ("00001011".equals(binario) || "11".equals(binario) || "VT".equals(binario)) {
            imprimible = ("Binario    = 00001011\n"
                    + "Decimal   = 11\n"
                    + "ASCII     = VT\n"
                    + "CONTROL   = TAB VERTICAL");
        }
        if ("00001100".equals(binario) || "12".equals(binario) || "FF".equals(binario)) {
            imprimible = ("Binario    = 00001100\n"
                    + "Decimal   = 12\n"
                    + "ASCII     = FF\n"
                    + "CONTROL   = NUEVA PÁGINA");
        }
        if ("00001101".equals(binario) || "13".equals(binario) || "CR".equals(binario)) {
            imprimible = ("Binario    = 00001101\n"
                    + "Decimal   = 13\n"
                    + "ASCII     = CR\n"
                    + "CONTROL   = RETORNO DE CARRO");
        }
        if ("00001110".equals(binario) || "14".equals(binario) || "SO".equals(binario)) {
            imprimible = ("Binario    = 00001110\n"
                    + "Decimal   = 14\n"
                    + "ASCII     = SO\n"
                    + "CONTROL   = DESPLAZA AFUERA");
        }
        if ("00001111".equals(binario) || "15".equals(binario) || "SI".equals(binario)) {
            imprimible = ("Binario    = 00001111\n"
                    + "Decimal   = 15\n"
                    + "ASCII     = SI\n"
                    + "CONTROL   = DESPLAZA ADENTRO");
        }
        if ("00010000".equals(binario) || "16".equals(binario) || "DLE".equals(binario)) {
            imprimible = ("Binario    = 00010000\n"
                    + "Decimal   = 16\n"
                    + "ASCII     = DLE\n"
                    + "CONTROL   = ESC.VÍNCULO DATOS");
        }
        if ("00010001".equals(binario) || "17".equals(binario) || "DC1".equals(binario)) {
            imprimible = ("Binario    = 00010001\n"
                    + "Decimal   = 17\n"
                    + "ASCII     = DC1\n"
                    + "CONTROL   = CONTROL DISPOSITIVO.1");
        }
        if ("00010010".equals(binario) || "18".equals(binario) || "DC2".equals(binario)) {
            imprimible = ("Binario    = 00010010\n"
                    + "Decimal   = 18\n"
                    + "ASCII     = DC2\n"
                    + "CONTROL   = CONTROL DISPOSITIVO.2");
        }
        if ("00010011".equals(binario) || "19".equals(binario) || "DC3".equals(binario)) {
            imprimible = ("Binario    = 00010011\n"
                    + "Decimal   = 19\n"
                    + "ASCII     = DC3\n"
                    + "CONTROL   = CONTROL DISPOSITIVO.3");
        }
        if ("00010100".equals(binario) || "20".equals(binario) || "DC4".equals(binario)) {
            imprimible = ("Binario    = 00010100\n"
                    + "Decimal   = 20\n"
                    + "ASCII     = DC4\n"
                    + "CONTROL   = CONTROL DISPOSITIVO.4");
        }
        if ("00010101".equals(binario) || "21".equals(binario) || "NAK".equals(binario)) {
            imprimible = ("Binario    = 00010101\n"
                    + "Decimal   = 21\n"
                    + "ASCII     = NAK\n"
                    + "CONTROL   = CONFIGURACION NEGATIVA");
        }
        if ("00010110".equals(binario) || "22".equals(binario) || "SYN".equals(binario)) {
            imprimible = ("Binario    = 00010110\n"
                    + "Decimal   = 22\n"
                    + "ASCII     = SYN\n"
                    + "CONTROL   = INACTIVIDAD SÍNCRONA");
        }
        if ("00010111".equals(binario) || "23".equals(binario) || "ETB".equals(binario)) {
            imprimible = ("Binario    = 00010111\n"
                    + "Decimal   = 23\n"
                    + "ASCII     = ETB\n"
                    + "CONTROL   = FINAL DEL BLOQUE DE TRANSMISIÓN");
        }
        if ("00011000".equals(binario) || "24".equals(binario) || "CAN".equals(binario)) {
            imprimible = ("Binario    = 00011000\n"
                    + "Decimal   = \n"
                    + "ASCII     = CAN\n"
                    + "CONTROL   = CANCELAR");
        }
        if ("00011001".equals(binario) || "25".equals(binario) || "EM".equals(binario)) {
            imprimible = ("Binario    = 00011001\n"
                    + "Decimal   = 25\n"
                    + "ASCII     = EM\n"
                    + "CONTROL   = FIN DEL MEDIO");
        }
        if ("00011010".equals(binario) || "26".equals(binario) || "SUB".equals(binario)) {
            imprimible = ("Binario    = 00011010\n"
                    + "Decimal   = 26\n"
                    + "ASCII     = SUB\n"
                    + "CONTROL   = SUSTITUCIÓN");
        }
        if ("00011011".equals(binario) || "27".equals(binario) || "ESC".equals(binario)) {
            imprimible = ("Binario    = 00011011\n"
                    + "Decimal   = 27\n"
                    + "ASCII     = ESC\n"
                    + "CONTROL   = ESCAPE");
        }
        if ("00011100".equals(binario) || "28".equals(binario) || "FS".equals(binario)) {
            imprimible = ("Binario    = 00011100\n"
                    + "Decimal   = 28\n"
                    + "ASCII     = FS\n"
                    + "CONTROL   = SEPARADOR DE ARCHIVOS");
        }
        if ("00011101".equals(binario) || "29".equals(binario) || "GS".equals(binario)) {
            imprimible = ("Binario    = 00011101\n"
                    + "Decimal   = 29\n"
                    + "ASCII     = GS\n"
                    + "CONTROL   = SEPARADOR DE GRUPOS");
        }
        if ("00011110".equals(binario) || "30".equals(binario) || "RS".equals(binario)) {
            imprimible = ("Binario    = 00011110\n"
                    + "Decimal   = 30\n"
                    + "ASCII     = RS\n"
                    + "CONTROL   = SEPARADOR DE REGISTROS");
        }
        if ("00011111".equals(binario) || "31".equals(binario) || "US".equals(binario)) {
            imprimible = ("Binario    = 00011111\n"
                    + "Decimal   = 31\n"
                    + "ASCII     = US\n"
                    + "CONTROL   = SEPARADOR DE UNIDADES");
        }
        // ECESPCION AL ORDEN 
        if ("01111111".equals(binario) || "127".equals(binario) || "DEL".equals(binario)) {
            imprimible = ("Binario    = 01111111\n"
                    + "Decimal   = 127\n"
                    + "ASCII     = DEL\n"
                    + "CONTROL   = SUPRIMIR");
        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // CARACTERES ASCII IMPRIMIBLES ;
        if ("00100000".equals(binario) || "32".equals(binario) || "ESPACIO".equals(binario)) {
            imprimible = ("Binario   = 00100000\n"
                    + "Decimal   = 32\n"
                    + "ASCII     = ESPACIO");
        }
        if ("00100001".equals(binario) || "33".equals(binario) || "!".equals(binario)) {
            imprimible = ("Binario   = 00100001\n"
                    + "Decimal   = 33\n"
                    + "ASCII     = !");
        }
        if ("00100010".equals(binario) || "34".equals(binario) || "\"".equals(binario)) {
            imprimible = ("Binario   = 00100010\n"
                    + "Decimal   = 34\n"
                    + "ASCII     = \" "); // uso \ para que no se generen dos (") comillas
        }
        if ("00100011".equals(binario) || "35".equals(binario) || "#".equals(binario)) {
            imprimible = ("Binario   = 00100011\n"
                    + "Decimal   = 35\n"
                    + "ASCII     = #");
        }
        if ("00100100".equals(binario) || "36".equals(binario) || "$".equals(binario)) {
            imprimible = ("Binario   = 00100100\n"
                    + "Decimal   = 36\n"
                    + "ASCII     = $");
        }
        if ("00100101".equals(binario) || "37".equals(binario) || "%".equals(binario)) {
            imprimible = ("Binario   = 00100101\n"
                    + "Decimal   = 37\n"
                    + "ASCII     = %");
        }
        if ("00100110".equals(binario) || "38".equals(binario) || "&".equals(binario)) {
            imprimible = ("Binario   = 00100110\n"
                    + "Decimal   = 38\n"
                    + "ASCII     = &");
        }
        if ("00100111".equals(binario) || "39".equals(binario) || "'".equals(binario)) {
            imprimible = ("Binario   = 00100111\n"
                    + "Decimal   = 39\n"
                    + "ASCII     = ' ");
        }
        if ("00101000".equals(binario) || "40".equals(binario) || "(".equals(binario)) {
            imprimible = ("Binario   = 00101000\n"
                    + "Decimal   = 40\n"
                    + "ASCII     = ( ");
        }
        if ("00101001".equals(binario) || "41".equals(binario) || ")".equals(binario)) {
            imprimible = ("Binario   = 00101001\n"
                    + "Decimal   = 41\n"
                    + "ASCII     = ) ");
        }
        if ("00101010".equals(binario) || "42".equals(binario) || "*".equals(binario)) {
            imprimible = ("Binario   = 00101010\n"
                    + "Decimal   = 42\n"
                    + "ASCII     = * ");
        }
        if ("00101011".equals(binario) || "43".equals(binario) || "+".equals(binario)) {
            imprimible = ("Binario   = 00101011\n"
                    + "Decimal   = 43\n"
                    + "ASCII     = + ");
        }
        if ("00101100".equals(binario) || "44".equals(binario) || ",".equals(binario)) {
            imprimible = ("Binario   = 00101100\n"
                    + "Decimal   = 44\n"
                    + "ASCII     = , ");
        }
        if ("00101101".equals(binario) || "45".equals(binario) || "-".equals(binario)) {
            imprimible = ("Binario   = 00101101\n"
                    + "Decimal   = 45\n"
                    + "ASCII     = - ");
        }
        if ("00101110".equals(binario) || "46".equals(binario) || ".".equals(binario)) {
            imprimible = ("Binario   = 00101110\n"
                    + "Decimal   = 46\n"
                    + "ASCII     = . ");
        }
        if ("00101111".equals(binario) || "47".equals(binario) || "/".equals(binario)) {
            imprimible = ("Binario   = 00101111\n"
                    + "Decimal   = 47\n"
                    + "ASCII     = / ");
        }
        if ("00110000".equals(binario) || "48".equals(binario) || "0".equals(binario)) {
            imprimible = ("Binario   = 00110000\n"
                    + "Decimal   = 48\n"
                    + "ASCII     = 0 ");
        }
        if ("00110001".equals(binario) || "49".equals(binario) || "1".equals(binario)) {
            imprimible = ("Binario   = 00110001\n"
                    + "Decimal   = 49\n"
                    + "ASCII     = 1 ");
        }
        if ("00110010".equals(binario) || "50".equals(binario) || "2".equals(binario)) {
            imprimible = ("Binario   = 00110010\n"
                    + "Decimal   = 50\n"
                    + "ASCII     = 2 ");
        }
        if ("00110011".equals(binario) || "51".equals(binario) || "3".equals(binario)) {
            imprimible = ("Binario   = 00110011\n"
                    + "Decimal   = 51\n"
                    + "ASCII     = 3 ");
        }
        if ("00110100".equals(binario) || "52".equals(binario) || "4".equals(binario)) {
            imprimible = ("Binario   = 00110100\n"
                    + "Decimal   = 52\n"
                    + "ASCII     = 4 ");
        }
        if ("00110101".equals(binario) || "53".equals(binario) || "5".equals(binario)) {
            imprimible = ("Binario   = 00110101\n"
                    + "Decimal   = 53\n"
                    + "ASCII     = 5 ");
        }
        if ("00110110".equals(binario) || "54".equals(binario) || "6".equals(binario)) {
            imprimible = ("Binario   = 00110110\n"
                    + "Decimal   = 54\n"
                    + "ASCII     = 6 ");
        }
        if ("00110111".equals(binario) || "55".equals(binario) || "7".equals(binario)) {
            imprimible = ("Binario   = 00110111\n"
                    + "Decimal   = 55\n"
                    + "ASCII     = 7 ");
        }
        if ("00111000".equals(binario) || "56".equals(binario) || "8".equals(binario)) {
            imprimible = ("Binario   = 00111000\n"
                    + "Decimal   = 56\n"
                    + "ASCII     = 8 ");
        }
        if ("00111001".equals(binario) || "57".equals(binario) || "9".equals(binario)) {
            imprimible = ("Binario   = 00111001\n"
                    + "Decimal   = 57\n"
                    + "ASCII     = 9 ");
        }
        if ("00111010".equals(binario) || "59".equals(binario) || ":".equals(binario)) {
            imprimible = ("Binario   = 00111010\n"
                    + "Decimal   = 58\n"
                    + "ASCII     = : ");
        }
        if ("00111011".equals(binario) || "60".equals(binario) || ";".equals(binario)) {
            imprimible = ("Binario   = 00111011\n"
                    + "Decimal   = 59\n"
                    + "ASCII     = ; ");
        }
        if ("00111100".equals(binario) || "61".equals(binario) || "<".equals(binario)) {
            imprimible = ("Binario   = 00111100\n"
                    + "Decimal   = 60\n"
                    + "ASCII     = < ");
        }
        if ("00111101".equals(binario) || "62".equals(binario) || "=".equals(binario)) {
            imprimible = ("Binario   = 00111101\n"
                    + "Decimal   = 61\n"
                    + "ASCII     = = ");
        }
        if ("00111110".equals(binario) || "62".equals(binario) || ">".equals(binario)) {
            imprimible = ("Binario   = 00111110\n"
                    + "Decimal   = 62\n"
                    + "ASCII     = > ");
        }
        if ("00111111".equals(binario) || "63".equals(binario) || "?".equals(binario)) {
            imprimible = ("Binario   = 00111111\n"
                    + "Decimal   = 63\n"
                    + "ASCII     = ? ");
        }//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if ("01000000".equals(binario) || "64".equals(binario) || "@".equals(binario)) {
            imprimible = ("Binario   = 01000000\n"
                    + "Decimal   = 64\n"
                    + "ASCII     = @ ");
        }
        if ("01000001".equals(binario) || "65".equals(binario) || "A".equals(binario)) {
            imprimible = ("Binario   = 01000001\n"
                    + "Decimal   = 65\n"
                    + "ASCII     = A ");
        }
        if ("01000010".equals(binario) || "66".equals(binario) || "B".equals(binario)) {
            imprimible = ("Binario   = 01000010\n"
                    + "Decimal   = 66\n"
                    + "ASCII     = B ");
        }
        if ("01000011".equals(binario) || "67".equals(binario) || "C".equals(binario)) {
            imprimible = ("Binario   = 01000011\n"
                    + "Decimal   = 67\n"
                    + "ASCII     = C ");
        }
        if ("01000100".equals(binario) || "68".equals(binario) || "D".equals(binario)) {
            imprimible = ("Binario   = 01000100\n"
                    + "Decimal   = 68\n"
                    + "ASCII     = D ");
        }
        if ("01000101".equals(binario) || "69".equals(binario) || "E".equals(binario)) {
            imprimible = ("Binario   = 01000100\n"
                    + "Decimal   = 69\n"
                    + "ASCII     = E ");
        }
        if ("01000110".equals(binario) || "70".equals(binario) || "F".equals(binario)) {
            imprimible = ("Binario   = 01000110\n"
                    + "Decimal   = 70\n"
                    + "ASCII     = F ");
        }
        if ("01000111".equals(binario) || "71".equals(binario) || "G".equals(binario)) {
            imprimible = ("Binario   = 01000111\n"
                    + "Decimal   = 71\n"
                    + "ASCII     = G ");
        }
        if ("01001000".equals(binario) || "72".equals(binario) || "H".equals(binario)) {
            imprimible = ("Binario   = 01001000\n"
                    + "Decimal   = 72\n"
                    + "ASCII     = H ");
        }
        if ("01001001".equals(binario) || "73".equals(binario) || "I".equals(binario)) {
            imprimible = ("Binario   = 01001001\n"
                    + "Decimal   = 73\n"
                    + "ASCII     = I ");
        }
        if ("01001010".equals(binario) || "74".equals(binario) || "J".equals(binario)) {
            imprimible = ("Binario   = 01001010\n"
                    + "Decimal   = 74\n"
                    + "ASCII     = J ");
        }
        if ("01001011".equals(binario) || "75".equals(binario) || "K".equals(binario)) {
            imprimible = ("Binario   = 01001011\n"
                    + "Decimal   = 75\n"
                    + "ASCII     = K ");
        }
        if ("01001100".equals(binario) || "76".equals(binario) || "L".equals(binario)) {
            System.out.println("Binario   = 01001100\n"
                    + "Decimal   = 76\n"
                    + "ASCII     = L ");
        }
        if ("01001101".equals(binario) || "77".equals(binario) || "M".equals(binario)) {
            imprimible = ("Binario   = 01001101\n"
                    + "Decimal   = 77\n"
                    + "ASCII     = M ");
        }
        if ("01001110".equals(binario) || "78".equals(binario) || "N".equals(binario)) {
            imprimible = ("Binario   = 01001110\n"
                    + "Decimal   = 78\n"
                    + "ASCII     = N ");
        }
        if ("01001111".equals(binario) || "79".equals(binario) || "O".equals(binario)) {
            imprimible = ("Binario   = 01001111\n"
                    + "Decimal   = 79\n"
                    + "ASCII     = O ");
        }
        if ("01010000".equals(binario) || "80".equals(binario) || "P".equals(binario)) {
            imprimible = ("Binario   = 01010000\n"
                    + "Decimal   = 80\n"
                    + "ASCII     = P ");
        }
        if ("01010001".equals(binario) || "81".equals(binario) || "Q".equals(binario)) {
            imprimible = ("Binario   = 01010001\n"
                    + "Decimal   = 81\n"
                    + "ASCII     = Q ");
        }
        if ("01010010".equals(binario) || "82".equals(binario) || "R".equals(binario)) {
            imprimible = ("Binario   = 01010010\n"
                    + "Decimal   = 82\n"
                    + "ASCII     = R ");
        }
        if ("01010011".equals(binario) || "83".equals(binario) || "S".equals(binario)) {
            imprimible = ("Binario   = 01010011\n"
                    + "Decimal   = 83\n"
                    + "ASCII     = S ");
        }
        if ("01010100".equals(binario) || "84".equals(binario) || "T".equals(binario)) {
            imprimible = ("Binario   = 01010100\n"
                    + "Decimal   = 84\n"
                    + "ASCII     = T ");
        }
        if ("01010101".equals(binario) || "85".equals(binario) || "U".equals(binario)) {
            imprimible = ("Binario   = 01010101\n"
                    + "Decimal   = 85\n"
                    + "ASCII     = 5 ");
        }
        if ("01010110".equals(binario) || "86".equals(binario) || "V".equals(binario)) {
            imprimible = ("Binario   = 01010110\n"
                    + "Decimal   = 86\n"
                    + "ASCII     = V ");
        }
        if ("01010111".equals(binario) || "87".equals(binario) || "W".equals(binario)) {
            imprimible = ("Binario   = 01010111\n"
                    + "Decimal   = 87\n"
                    + "ASCII     = W ");
        }
        if ("01011000".equals(binario) || "88".equals(binario) || "X".equals(binario)) {
            imprimible = ("Binario   = 01011000\n"
                    + "Decimal   = 88\n"
                    + "ASCII     = X ");
        }
        if ("01011001".equals(binario) || "89".equals(binario) || "Y".equals(binario)) {
            imprimible = ("Binario   = 01011001\n"
                    + "Decimal   = 89\n"
                    + "ASCII     = Y ");
        }
        if ("01011010".equals(binario) || "90".equals(binario) || "Z".equals(binario)) {
            imprimible = ("Binario   = 01011010\n"
                    + "Decimal   = 90\n"
                    + "ASCII     = Z ");
        }
        if ("01011011".equals(binario) || "91".equals(binario) || "[".equals(binario)) {
            imprimible = ("Binario   = 01011011\n"
                    + "Decimal   = 91\n"
                    + "ASCII     = [ ");
        }
        if ("01011100".equals(binario) || "92".equals(binario) || "\\".equals(binario)) {
            imprimible = ("Binario   = 01011100\n"
                    + "Decimal   = 92\n"
                    + "ASCII     = \\ ");// doble  \ para que no qenere error
        }
        if ("01011101".equals(binario) || "93".equals(binario) || "]".equals(binario)) {
            imprimible = ("Binario   = 01011101\n"
                    + "Decimal   = 93\n"
                    + "ASCII     = ] ");
        }
        if ("01011110".equals(binario) || "94".equals(binario) || "^".equals(binario)) {
            imprimible = ("Binario   = 01011110\n"
                    + "Decimal   = 94\n"
                    + "ASCII     = ^ ");
        }
        if ("01011111".equals(binario) || "95".equals(binario) || "_".equals(binario)) {
            imprimible = ("Binario   = 01011111\n"
                    + "Decimal   = 95\n"
                    + "ASCII     = _ ");
        }
        if ("01100000".equals(binario) || "96".equals(binario) || "`".equals(binario)) {
            imprimible = ("Binario   = 01100000\n"
                    + "Decimal   = 96\n"
                    + "ASCII     = ` ");
        }
        if ("01100001".equals(binario) || "97".equals(binario) || "a".equals(binario)) {
            imprimible = ("Binario   = 01100001\n"
                    + "Decimal   = 97\n"
                    + "ASCII     = a ");
        }
        if ("01100010".equals(binario) || "98".equals(binario) || "b".equals(binario)) {
            imprimible = ("Binario   = 01100010\n"
                    + "Decimal   = 98\n"
                    + "ASCII     = b ");
        }
        if ("01100011".equals(binario) || "99".equals(binario) || "c".equals(binario)) {
            imprimible = ("Binario   = 01100011\n"
                    + "Decimal   = 99\n"
                    + "ASCII     = c ");
        }
        if ("01100100".equals(binario) || "100".equals(binario) || "d".equals(binario)) {
            imprimible = ("Binario   = 01100100\n"
                    + "Decimal   = 100\n"
                    + "ASCII     = d ");
        }
        if ("01100101".equals(binario) || "101".equals(binario) || "e".equals(binario)) {
            imprimible = ("Binario   = 01100101\n"
                    + "Decimal   = 101\n"
                    + "ASCII     = e ");
        }
        if ("01100110".equals(binario) || "102".equals(binario) || "f".equals(binario)) {
            imprimible = ("Binario   = 01100110\n"
                    + "Decimal   = 102\n"
                    + "ASCII     = f ");
        }
        if ("01100111".equals(binario) || "103".equals(binario) || "g".equals(binario)) {
            imprimible = ("Binario   = 01100111\n"
                    + "Decimal   = 103\n"
                    + "ASCII     = g ");
        }
        if ("01100111".equals(binario) || "103".equals(binario) || "g".equals(binario)) {
            imprimible = ("Binario   = 01100111\n"
                    + "Decimal   = 103\n"
                    + "ASCII     = g ");
        }
        if ("01101000".equals(binario) || "104".equals(binario) || "h".equals(binario)) {
            imprimible = ("Binario   = 01101000\n"
                    + "Decimal   = 104\n"
                    + "ASCII     = h ");
        }
        if ("01101001".equals(binario) || "105".equals(binario) || "i".equals(binario)) {
            imprimible = ("Binario   = 01101001\n"
                    + "Decimal   = 105\n"
                    + "ASCII     = i ");
        }
        if ("01101010".equals(binario) || "106".equals(binario) || "j".equals(binario)) {
            imprimible = ("Binario   = 01101010\n"
                    + "Decimal   = 106\n"
                    + "ASCII     = j ");
        }
        if ("01101011".equals(binario) || "107".equals(binario) || "k".equals(binario)) {
            imprimible = ("Binario   = 01101011\n"
                    + "Decimal   = 107\n"
                    + "ASCII     = k ");
        }
        if ("01101100".equals(binario) || "108".equals(binario) || "l".equals(binario)) {
            imprimible = ("Binario   = 01101100\n"
                    + "Decimal   = 108\n"
                    + "ASCII     = l ");
        }
        if ("01101101".equals(binario) || "109".equals(binario) || "m".equals(binario)) {
            imprimible = ("Binario   = 01101101\n"
                    + "Decimal   = 109\n"
                    + "ASCII     = m ");
        }
        if ("01101110".equals(binario) || "110".equals(binario) || "n".equals(binario)) {
            imprimible = ("Binario   = 01101110\n"
                    + "Decimal   = 110\n"
                    + "ASCII     = n ");
        }
        if ("01101111".equals(binario) || "111".equals(binario) || "o".equals(binario)) {
            imprimible = ("Binario   = 01101111\n"
                    + "Decimal   = 111\n"
                    + "ASCII     = o ");
        }
        if ("01110000".equals(binario) || "112".equals(binario) || "p".equals(binario)) {
            imprimible = ("Binario   = 01110000\n"
                    + "Decimal   = 112\n"
                    + "ASCII     = p ");
        }
        if ("01110001".equals(binario) || "113".equals(binario) || "q".equals(binario)) {
            imprimible = ("Binario   = 01110001\n"
                    + "Decimal   = 113\n"
                    + "ASCII     = q ");
        }
        if ("01110010".equals(binario) || "114".equals(binario) || "r".equals(binario)) {
            imprimible = ("Binario   = 01110010\n"
                    + "Decimal   = 114\n"
                    + "ASCII     = r ");
        }
        if ("01110011".equals(binario) || "115".equals(binario) || "s".equals(binario)) {
            imprimible = ("Binario   = 01110011\n"
                    + "Decimal   = 115\n"
                    + "ASCII     = s ");
        }
        if ("01110100".equals(binario) || "116".equals(binario) || "t".equals(binario)) {
            imprimible = ("Binario   = 01110100\n"
                    + "Decimal   = 116\n"
                    + "ASCII     = t ");
        }
        if ("01110101".equals(binario) || "117".equals(binario) || "u".equals(binario)) {
            imprimible = ("Binario   = 01110101\n"
                    + "Decimal   = 117\n"
                    + "ASCII     = u ");
        }
        if ("01110110".equals(binario) || "118".equals(binario) || "v".equals(binario)) {
            imprimible = ("Binario   = 01110110\n"
                    + "Decimal   = 118\n"
                    + "ASCII     = v ");
        }
        if ("01110111".equals(binario) || "119".equals(binario) || "w".equals(binario)) {
            imprimible = ("Binario   = 01110111\n"
                    + "Decimal   = 119\n"
                    + "ASCII     = w ");
        }
        if ("01111000".equals(binario) || "120".equals(binario) || "x".equals(binario)) {
            imprimible = ("Binario   = 01111000\n"
                    + "Decimal   = 120\n"
                    + "ASCII     = x ");
        }
        if ("01111001".equals(binario) || "121".equals(binario) || "y".equals(binario)) {
            imprimible = ("Binario   = 01111001\n"
                    + "Decimal   = 121\n"
                    + "ASCII     = y ");
        }
        if ("01111010".equals(binario) || "122".equals(binario) || "z".equals(binario)) {
            imprimible = ("Binario   = 01111010\n"
                    + "Decimal   = 122\n"
                    + "ASCII     = z ");
        }
        if ("01111011".equals(binario) || "123".equals(binario) || "{".equals(binario)) {
            imprimible = ("Binario   = 01111011\n"
                    + "Decimal   = 123\n"
                    + "ASCII     = { ");
        }
        if ("01111100".equals(binario) || "124".equals(binario) || "|".equals(binario)) {
            imprimible = ("Binario   = 01111100\n"
                    + "Decimal   = 124\n"
                    + "ASCII     = | ");
        }
        if ("01111101".equals(binario) || "125".equals(binario) || "}".equals(binario)) {
            imprimible = ("Binario   = 01111101\n"
                    + "Decimal   = 125\n"
                    + "ASCII     = } ");
        }
        if ("01111110".equals(binario) || "126".equals(binario) || "~".equals(binario)) {
            imprimible = ("Binario   = 01111110\n"
                    + "Decimal   = 126\n"
                    + "ASCII     = ~ ");
        }
        return imprimible;
    }

}
