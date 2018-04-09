import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
/**
 * Extraido de:
 * https://apps.topcoder.com/forums/?module=Thread&threadID=793169&start=0&mc=3
 * 
 */
 public class BrokenKeyboard
{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c, pos = 0;
        boolean home = false;
        LinkedList<Character> list = new LinkedList<Character>();
        Iterator<Character> it;
        while ((c = br.read()) != -1) {
            if (c == '\n') {
                it = list.iterator();
                while (it.hasNext()) {
                    System.out.printf("%c", list.poll());
                }
                System.out.printf("\n");
                list = new LinkedList<Character>();
                home = false;
                pos = 0;
            } else if (c == '[') {
                home = true;
                pos = 0;
            } else if (c == ']') {
                home = false;
            } else if (home) {
                list.add(pos++, (char) c);
            } else {
                list.add((char) c);
            }
        }
    }
}
