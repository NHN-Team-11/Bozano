public class ClientEncryptedText {
    public static void main(String[] args) {
        EncryptedText t = new EncryptedText("Nel mezzo del cammin di ...", 10);
        System.out.println(t.getEncryptedText());
        System.out.println(t.getDecryptedText(10));
        t.setKey(10, 20);
        System.out.println(t.getDecryptedText(10));
        System.out.println(t.getDecryptedText(20));
    }
}
