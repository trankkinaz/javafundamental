/*
Forum Topik-5
Budi Sutiarso - 2402003881
*/
package forum;

public class t5No2Repetiion {
    public static void main(String[] args) {
        String o="";
        z:
        for(int x=0;x<3;x++){
            for(int y=0;y<2;y++){
                if(x==1)break ;
                if(x==2 && y==1)break z;
                o=o+x+y;
            }
        }
        System.out.println(o);
    }
}
