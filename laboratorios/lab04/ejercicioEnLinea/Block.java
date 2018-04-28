import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Extraido de:
 * https://github.com/AhmedHani/Online-Judges-Problems-SourceCode/blob/master/UVa/101%20-%20The%20Blocks%20Problem.java
 */
public class Block{
    public static int NumberBlocks;
    public static Stack<Integer> Blocks[];
    public static int Position[];
    public static String Line; 
    public static int A, B;
    
    public static void main(String[] args) throws IOException{
        BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
        NumberBlocks = Integer.parseInt(Input.readLine());
        Blocks = new Stack[NumberBlocks];
        Position = new int[NumberBlocks];
        for(int i = 0; i < NumberBlocks; i++) {
            Blocks[i] = new Stack<Integer>();
            Blocks[i].push(i);
            Position[i] = i;
        }
        //for(int i = 0; i < NumberBlocks; i++) {
            
        //}
        Line = "";
        while(!(Line = Input.readLine()).equals("quit")) {
            StringTokenizer token = new StringTokenizer(Line);
            String First = token.nextToken();
            A = Integer.parseInt(token.nextToken());
            String Second = token.nextToken();
            B = Integer.parseInt(token.nextToken());
            
            if(A == B || Position[A] == Position[B]) continue;
            if(First.equals("move")) {
                if(Second.equals("onto")) {
                    MoveOnto(A, B);
                } else if(Second.equals("over")) {
                    MoveOver(A, B);
                }
            } else if(First.equals("pile")) {
                if(Second.equals("onto")) {
                    PileOnto(A, B);
                } else if(Second.equals("over")) {
                    PileOver(A, B);
                }
            }
        }
        for(int i = 0; i < Blocks.length; i++) System.out.println(Solve(i));
    }
    public static void MoveOnto(int First, int Second) {
       ClearAbove(Second);              //(log*n)^2*m
       MoveOver(First, Second);         //(log*n)^2*m
    }
    public static void MoveOver(int First, int Second) {   
       ClearAbove(First);                                               //(log*n)^2*m
       Blocks[Position[Second]].push(Blocks[Position[First]].pop());    //c
       Position[First] = Position[Second];                              //c*p
    }
    public static void PileOnto(int First, int Second) {
       ClearAbove(Second);              //(log*n)^2*m
       PileOver(First, Second);         //2log*n*m
    }
    public static void PileOver(int First, int Second) {
       Stack<Integer> Pile = new Stack<Integer>();              //c
       while(Blocks[Position[First]].peek() != First) {         //c*log*n*m
           Pile.push(Blocks[Position[First]].pop());            //c
       }
       Pile.push(Blocks[Position[First]].pop());                //c
       while(!Pile.isEmpty()) {                                 //c*log*n*m
          int Tmp = Pile.pop();                                 //c
          Blocks[Position[Second]].push(Tmp);                   //c
          Position[Tmp] = Position[Second];                     //c
       }
    }
    public static void ClearAbove(int Block) {
        while(Blocks[Position[Block]].peek() != Block) {    //c*log*n*m
           Intial(Blocks[Position[Block]].pop());           //c*log*n
        }
    }
    public static void Intial(int Block) {   
        while(!Blocks[Block].isEmpty()) {       //c*log*n*m
           Intial(Blocks[Block].pop());         //c
        }
        Blocks[Block].push(Block);              //c
        Position[Block] = Block;                //c
    }
    public static String Solve(int Index) {
        String Result = "";                                 //c
        while(!Blocks[Index].isEmpty()){                    //c*log*n
            Result = " " + Blocks[Index].pop() + Result;}   //c
        Result = Index + ":" + Result;                      //c
        return Result;                                      //c
    }

}
