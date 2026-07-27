package While;

public class AreAllDigitsSameWhile {
        public boolean areAllDigitsSameWhile(int number) {
            int referenceDigit = number % 10; // referans numarasını kendinle karşılaştırmak istemiyorsan silebilirsin bir sonraki satırda ama çok gerekli değil
            while (number > 0) {
                int nextDigit = number % 10;
                number /= 10;
                    if (referenceDigit != nextDigit) return false;
                }
            return true;
        }


    static void main(String[] args) {
        AreAllDigitsSameWhile obj = new AreAllDigitsSameWhile();
        System.out.println(obj.areAllDigitsSameWhile(2111));
    }
}
