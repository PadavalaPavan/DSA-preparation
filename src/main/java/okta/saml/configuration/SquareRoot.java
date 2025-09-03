package okta.saml.configuration;

public class SquareRoot {
    public static void main(String[] args) {
        square(2147395600);
    }
    public static void square(int x){
        int s = 0;
        for(int i=1;i<=x/2;i++){
            if((long)i*i <= x){
                s=i;
            }else{
                break;
            }
        }
        System.out.println(s);
        System.out.println(81/2);
    }
    public static int byBinarySearch(int num){
        if(num<2){
            return num;
        }

        //num=81,last=40,20,10,mid=20,10,5

        int start=2,last=num/2,mid=(start+last)/2;

        while(mid>num){
            if(mid*mid>num){
                last=mid;
                mid= last/2;
            }else{
                start = mid;
                mid = start + (last-start)/2;
            }
        }
        return mid;
    }
}
