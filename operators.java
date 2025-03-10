public class operators {
    public static void main(String[] args) {
        int a=5,b=10,c=6;
        System.out.println("a>b&&a<c: "+(a>b&&a<c));
        System.out.println("a<b&&a>c: "+(a<b&&a>c));
        System.out.println("a==c || b>a: "+(a==c || b>a));
        System.out.println("b>15 && c<0 || a>0: "+(b>15 && c<0 || a>0));
        System.out.println("(a/2.0==0.0 && b/2.0!=0.0) || c<0: "+((a/2.0==0.0 && b/2.0!=0.0) || c<0));
        
    }    
}
