public class revearr {
    public static void main(String[] args) {
        int[]marks;
        marks=new int[5];
        marks[0]=90;
        marks[1]=45;
        marks[2]=56;
        marks[3]=8;
        marks[4]=78;
        //System.out.println(marks[3]);
        //System.out.println(marks.length);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println(" Reverse order");

        for(int j=marks.length-1;j>=0;j--){
            System.out.println(marks[j]);
        }
        


    }
    
}
