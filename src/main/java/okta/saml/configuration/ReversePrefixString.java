package okta.saml.configuration;

public class ReversePrefixString {
    public static void main(String[] args) {/*
    String value = "abcdefd";
    char ch = 'd';
    int index=0;
    for(int i=0;i<value.length()-1;i++){
        if(value.charAt(i)==ch){
            index=i;
            break;
        }
    }
       String substring = value.substring(0,index+1);
    StringBuilder rev= new StringBuilder();
        for(int i=substring.length()-1;i>=0;i--){
            rev.append(substring.charAt(i));
        }

        System.out.println(rev.append(value.substring(index+1)));*/
    }

    public String reversePrefix(String word, char ch) {
        int index=0;
        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i)==ch){
                index=i;
                break;
            }
        }
        String substring = word.substring(0,index+1);
        StringBuilder rev= new StringBuilder();
        for(int i=substring.length()-1;i>=0;i--){
            rev.append(substring.charAt(i));
        }

        return rev.append(word.substring(index+1)).toString();
    }
}
