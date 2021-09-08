package codingPracticeSept7;

import java.util.Scanner;

public class RotateString{

public static void main(String []args) {
    

Scanner scanner=new Scanner(System.in);
String s= scanner.nextLine();
int k=scanner.nextInt();
char stringArray[] =s.toCharArray();
for(int i=0;i<stringArray.length;i++){
        stringArray[i]= rotate(stringArray[i], k);
}
System.out.println(stringArray+"");
scanner.close();

}
public static char rotate(char ch,int K){
 
   if(!Character.isAlphabetic(ch)){
       return ch;
   }
   char flag='A';
   if(ch>='a'){
       flag='a';
   }


    
    return (char)(((ch-flag+K)%26)+K);

}

}