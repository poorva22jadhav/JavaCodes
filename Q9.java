class program8{
          public static void main(String args[]){
          int Num=10; char ch='I';

           for(int i=1;i<=4;i++){
                    int N=Num; int char1=ch;

                          for(int j=1;j<=i;j++){
                               if(i%2==1){
                                     System.out.print(N +" ");
                                      N--;
                                 }

                               else{
                                  System.out.print(char1 + " ");
                                   char1--;}}
                               
                               System.out.println();

                               Num=Num-3;
                               ch--;
                               ch--; 
                               ch--; } } }                            