package loops;

public class FindFirstMultiple {
    public int findFirstMultiple(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) { // ilk 5'e bölünen sayı bulduğunda return et.
                return i;
            }
        }
        return -1; // Her türlü int döndürmemiz lazım, ilk return dönerse zaten blok duracak.
    }


    public static void main(String[] args) {
        FindFirstMultiple obj = new FindFirstMultiple();
        System.out.println(obj.findFirstMultiple(10));
    }
}
