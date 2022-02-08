package etc;

public class testPadTable {
    public static String rPad(String text,int textLength){
        return String.format("%"+(-textLength)+"s",text);
    }
    public static void refreshBoard(){
        String cval="?";
        //draw table header
        System.out.println("[ 1/2/3/4/5/6/7/8/9 ]: ");
        System.out.println("-----------------");
        System.out.println("    1 | O | 3  ");
        System.out.println("   -----------  ");
        System.out.println("    4 | X | 6  ");
        System.out.println("   -----------  ");
        System.out.println("    7 | 8 | 9  ");
        System.out.println("-----------------");
//        for(int i=0;i<3;++i){
//
//        }
    }

    public static void main(String[] args) {

      refreshBoard();

    }
}
