class patterns{
    public static void main(String[] args) {
        // 0 0 0 0
        // 1 1 1 1
        // 2 2 2 2
        // 3 3 3 3
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(i+"\t");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // 0 1 2 3
        // 1 2 3 4
        // 2 3 4 5
        // 3 4 5 6
        for(int i=0;i<4;i++){
            for(int j=i;j<i+4;j++){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // * * * *
        // * * *
        // * *
        // *
        for (int i = 0; i < 4; i++) {
            for(int j=i;j<4;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // 1 2 3 4
        // 4 3 2
        // 3 4 
        // 4
        for(int i=1;i<5;i++){
            for(int j=i;j<5;j++){
                System.out.print(j+"\t");
            }
            System.out.println();
            for(int j=4;j>i;j--){
                System.out.print((j)+"\t");
            }
            System.out.println();
            i++;
        }
        
    }
}