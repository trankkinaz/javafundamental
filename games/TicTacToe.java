package games;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    pseudo:
    game play: player vs player, player vs computer
    store filled board in Array
    store available pos in arraylist -> decrease as play along
    (ง '̀-'́)ง
   */
public class TicTacToe {
    static ArrayList<String> board= new ArrayList<>();
    static ArrayList<Integer> boardOption=new ArrayList<>();
    static Scanner input=new Scanner(System.in);

   public static void initBoard(){
        //initialize board
        board= new ArrayList<>(List.of("1","2","3","4","5","6","7","8","9"));
        boardOption= new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
    }

    public static void updBoard(Integer elm,String player){
       //process value from user input then convert into index based
       board.set(elm-1,player);
       boardOption.remove(elm);//remove used cell from option
    }

    public static Integer comPlay() {
        System.out.print("Komputer lagi mikir {•̃_•̃}");
        //delay 5 seconds
        for(int i = 0; i< 5; i++) {
            try {
                Thread.sleep(800);
            } catch(Exception e) {
                System.out.println("Exception : "+e.getMessage());
            }
            System.out.print(".");
        }
        //random pick from avail board option
        System.out.println("");//empty line to avoid scanner catching prev line
        int pick =(int)(Math.random()*boardOption.size());
        return boardOption.get(pick);
    }

    public static void printBoard(){
        System.out.println("==================");
        System.out.println("+  TIC-TAC-TOE  +");
        System.out.println("-----------------");
        System.out.println(String.format("    %1$s | %2$s | %3$s  ",board.get(0),board.get(1),board.get(2)));
        System.out.println("   -----------  ");
        System.out.println(String.format("    %1$s | %2$s | %3$s  ",board.get(3),board.get(4),board.get(5)));
        System.out.println("   -----------  ");
        System.out.println(String.format("    %1$s | %2$s | %3$s  ",board.get(6),board.get(7),board.get(8)));
        System.out.println("-----------------");
    }

   public static Integer getUserInput(Boolean isPlaying, String msgPrompt){
       int key=0;//default exit
       boolean isValid=false;//default
        try{
            //sanitize user input
            //loop until user entry valid number
            System.out.print(msgPrompt);
            key=Integer.parseInt(input.nextLine());
            if(key==0){
                return 0;
            }
            if(isPlaying){
                //validate vs available board option
                isValid=boardOption.contains(key);
            }else{
                //valid only: 0,1,2
                isValid= ((key<3)? true: false);
            }
        }catch (Exception e){
            isValid=false;
        }
        if(isValid){
            return key;
        }else{
            System.out.println("Invalid Input");
            return getUserInput(isPlaying,msgPrompt);
        }
   }
   public static String getBoardOption(){
       return boardOption.toString().replace(", ","/");
   }

   public static String getGameStatus(){
       //check all combination cell
       //----------------> row combination  | col combination| diagonal
       String cellIdxList="0,1,2;3,4,5;6,7,8;0,3,6;1,4,7;2,5,8;0,4,8;2,4,6";
       String chk="";
       for (String row:cellIdxList.split(";")) {
           chk="";
           for (String rowCell:row.split(",")) {
               chk +=board.get(Integer.parseInt(rowCell));
           }
           if(chk.equals("XXX"))return "x";
           if(chk.equals("OOO"))return "o";
       }
       //draw: if no winner and boardoptions is empty
       if(boardOption.isEmpty()){
           return "draw";
       }else{
           //otherwise keep playing
           return null;
       }
   }

    public static void main(String[] args) {
        Boolean isContinue=true;
        while (isContinue){
            initBoard();
            String gameResult=null;
            int mode=0;
            System.out.println("(ᵔᴥᵔ) AYO MAIN TIC-TAC-TOE {•̃_•̃}");
            System.out.println("Mode Permainan:");
            System.out.println("1. Player vs Player");
            System.out.println("2. Player vs Komputer");
            System.out.println("0 to exit (._.)");
            System.out.println("-".repeat(25));
            mode=getUserInput(false,"Pilih Mode [1/2]: ");
            if(mode==0) break;
            //start play
            System.out.println(" .:. ".repeat(5));
            System.out.println(((mode==1)? "Player (x) vs Player (o)":"Player (x) vs Komputer (o)"));
            while (gameResult==null){
                //loop play when no winner and board option avail
                int key=0;
                printBoard();
                //player1
                System.out.println("Pilihan: "+ getBoardOption());
                key=getUserInput(true,"Input Player (x): ");
                if(key==0)break;
                updBoard(key,"X");
                printBoard();
                gameResult=getGameStatus();
                if(gameResult!= null)break;
                //player2
                System.out.println("Pilihan: "+ getBoardOption());
                if(mode==1){
                    key=getUserInput(true,"Input Player (o): ");
                    if(key==0)break;
                }else {
                    key=comPlay();
                }
                updBoard(key,"O");
                printBoard();
                gameResult=getGameStatus();
            }

            if(gameResult!=null){
                System.out.println("*".repeat(25));
                if(gameResult.equals("draw")){
                    System.out.println("(ง '̀-'́)ง Woahh its a Draw!!!");
                }else{
                    System.out.println(" Player "+gameResult.toUpperCase() +" Menang!!!");
                    System.out.println(" Nice Game ᕦ(ò_óˇ)ᕤ ");
                }
                System.out.println("*".repeat(25));

                isContinue=false;
                System.out.print(" ʘ‿ʘ Play Again ? [y/n] : ");
                String retry=input.nextLine();
                if(retry.toLowerCase().equals("y")){
                    isContinue=true;
                }
            }
        }
        System.out.println("-".repeat(25));
        System.out.println(" .:. Good Bye ヽ(´▽`)/ .:.");
    }
}
