package forum;

public class w3DoraNobi {
    public static void main(String[] args){
        int doraemon=10;
        int nobita=5;
        int sizuka=50;

        if(doraemon==11 & nobita ++==5){
            nobita++;
        }
        if (++sizuka==50 | doraemon++ ==11 | doraemon++ == 12 | doraemon++ ==13 | doraemon++ ==14){
            sizuka++;
        }
        if(++doraemon==14 | doraemon++ ==15 & nobita++ == 6 & doraemon==13){
            doraemon++;
        }
        System.out.println("doraemon: " + doraemon);
        System.out.println("nobita: " + nobita);
        System.out.println("sizuka: " + sizuka);
        System.out.println(doraemon+nobita+sizuka);
    }
}
