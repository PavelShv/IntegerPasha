public class BitOperations {

// битовая операция НЕ
    public static void main(String[] args) {
        int var = 121;  //двоичный вид: 00000000 00000000 00000000 01111001
        int not_v = ~var; //результат:  11111111 11111111 11111111 10000110 (число -122)
        System.out.println(not_v);

        //Битовая операция И
      byte flags = 5;  //двоичный вид:  00000101
        byte mask = 4; //двоичный вид:  00000100
        int res = flags&mask;
        System.out.println(res);

        //Битовая операция ИЛИ
    byte flags1 = 8;  //двоичный вид:  00001000
    byte mask1 = 5;   //двоичный вид:  00000101
    flags1 = (byte)(flags1 | mask1);   //двоичная запись 00001101 (число 13)
 System.out.println(flags1);

//Битовая операция исключающее ИЛИ (XOR)
    byte flags2 = 9;  //двоичный вид:  00001001
    byte mask2 = 1;   //двоичный вид:  00000001
    flags2 = (byte)(flags2 ^ mask2);     //двоичная запись 00001000 (число 8)
System.out.println(flags2);
    flags2 ^= mask;    //двоичная запись 00001001 (число 9)
System.out.println(flags2);
/// Шифрование через XOR
        String msg = "Кеша хороший";
        byte key = 111;
        System.out.println(msg);
        char[] str = msg.toCharArray();
        for(int i=0;i < msg.length();++i)
            str[i] ^= key;
        msg = new String(str);
        System.out.println(msg);
        for(int i=0;i < msg.length();++i)
            str[i] ^= key;
        msg = new String(str);
        System.out.println(msg);

        //Операторы смещения бит
        int x = 2000;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);

    }
}