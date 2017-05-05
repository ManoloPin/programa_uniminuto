
package CARACTERES;

/**
 *
 * @author manuel
 */
public class CONTROL {
//   public String control(String binario){
//       String imprimible= new String();
//       // caracteres ASCII de control;
//        if("00000000".equals(binario)||  "00".equals(binario)|| "NULL".equals(binario)){
//            imprimible=("Binario   = 00000000\n"
//                                +"Decimal   = 00\n"
//                                +"ASCII     = NULL\n"
//                                +"CONTROL   = CARÁCTER NULO\n");
//        }
//        
//        if("00000001".equals(binario)||  "01".equals(binario)|| "SOH".equals(binario)){
//           System.out.println("Binario    = 00000001");
//            System.out.println("Decimal   = 01");
//            System.out.println("ASCII     = SOH"); 
//            System.out.println("CONTROL   = INICIO ENCABEZADO"); 
//        }
//        if("00000010".equals(binario)||  "02".equals(binario)|| "STX".equals(binario)){
//           System.out.println("Binario    = 00000010");
//            System.out.println("Decimal   = 02");
//            System.out.println("ASCII     = STX"); 
//            System.out.println("CONTROL   = INICIO TEXTO"); 
//        }
//        if("00000011".equals(binario)||  "03".equals(binario)|| "ETX".equals(binario)){
//           System.out.println("Binario    = 00000011");
//            System.out.println("Decimal   = 03");
//            System.out.println("ASCII     = ETX"); 
//            System.out.println("CONTROL   = FIN DE TEXTO"); 
//        }
//        if("00000100".equals(binario)||  "04".equals(binario)|| "EOT".equals(binario)){
//           System.out.println("Binario    = 00000100");
//            System.out.println("Decimal   = 04");
//            System.out.println("ASCII     = EOT"); 
//            System.out.println("CONTROL   = FIN TRANSMICIÓ"); 
//        }
//        if("00000101".equals(binario)||  "05".equals(binario)|| "ENQ".equals(binario)){
//           System.out.println("Binario    = 00000101");
//            System.out.println("Decimal   = 5");
//            System.out.println("ASCII     = ENQ"); 
//            System.out.println("CONTROL   = CONSULTA"); 
//        }
//        if("00000110".equals(binario)||  "06".equals(binario)|| "ACK".equals(binario)){
//           System.out.println("Binario    = 00000110");
//            System.out.println("Decimal   = 06");
//            System.out.println("ASCII     = ACK"); 
//            System.out.println("CONTROL   = RECONOCIMIENTO"); 
//        }
//        if("00000111".equals(binario)||  "07".equals(binario)|| "BEL".equals(binario)){
//           System.out.println("Binario    = 00000111");
//            System.out.println("Decimal   = 07");
//            System.out.println("ASCII     = BEL"); 
//            System.out.println("CONTROL   = TIMBRE"); 
//        }
//        if("00001000".equals(binario)||  "08".equals(binario)|| "BS".equals(binario)){
//           System.out.println("Binario    = 00001000");
//            System.out.println("Decimal   = 08");
//            System.out.println("ASCII     = BS"); 
//            System.out.println("CONTROL   = RETROCESO"); 
//        }
//        if("00001001".equals(binario)||  "09".equals(binario)|| "HT".equals(binario)){
//           System.out.println("Binario    = 00001001");
//            System.out.println("Decimal   = 09");
//            System.out.println("ASCII     = HT"); 
//            System.out.println("CONTROL   = TAB HORIZONTAL"); 
//        }
//        if("00001010".equals(binario)||  "10".equals(binario)|| "LF".equals(binario)){
//           System.out.println("Binario    = 00001010");
//            System.out.println("Decimal   = 10");
//            System.out.println("ASCII     = LF"); 
//            System.out.println("CONTROL   = NUEVA LÍNEA"); 
//        }
//        if("00001011".equals(binario)||  "11".equals(binario)|| "VT".equals(binario)){
//           System.out.println("Binario    = 00001011");
//            System.out.println("Decimal   = 11");
//            System.out.println("ASCII     = VT"); 
//            System.out.println("CONTROL   = TAB VERTICAL"); 
//        }
//        if("00001100".equals(binario)||  "12".equals(binario)|| "FF".equals(binario)){
//           System.out.println("Binario    = 00001100");
//            System.out.println("Decimal   = 12");
//            System.out.println("ASCII     = FF"); 
//            System.out.println("CONTROL   = NUEVA PÁGINA"); 
//        }
//        if("00001101".equals(binario)||  "13".equals(binario)|| "CR".equals(binario)){
//           System.out.println("Binario    = 00001101");
//            System.out.println("Decimal   = 13");
//            System.out.println("ASCII     = CR"); 
//            System.out.println("CONTROL   = RETORNO DE CARRO"); 
//        }
//        if("00001110".equals(binario)||  "14".equals(binario)|| "SO".equals(binario)){
//           System.out.println("Binario    = 00001110");
//            System.out.println("Decimal   = 14");
//            System.out.println("ASCII     = SO"); 
//            System.out.println("CONTROL   = DESPLAZA AFUERA"); 
//        }
//        if("00001111".equals(binario)||  "15".equals(binario)|| "SI".equals(binario)){
//           System.out.println("Binario    = 00001111");
//            System.out.println("Decimal   = 15");
//            System.out.println("ASCII     = SI"); 
//            System.out.println("CONTROL   = DESPLAZA ADENTRO"); 
//        }
//        if("00010000".equals(binario)||  "16".equals(binario)|| "DLE".equals(binario)){
//           System.out.println("Binario    = 00010000");
//            System.out.println("Decimal   = 16");
//            System.out.println("ASCII     = DLE"); 
//            System.out.println("CONTROL   = ESC.VÍNCULO DATOS"); 
//        }
//        if("00010001".equals(binario)||  "17".equals(binario)|| "DC1".equals(binario)){
//           System.out.println("Binario    = 00010001");
//            System.out.println("Decimal   = 17");
//            System.out.println("ASCII     = DC1"); 
//            System.out.println("CONTROL   = CONTROL DISPOSITIVO.1"); 
//        }
//        if("00010010".equals(binario)||  "18".equals(binario)|| "DC2".equals(binario)){
//           System.out.println("Binario    = 00010010");
//            System.out.println("Decimal   = 18");
//            System.out.println("ASCII     = DC2"); 
//            System.out.println("CONTROL   = CONTROL DISPOSITIVO.2"); 
//        }
//        if("00010011".equals(binario)||  "19".equals(binario)|| "DC3".equals(binario)){
//           System.out.println("Binario    = 00010011");
//            System.out.println("Decimal   = 19");
//            System.out.println("ASCII     = DC3"); 
//            System.out.println("CONTROL   = CONTROL DISPOSITIVO.3"); 
//        }
//        if("00010100".equals(binario)||  "20".equals(binario)|| "DC4".equals(binario)){
//           System.out.println("Binario    = 00010100");
//            System.out.println("Decimal   = 20");
//            System.out.println("ASCII     = DC4"); 
//            System.out.println("CONTROL   = CONTROL DISPOSITIVO.4"); 
//        }
//        if("00010101".equals(binario)||  "21".equals(binario)|| "NAK".equals(binario)){
//           System.out.println("Binario    = 00010101");
//            System.out.println("Decimal   = 21");
//            System.out.println("ASCII     = NAK"); 
//            System.out.println("CONTROL   = CONFIGURACION NEGATIVA"); 
//        }
//        if("00010110".equals(binario)||  "22".equals(binario)|| "SYN".equals(binario)){
//           System.out.println("Binario    = 00010110");
//            System.out.println("Decimal   = 22");
//            System.out.println("ASCII     = SYN"); 
//            System.out.println("CONTROL   = INACTIVIDAD SÍNCRONA"); 
//        }
//        if("00010111".equals(binario)||  "23".equals(binario)|| "ETB".equals(binario)){
//           System.out.println("Binario    = 00010111");
//            System.out.println("Decimal   = 23");
//            System.out.println("ASCII     = ETB"); 
//            System.out.println("CONTROL   = FINAL DEL BLOQUE DE TRANSMISIÓN"); 
//        }
//        if("00011000".equals(binario)||  "24".equals(binario)|| "CAN".equals(binario)){
//           System.out.println("Binario    = 00011000");
//            System.out.println("Decimal   = 24");
//            System.out.println("ASCII     = CAN"); 
//            System.out.println("CONTROL   = CANCELAR"); 
//        }
//        if("00011001".equals(binario)||  "25".equals(binario)|| "EM".equals(binario)){
//           System.out.println("Binario    = 00011001");
//            System.out.println("Decimal   = 25");
//            System.out.println("ASCII     = EM"); 
//            System.out.println("CONTROL   = FIN DEL MEDIO"); 
//        }
//        if("00011010".equals(binario)||  "26".equals(binario)|| "SUB".equals(binario)){
//           System.out.println("Binario    = 00011010");
//            System.out.println("Decimal   = 26");
//            System.out.println("ASCII     = SUB"); 
//            System.out.println("CONTROL   = SUSTITUCIÓN"); 
//        }
//        if("00011011".equals(binario)||  "27".equals(binario)|| "ESC".equals(binario)){
//           System.out.println("Binario    = 00011011");
//            System.out.println("Decimal   = 27");
//            System.out.println("ASCII     = ESC"); 
//            System.out.println("CONTROL   = ESCAPE"); 
//        }
//        if("00011100".equals(binario)||  "28".equals(binario)|| "FS".equals(binario)){
//           System.out.println("Binario    = 00011100");
//            System.out.println("Decimal   = 28");
//            System.out.println("ASCII     = FS"); 
//            System.out.println("CONTROL   = SEPARADOR DE ARCHIVOS"); 
//        }
//        if("00011101".equals(binario)||  "29".equals(binario)|| "GS".equals(binario)){
//           System.out.println("Binario    = 00011101");
//            System.out.println("Decimal   = 29");
//            System.out.println("ASCII     = GS"); 
//            System.out.println("CONTROL   = SEPARADOR DE GRUPOS"); 
//        }
//        if("00011110".equals(binario)||  "30".equals(binario)|| "RS".equals(binario)){
//           System.out.println("Binario    = 00011110");
//            System.out.println("Decimal   = 30");
//            System.out.println("ASCII     = RS"); 
//            System.out.println("CONTROL   = SEPARADOR DE REGISTROS"); 
//        }
//        if("00011111".equals(binario)||  "31".equals(binario)|| "US".equals(binario)){
//           System.out.println("Binario    = 00011111");
//            System.out.println("Decimal   = 31");
//            System.out.println("ASCII     = US"); 
//            System.out.println("CONTROL   = SEPARADOR DE UNIDADES"); 
//        }
//        // ECESPCION AL ORDEN 
//        if("01111111".equals(binario) ||  "127".equals(binario)|| "DEL".equals(binario)){
//           System.out.println("Binario    = 01111111");
//            System.out.println("Decimal   = 127");
//            System.out.println("ASCII     = DEL"); 
//            System.out.println("CONTROL   = SUPRIMIR"); 
//        }
//        return imprimible;
//   } 
}
