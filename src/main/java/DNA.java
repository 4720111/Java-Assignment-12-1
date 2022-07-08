
/**
 * クラス DNA の注釈をここに書きます.
 * 
 * @author (片岡小雪)
 * @version (2022/07/08)
 */
public class DNA {
    String str = "";
    String str1 = "";
    public String getPair(){
        for(int i = 0;i<this.str.length();i++){
            switch(str.charAt(i)){
                case 'A': str1 += "T";
                break;
                case 'T': str1 += "A";
                break;
                case 'C': str1 += "G";
                break;
                case 'G': str1 += "C";
                break;
            }
        }
        return str1;
    }
}
