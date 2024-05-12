import java.util.Scanner;
class WordConverter
{
    String convert(int n)
    {
        int num[]= new int[20];
        int i=0;
        String Word=new String("");
        while(n!=0){
            num[i]=n%10;
            n/=10;
            i++;
        }
        int len=i;
        boolean flag2=false,flag5=false,flag7=false,flag9=false;
        i--;

        if(len>=9)
        {
            if(num[i]!=0) {
                Word += specialCase(num[i], num[i - 1]);
                Word += " Crore";
                flag9=true;
                i--;
            }
            i--;
        }if(len>=8 && !flag9)
        {
            switch (num[i]){
                case 1: Word+=" One Crore";
                    break;
                case 2: Word+=" Two Crore";
                    break;
                case 3: Word+=" Three Crore";
                    break;
                case 4: Word+=" Four Crore";
                    break;
                case 5: Word+=" Five Crore";
                    break;
                case 6: Word+=" Six Crore";
                    break;
                case 7: Word+=" Seven Crore";
                    break;
                case 8: Word+=" Eight Crore";
                    break;
                case 9: Word+=" Nine Crore";
                    break;
            }
            i--;
        }
        if(len>=7)
        {
            if(num[i]!=0) {
                Word += specialCase(num[i], num[i - 1]);
                Word += " Lakh";
                flag7=true;
                i--;
            }
            i--;
        }
        if(len>=6 && !flag7)
        {
            switch (num[i]){
                case 1: Word+=" One Lakh";
                    break;
                case 2: Word+=" Two Lakh";
                    break;
                case 3: Word+=" Three Lakh";
                    break;
                case 4: Word+=" Four Lakh";
                    break;
                case 5: Word+=" Five Lakh";
                    break;
                case 6: Word+=" Six Lakh";
                    break;
                case 7: Word+=" Seven Lakh";
                    break;
                case 8: Word+=" Eight Lakh";
                    break;
                case 9: Word+=" Nine Lakh";
                    break;
            }
            i--;
        }
        if(len>=5)
        {
            if(num[i]!=0) {
                Word += specialCase(num[i], num[i - 1]);
                Word += " Thousand";
                flag5=true;
                i--;
            }
            i--;
        }
        if(len>=4 && !flag5)
        {
            switch (num[i]){
                case 1: Word+=" One Thousand";
                    break;
                case 2: Word+=" Two Thousand";
                    break;
                case 3: Word+=" Three Thousand";
                    break;
                case 4: Word+=" Four Thousand";
                    break;
                case 5: Word+=" Five Thousand";
                    break;
                case 6: Word+=" Six Thousand";
                    break;
                case 7: Word+=" Seven Thousand";
                    break;
                case 8: Word+=" Eight Thousand";
                    break;
                case 9: Word+=" Nine Thousand";
                    break;
            }
            i--;
        }
        if(len>=3)
        {
            switch (num[i]){
                case 1: Word+=" One Hundred";
                    break;
                case 2: Word+=" Two Hundred";
                    break;
                case 3: Word+=" Three Hundred";
                    break;
                case 4: Word+=" Four Hundred";
                    break;
                case 5: Word+=" Five Hundred";
                    break;
                case 6: Word+=" Six Hundred";
                    break;
                case 7: Word+=" Seven Hundred";
                    break;
                case 8: Word+=" Eight Hundred";
                    break;
                case 9: Word+=" Nine Hundred";
                    break;
            }
            i--;
        }
        /*if(len>2)
            Word+=" and";*/
        if(len>=2)
        {
            Word += specialCase(num[i], num[i - 1]);
            flag2=true;
        }
        if(len>=1 && !flag2)
        {
            switch (num[i]){
                case 1: Word+=" One";
                        break;
                case 2: Word+=" Two";
                        break;
                case 3: Word+=" Three";
                        break;
                case 4: Word+=" Four";
                        break;
                case 5: Word+=" Five";
                        break;
                case 6: Word+=" Six";
                        break;
                case 7: Word+=" Seven";
                        break;
                case 8: Word+=" Eight";
                        break;
                case 9: Word+=" Nine";
                        break;
                case 0: Word+=" Zero";
                    break;
            }
        }
        try {
            Word = Word.toLowerCase();
            String firstletter = Word.substring(1, 2).toUpperCase();
            Word = Word.substring(2);
            Word = firstletter + Word;
        }
        catch(Exception e){
            Word+=" Zero";
        }
        return Word;
    }
    String specialCase(int n,int m)
    {
        String Word=new String("");
        boolean flag2=false;
        {
            switch (n){
                case 1: flag2=true;
                    switch(m) {
                        case 1: Word+=" Eleven";
                            break;
                        case 2: Word+=" Twelve";
                            break;
                        case 3: Word+=" Thirteen";
                            break;
                        case 4: Word+=" Fourteen";
                            break;
                        case 5: Word+=" Fifteen";
                            break;
                        case 6: Word+=" Sixteen";
                            break;
                        case 7: Word+=" Seventeen";
                            break;
                        case 8: Word+=" Eighteen";
                            break;
                        case 9: Word+=" Nineteen";
                            break;
                    }
                    break;
                case 2: Word+=" Twenty";
                    break;
                case 3: Word+=" Thirty";
                    break;
                case 4: Word+=" Fourty";
                    break;
                case 5: Word+=" Fifty";
                    break;
                case 6: Word+=" Sixty";
                    break;
                case 7: Word+=" Seventy";
                    break;
                case 8: Word+=" Eighty";
                    break;
                case 9: Word+=" Ninety";
                    break;
            }
        }
        if(!flag2)
        {
            switch (m){
                case 1: Word+=" One";
                    break;
                case 2: Word+=" Two";
                    break;
                case 3: Word+=" Three";
                    break;
                case 4: Word+=" Four";
                    break;
                case 5: Word+=" Five";
                    break;
                case 6: Word+=" Six";
                    break;
                case 7: Word+=" Seven";
                    break;
                case 8: Word+=" Eight";
                    break;
                case 9: Word+=" Nine";
                    break;
            }
        }
        Word=Word.toLowerCase();
        return Word;
    }
}
public class Num_to_Word {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        WordConverter C= new WordConverter();
        System.out.println("Enter the value in number: ");
        int num= sc.nextInt();
        System.out.println(num+" in Words -   "+ C.convert(num) + " /- Only");
    }
}
